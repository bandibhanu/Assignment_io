import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.junit.Test;

public class LineCountTest {

	private FileNumberOfLines numberOfLines;

	@Test
	public void fileNumberOfLinestest() throws IOException {
		numberOfLines = new FileNumberOfLines();
		FileReader fr = new FileReader("C:\\Users\\bbhanupr\\Desktop\\lamda\\fileFirstSearch.txt");
		int numberOfLinesInFile = numberOfLines.checkNumberOfLines(fr);
		int expected = 3;
		assertEquals(expected, numberOfLinesInFile);
	}

	@Test
	public void fileNumberOfLinestestAgain() throws IOException {
		numberOfLines = new FileNumberOfLines();
		FileReader fr = new FileReader("C:\\Users\\bbhanupr\\Desktop\\lamda\\assignments_io");
		int numberOfLinesInFile = numberOfLines.checkNumberOfLines(fr);
		int expected = 2;
		assertEquals(expected, numberOfLinesInFile);
	}
}
