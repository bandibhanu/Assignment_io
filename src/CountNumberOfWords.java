import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountNumberOfWords 
{

	public int wordcount(FileReader filereader) throws IOException
	{
		String line="";
		int wordCount=0;
		BufferedReader br=new BufferedReader(filereader);
		
		while((line=br.readLine())!=null)
		{   
			String[] words=line.split(" ");
			wordCount=wordCount+words.length;
			
		}	
		return wordCount;
		
	}
}
