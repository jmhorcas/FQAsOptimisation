package models.fitness;

import models.utils.Utils;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.IGuidanceFunction;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.interpreter.guidance.Solution;
import uma.caosd.FQAsArchitecture.FQAsArchitectureModel;
import uma.caosd.FQAsArchitecture.Joinpoint;

public class MaximiseApplicationOfFQAs implements IGuidanceFunction {

	@Override
	public double computeFitness(Solution model) {
		Utils.printModel((FQAsArchitectureModel) model.getModel());
		System.out.println(model.getTransformationsChain());
		
		int res = 0;
		FQAsArchitectureModel fqaModel = (FQAsArchitectureModel) model.getModel();
		for (Joinpoint jp : fqaModel.getJoinpoints()) {
			res += jp.getFqas().size();
		}
		System.out.println("Applications of FQAs: " + res);
		return res * -1d;
	}

	@Override
	public String getName() {
		return "Maximise FQAs";
	}

}
