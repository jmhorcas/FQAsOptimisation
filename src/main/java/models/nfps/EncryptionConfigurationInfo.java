package models.nfps;

import java.util.Map;
import com.opencsv.bean.CsvBindByPosition;

import models.utils.Utils;
import uma.caosd.FQAsArchitecture.UsageContext;

public class EncryptionConfigurationInfo implements FQAConfigurationInfo {

	@CsvBindByPosition(position = 0)
	private int ucMessageSize;
	
	private int himucMessageSize = 0;
	
	@CsvBindByPosition(position = 1)
	private String paramFramework;
	
	@CsvBindByPosition(position = 2)
	private String paramAlgorithm;
	
	@CsvBindByPosition(position = 3)
	private String paramKeySize;
	
	@CsvBindByPosition(position = 4)
	private String paramMode;
	
	@CsvBindByPosition(position = 5)
	private String paramPadding;
	
	@CsvBindByPosition(position = 6)
	private double nfpEnergyConsumption;
	
	@CsvBindByPosition(position = 7)
	private double nfpComputationTime;

	@Override
	public double getEnergyConsumption() {
		return nfpEnergyConsumption;
	}

	@Override
	public double getComputationTime() {
		return nfpComputationTime;
	}

	@Override
	public String getConfiguration() {
		return "(" + paramFramework + ", " + paramAlgorithm + ", " + paramKeySize + ", " + paramMode + ", " + paramPadding + ")";
	}

	@Override
	public UsageContext getUsageContext() {
		return Utils.generateUsageContext(Map.of("messageSize",ucMessageSize));
	}

	@Override
	public UsageContext getModifiedUsageContext() {
		return Utils.generateUsageContext(Map.of("messageSize",himucMessageSize));
	}

	@Override
	public String toString() {
		return "Encryption [Usage Context: (message size=" + ucMessageSize + "), "
				+ "Config: (" + this.getConfiguration() + "), "
				+ "NFPs: (Energy consumption=" + nfpEnergyConsumption + ", Computation time=" + nfpComputationTime + ")]";
	}
	
	
}
