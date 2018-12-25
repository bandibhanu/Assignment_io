package assignment_io.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Grep {
	public String findLineNumberandLine(FileReader fileReader, String wordForSearch)
			throws IOException {
		String lineNumberAndLine = "";
		String line = "";
		int lineNumber = 0;
		BufferedReader bufferReader = new BufferedReader(fileReader);
		while ((line = bufferReader.readLine()) != null)
	     {
	             lineNumber++;  
	         String[] words = line.split(" ");
	    	 for(int counter=0;counter<words.length;counter++)
	    	 {
	    		if(words[counter].equals(wordForSearch))
	    		{
	    			lineNumberAndLine+=lineNumber+" "+line+"\n";
	    		}
	    	 }
	     }
		return lineNumberAndLine;
	}
}