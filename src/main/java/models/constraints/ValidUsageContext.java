package models.constraints;

import org.eclipse.emf.common.util.EList;

import models.nfps.NFPsInformation;
import models.utils.Utils;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.IGuidanceFunction;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.interpreter.guidance.Solution;
import uma.caosd.FQAsArchitecture.FQA;
import uma.caosd.FQAsArchitecture.FQAsArchitectureModel;
import uma.caosd.FQAsArchitecture.UsageContext;

public class ValidUsageContext implements IGuidanceFunction {
	
	@Override
	public double computeFitness(Solution model) {
		EList<FQA> fqas = ((FQAsArchitectureModel) model.getModel()).getFqas();
		
		int totalApplications = 0;
		int correctUsageContexts = 0;
		for (FQA c : fqas) {
			String name = c.getName();
			int id = c.getConfiguration().getId();
			UsageContext fqaUC = NFPsInformation.getUsageContext(name, id);
			totalApplications += c.getAppliesOver().size();
			
			correctUsageContexts += c.getAppliesOver().stream().filter(jp -> Utils.equalsUsageContext(jp.getUsagecontext(), fqaUC)).count();
			
			/*
			for (Joinpoint jp : c.getAppliesOver()) {
				UsageContext jpUC = jp.getUsagecontext();
				if (Utils.equalsUsageContext(fqaUC, jpUC)) {
					correctUsageContexts++;
				}
			}
			*/
		}
		System.out.println("Valid applications based on usage contexts: " + (correctUsageContexts) + "/" + totalApplications);
		return totalApplications - correctUsageContexts;		
	}

	@Override
	public String getName() {
		return "Configurations of FQAs match the usage contexts of the joinpoints.";
	}

}
