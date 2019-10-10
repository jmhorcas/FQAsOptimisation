package models.nfps;

import java.util.List;

import uma.caosd.FQAsArchitecture.UsageContext;

public interface FQAInformation {
	public List<FQAConfigurationInfo> getConfigurations();
	/**
	 * Given a configuration id and a usage context return the same configuration that meets the usage context.
	 * 
	 * @param id
	 * @param uc
	 * @return
	 */
	public FQAConfigurationInfo getConfiguration(int id, UsageContext uc);
}