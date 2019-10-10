package models.nfps;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

import models.utils.Utils;
import uma.caosd.FQAsArchitecture.UsageContext;

public class FQAInformationFromCSV implements FQAInformation {
	private String csvFile;
	private List<FQAConfigurationInfo> configurations;
	
	public <T extends FQAConfigurationInfo> FQAInformationFromCSV(String filename, Class<T> classFQA) {
		this.csvFile = filename;
		try {
			configurations = readCSV(this.csvFile, classFQA);
		} catch (IllegalStateException e) {
			configurations =  new ArrayList<FQAConfigurationInfo>();
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			configurations = new ArrayList<FQAConfigurationInfo>();
			e.printStackTrace();
		}
	}
	
	@Override
	public List<FQAConfigurationInfo> getConfigurations() {
		return this.configurations;
	}
	
	private <T extends FQAConfigurationInfo> List<FQAConfigurationInfo> readCSV(String filename, Class<T> classFQA) throws IllegalStateException, FileNotFoundException {
		List<FQAConfigurationInfo> info = new ArrayList<FQAConfigurationInfo>();
		String filepath = getClass().getClassLoader().getResource(this.csvFile).getFile();
		info = new CsvToBeanBuilder<FQAConfigurationInfo>(new FileReader(filepath))
				.withType(classFQA)
				.withSeparator(',')
				.withSkipLines(1)
				.build()
				.parse();
		return info;
	}

	@Override
	public FQAConfigurationInfo getConfiguration(int id, UsageContext uc) {
		FQAConfigurationInfo config = configurations.get(id);
//		System.out.println(config.getConfiguration());
//		List<FQAConfigurationInfo> cc = configurations.stream().filter(c -> c.getConfiguration().equals(config.getConfiguration())).collect(Collectors.toList());
//		System.out.println(cc.size());
//		Utils.printUsageContext(uc);
//		System.out.println("-----");
//		cc.forEach(m -> System.out.println(m.getConfiguration()));
//		cc.forEach(m -> Utils.printUsageContext(m.getUsageContext()));
//		List<FQAConfigurationInfo> ccc = cc.stream().filter(c -> Utils.equalsUsageContext(c.getUsageContext(), uc)).collect(Collectors.toList());
//		System.out.println(ccc.size());
		
		return configurations.stream()
			.filter(c -> c.getConfiguration().equals(config.getConfiguration()))
			.filter(c -> Utils.equalsUsageContext(c.getUsageContext(), uc))
			.findFirst()
			.get();
	}
}
