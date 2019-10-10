package models.constraints;

import org.eclipse.emf.common.util.EList;

import models.nfps.NFPsInformation;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.IGuidanceFunction;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.interpreter.guidance.Solution;
import uma.caosd.FQAsArchitecture.FQA;
import uma.caosd.FQAsArchitecture.FQAsArchitectureModel;

public class ValidConfigurations implements IGuidanceFunction {
	
	@Override
	public double computeFitness(Solution model) {
		EList<FQA> fqas = ((FQAsArchitectureModel) model.getModel()).getFqas();
		
		int res = fqas.size();
		for (FQA c : fqas) {
			String name = c.getName();
			int id = c.getConfiguration().getId();
			if (id < NFPsInformation.getConfigurations(name).size()) {
				res--;
			}
		}
		System.out.println("Valid FQAs': " + (fqas.size() - res) + "/" + fqas.size());
		return res;		
	}

	@Override
	public String getName() {
		return "Valid configurations (configuration ID < number of existing configurations with NFPs information).";
	}

}
