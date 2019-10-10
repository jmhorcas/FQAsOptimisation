package models.utils;

import java.util.List;
import java.util.Random;

import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.interpreter.evolvers.parameters.IEvolverParametersFunction;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.interpreter.guidance.Solution;

public class MyRandom implements IEvolverParametersFunction {
	private static Random random = new Random();
	
	// mutate using <FQAsEvolvers.henshin> unit "changeConfiguration" parameters {delta => "models.constraints.MyRandom"}
	
	@Override
	public Object sample(List<Solution> solutions) {
		return random.nextInt(2) - 1;
	}

}
