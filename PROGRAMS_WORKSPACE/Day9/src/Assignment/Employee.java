package Assignment;

import java.io.Serializable;

public class Employee implements Serializable {

	private int empNo;
	private String empName;
	private int empBasic;
	
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName
				+ ", empBasic=" + empBasic + "]";
	}
	public Employee(int empNo, String empName, int empBasic) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empBasic = empBasic;
	}
	public int getEmpNo() {
		return empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpBasic() {
		return empBasic;
	}
	
	

}
