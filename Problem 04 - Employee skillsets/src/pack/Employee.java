package pack;

public class Employee {
//	Data members
	private int employeeId;
	private String employeeName;
	private String technicalSkills;

//	No args constructor
	public Employee() {
		System.out.println("Employee constructor called");
	}

//	getter and setters

//	getter for employeeId
	public int getEmployeeId() {
		return employeeId;
	}

//	setter for employeeId
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

//	getter for employeeName
	public String getEmployeeName() {
		return employeeName;
	}

//	setter for employeeName
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

//	getter for technicalSkills
	public String getTechnicalSkills() {
		return technicalSkills;
	}

//	setter for technicalSkills
	public void setTechnicalSkills(String technicalSkills) {
		this.technicalSkills = technicalSkills;
	}

}
