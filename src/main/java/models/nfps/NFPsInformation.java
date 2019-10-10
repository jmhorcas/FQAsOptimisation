package models.nfps;

import java.util.List;
import java.util.Map;
import uma.caosd.FQAsArchitecture.UsageContext;

public class NFPsInformation {
	private static Map<String, FQAInformation> information = Map.of(
			"Logging", new FQAInformationFromCSV("NFPsFiles/NFPs-logging.csv", LoggingConfigurationInfo.class),
			"Encryption", new FQAInformationFromCSV("NFPsFiles/NFPs-encryption.csv", EncryptionConfigurationInfo.class),
			"Compression", new FQAInformationFromCSV("NFPsFiles/NFPs-compression-fake.csv", CompressionConfigurationInfo.class)
			);;
		
	public static double getEnergyConsumption(String fqaName, int configurationID, UsageContext uc) {
		assert configurationID >= 0;
		
		if (!information.containsKey(fqaName)) {
			return Double.MAX_VALUE;
		}
		
		List<FQAConfigurationInfo> configurations = information.get(fqaName).getConfigurations();
		if (configurationID >= configurations.size()) {
			return Double.MAX_VALUE;
		}
		
		FQAConfigurationInfo config = configurations.get(configurationID);
		try {
			config = information.get(fqaName).getConfiguration(configurationID, uc);
		} catch (NullPointerException e) {
			System.out.println("Usage context: " + uc + " and configuration " + configurationID + " do not match.");
		}
		System.out.println("Config: " + configurationID + ". " + config.toString() + ". " + config.getEnergyConsumption() + "J.");
		return config.getEnergyConsumption();
	}
	
	public static double getExecutionTime(String fqaName, int configurationID, UsageContext uc) {
		assert configurationID >= 0;
		
		if (!information.containsKey(fqaName)) {
			return Double.MAX_VALUE;
		}
		
		List<FQAConfigurationInfo> configurations = information.get(fqaName).getConfigurations();
		if (configurationID >= configurations.size()) {
			return Double.MAX_VALUE;
		}
		
		FQAConfigurationInfo config = configurations.get(configurationID);
		try {
			config = information.get(fqaName).getConfiguration(configurationID, uc);
		} catch (NullPointerException e) {
			System.out.println("Usage context: " + uc + " and configuration " + configurationID + " do not match.");
		}
		
		System.out.println("Config: " + configurationID + ". " + config.toString() + ". " + config.getComputationTime() + "ms.");
		return config.getComputationTime();
	}
	
	public static UsageContext getUsageContext(String fqaName, int configurationID) {
		assert configurationID >= 0;
		
		List<FQAConfigurationInfo> configurations = information.get(fqaName).getConfigurations();
		if (configurationID >= configurations.size()) return null;
		
		FQAConfigurationInfo config = configurations.get(configurationID);
		
		return config.getUsageContext();
	}
	
	public static List<FQAConfigurationInfo> getConfigurations(String fqaName) {
		return information.get(fqaName).getConfigurations();
	}
	
	/*
	public static void main(String[] args) {
		try {
			NFPsInformation i = new NFPsInformation();
			for (FQAConfigurationInfo f : i.getLogging()) {
				System.out.println(f.getConfiguration() + " -> " + f.getEnergyConsumption());
			}
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	*/
}
