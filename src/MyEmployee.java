import java.io.Serializable;

public class MyEmployee implements Serializable
{
	private static final long serialVersionUID = -6760947540337226821L;
	int employeeId;
	String employeeName;
	double salary;
	public MyEmployee(int employeeId, String employeeName, double salary) 
	{
	    this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=salary;
	}
		
	
			@Override
			public String toString() {
				return "Employee [employeeId=" + employeeId + ", employeeName="

						+ employeeName + ", salary=" + salary + "]";

			}		
	}

