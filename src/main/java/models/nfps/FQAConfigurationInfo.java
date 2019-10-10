package models.nfps;

import uma.caosd.FQAsArchitecture.UsageContext;

public interface FQAConfigurationInfo {

	public double getEnergyConsumption();
	
	public double getComputationTime();
	
	/**
	 * 
	 * @return Representation of the configuration (parameters' values).
	 */
	public String getConfiguration();
	
	public UsageContext getUsageContext();
	
	public UsageContext getModifiedUsageContext();
}
