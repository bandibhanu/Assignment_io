import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class FileExistApplicationTest {

private SearchPhrase object;
	@Before
	public void setup()
	{
		object=new SearchPhrase();
	}
	@Test
	public void test1() {
		String testFileName = "C:\\Users\\bbhanupr\\Desktop\\lamda";
	    boolean expected = true;
	    boolean actual= object.searchFile(testFileName);
	    assertEquals(expected,actual);
	    System.out.println(actual);
	    

	}
	@Test
	public void test2() {
		String testFileName = "C:\\Users\\bbhanupr\\Desktop\\lamdi";
	    boolean expected = false;
	    boolean actual= object.searchFile(testFileName);
	    assertEquals(expected,actual);
	    System.out.println(actual);
	    
	}
}