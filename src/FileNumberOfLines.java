import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileNumberOfLines {
int count=0;
public int checkNumberOfLines(FileReader filereader)throws IOException
{
	BufferedReader br=new BufferedReader(filereader);
	while(br.readLine()!=null)
	{
		count++;
	}
	return count;
}
}
