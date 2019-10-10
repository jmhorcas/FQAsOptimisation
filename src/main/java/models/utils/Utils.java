package models.utils;

import java.util.List;
import java.util.Map;

import uma.caosd.FQAsArchitecture.FQA;
import uma.caosd.FQAsArchitecture.FQAsArchitectureFactory;
import uma.caosd.FQAsArchitecture.FQAsArchitectureModel;
import uma.caosd.FQAsArchitecture.UsageContext;
import uma.caosd.FQAsArchitecture.Variable;

public class Utils {

	public static UsageContext generateUsageContext(Map<String, Integer> variables) {
		FQAsArchitectureFactory factory = FQAsArchitectureFactory.eINSTANCE;
		
		UsageContext uc = factory.createUsageContext();
		
		for (String v : variables.keySet()) {
			Variable var = factory.createVariable();
			var.setName(v);
			var.setValue(variables.get(v));
			
			uc.getVariables().add(var);
		}
		return uc;
	}
	
	/**
	 * NOTE: a better implementation is to implement the equals methods of Variable and UsageContext classes,
	 * but that classes' code is automatically generated from the .ecore. 
	 * Do it at the end when no more modifications of the metamodel are needed. 
	 * 
	 * @param uc1
	 * @param uc2
	 * @return
	 */
	public static boolean equalsUsageContext(UsageContext uc1, UsageContext uc2) {
		if (uc1 == null || uc2 == null) return false;
		
		List<Variable> vars1 = uc1.getVariables();
		List<Variable> vars2 = uc2.getVariables();
		
		if (vars1.size() != vars2.size()) return false;
		
		for (Variable v1 : vars1) {
			boolean match = vars2.stream()
					.anyMatch(v2 -> v1.getName().equalsIgnoreCase(v2.getName()) && v1.getValue() == v2.getValue());
			if (!match) return false;
		}
		return true;
	}
	
	public static void printModel(FQAsArchitectureModel model) {
		String modelID = model.toString().substring(model.toString().lastIndexOf('@'));
		
		String str = "Model_" + modelID + ": [";
		
		if (!model.getFqas().isEmpty()) {
			for (FQA c : model.getFqas()) {
				String fqaString = c.getName() + c.getConfiguration().getId();
				fqaString += ": "; 
				fqaString += c.getAppliesOver().size() + " jps.";
				
				str += fqaString + "; ";
			}
			str = str.substring(0, str.length()-2);
		}
		
		str += "]";
		System.out.println(str);
	}
	
	/*
	public static void main(String[] args) {
		EPackage.Registry.INSTANCE.put(FQAsArchitecturePackage.eNS_URI, FQAsArchitecturePackage.eINSTANCE);
		//Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(FQAsArchitecturePackage.FILE_EXTENSION, FQAsArchitecturePackage.Factory.INSTANCE);
		
	}*/
}
