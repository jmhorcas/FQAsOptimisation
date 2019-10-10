package models.nfps;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

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
}
