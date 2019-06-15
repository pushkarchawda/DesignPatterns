
public class Employee {
	
	private String empName;
	private int empID;
	private int salary;
	
	private static int counter = 0;
	
	public Employee(String empName, int salary) {
		super();
		this.empName = empName;
		this.empID = ++counter;
		this.salary = salary;
	}
	
	public int getEmpID() {
		return empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empID=" + empID + ", salary=" + salary + "]";
	}

}
