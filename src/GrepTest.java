
import static org.junit.Assert.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

import assignment_io.src.Grep;
public class GrepTest {
	private Grep searchWord;
	@Test
	public void searchWordtest() throws IOException {
		searchWord =new Grep();
		FileReader fileReader=new FileReader("C:\\Users\\bbhanupr\\Desktop\\lamda\\firstFileSearch.txt");
		String wordForSearch=".";
		String actualLineAndLineNumber=searchWord.findLineNumberandLine(fileReader,wordForSearch);
		
		String expectedLineAndLineNumber="2 that i have been doing.\n3 please show.\n";      
		assertEquals(expectedLineAndLineNumber,actualLineAndLineNumber);
	}
}