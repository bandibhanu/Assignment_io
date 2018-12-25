
import static org.junit.Assert.*;
import static org.junit.Assert.*;

import java.io.FileWriter;
import org.junit.Test;

public class MyEmployeeTest {

	private MyEmployee employeeDetails;
	@Test
	public void employeeDetailsWriteTest() {
		employeeDetails=new MyEmployee(3355,"bhanu",45654);
		String result=employeeDetails.toString();
		   try{    
	           FileWriter fw=new FileWriter("src\\com\\employee.txt");    
	           fw.write(result);    
	           fw.close();    
	          }
		   catch(Exception e)
		   {
			   System.out.println(e);
		   }    
	         assertEquals("Employee [employeeId=3355, employeeName=bhanu, salary=45654.0]",result);

	

	}



}