package models.fitness;

import org.eclipse.emf.common.util.EList;

import models.nfps.NFPsInformation;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.IGuidanceFunction;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.interpreter.guidance.Solution;
import uma.caosd.FQAsArchitecture.FQA;
import uma.caosd.FQAsArchitecture.FQAsArchitectureModel;
import uma.caosd.FQAsArchitecture.Joinpoint;

public class MinimiseEnergyConsumption implements IGuidanceFunction {
	
	@Override
	public double computeFitness(Solution model) {
		EList<FQA> fqas = ((FQAsArchitectureModel) model.getModel()).getFqas();
		
		double totalEnergyConsumption = 0.0;
		for (FQA c : fqas) {
			String name = c.getName();
			int id = c.getConfiguration().getId();
			
			for (Joinpoint jp : c.getAppliesOver()) {
				totalEnergyConsumption += NFPsInformation.getEnergyConsumption(name, id, jp.getUsagecontext());	
			}
		}
		return totalEnergyConsumption;	
	}

	@Override
	public String getName() {
		return "Minimise energy consumption.";
	}
}
