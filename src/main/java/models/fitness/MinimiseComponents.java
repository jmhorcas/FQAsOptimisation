package models.fitness;

import org.eclipse.emf.common.util.EList;

import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.IGuidanceFunction;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.interpreter.guidance.Solution;
import uma.caosd.FQAsArchitecture.FQA;
import uma.caosd.FQAsArchitecture.FQAsArchitectureModel;

public class MinimiseComponents implements IGuidanceFunction {

	@Override
	public double computeFitness(Solution model) {
		EList<FQA> fqas = ((FQAsArchitectureModel) model.getModel()).getFqas();
		return fqas.size();
	}

	@Override
	public String getName() {
		return "Minimise number of components";
	}

}
