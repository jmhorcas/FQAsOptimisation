package models.constraints;

import org.eclipse.emf.common.util.EList;

import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.IGuidanceFunction;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.interpreter.guidance.Solution;
import uma.caosd.FQAsArchitecture.FQAsArchitectureModel;
import uma.caosd.FQAsArchitecture.Joinpoint;

public class CoverAllJoinpoints implements IGuidanceFunction {
	
	@Override
	public double computeFitness(Solution model) {
		EList<Joinpoint> joinpoints = ((FQAsArchitectureModel) model.getModel()).getJoinpoints();
		
		int res = joinpoints.size();
		for (Joinpoint jp : joinpoints) {
			if (!jp.getFqas().isEmpty()) {
				res--;
			}
		}
		System.out.println("Joinpoints covered: " + (joinpoints.size() - res) + "/" + joinpoints.size());
		return res;	
	}

	@Override
	public String getName() {
		return "Each joinpoint has to be at least one FQAs applied.";
	}

}
