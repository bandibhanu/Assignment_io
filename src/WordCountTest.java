import static org.junit.Assert.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.print.attribute.standard.NumberOfDocuments;
import org.junit.Before;
import org.junit.Test;


public class WordCountTest {
//private CountNumberOfWords object;

	@Test
	public void test1() throws IOException
	{
		CountNumberOfWords object=new CountNumberOfWords();
		FileReader filereader=new FileReader("C:\\Users\\bbhanupr\\Desktop\\lamda\\firstFileSearch.txt");
		int actual= object.wordcount(filereader);
		int expected=12;
		assertEquals(expected,actual);
		
	}

}

