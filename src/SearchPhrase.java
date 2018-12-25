import java.io.File;

public class SearchPhrase 
{
	public boolean searchFile(String testFileName )
	{
		
		File f = new File(testFileName);
		if(f.exists())
		{	
	        return true;
		}
		else
		{
            return false;
		}	
	}	
}
