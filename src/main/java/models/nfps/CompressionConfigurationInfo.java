package models.nfps;

import java.util.Map;
import com.opencsv.bean.CsvBindByPosition;

import models.utils.Utils;
import uma.caosd.FQAsArchitecture.UsageContext;

public class CompressionConfigurationInfo implements FQAConfigurationInfo {

	@CsvBindByPosition(position = 0)
	private int ucMessageSize;
	
	@CsvBindByPosition(position = 4)
	private int himucMessageSize;
	
	@CsvBindByPosition(position = 1)
	private String algorithm;
	
	@CsvBindByPosition(position = 2)
	private double nfpEnergyConsumption;
	
	@CsvBindByPosition(position = 3)
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
		return "(" + algorithm + ")";
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
		return "Compression [Usage Context: (message size=" + ucMessageSize + "), "
				+ "Config: (" + this.getConfiguration() + "), "
				+ "NFPs: (Energy consumption=" + nfpEnergyConsumption + ", Computation time=" + nfpComputationTime + ")]";
	}
	
	
}
