package Helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author garimabhanot
 * This class reads data from text file
 *
 */
public class ReadFromTextFile {

	//variable declarations
	String filePath = System.getProperty("user.dir") + 
			File.separatorChar + "src" + File.separatorChar+ "test" + File.separatorChar + 
			"java" + File.separatorChar+ "DataSource" +File.separatorChar+"NumberPairs.txt";
	int numberOfLines=0; 
	List<String> LinesFromTextFile;
	
	/**
	 * This method chooses any line number
	 * in random manner and returns the same
	 * from the text file provided
	 * @return
	 */
	public String readRandomLineFromFile() {
		
		String currentLine="";
		LinesFromTextFile = new ArrayList<String>();
		
		// File path is passed as parameter
	    File file = new File(filePath);
	    BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			try {
				while ((currentLine = br.readLine()) != null) {
					numberOfLines++;
					LinesFromTextFile.add(currentLine);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//pick randomly the number pair to use in tests
		int inputNumber=new CommonMethods().returnRandomNumber(1, numberOfLines);
		return LinesFromTextFile.get(inputNumber-1);	
	}
}
