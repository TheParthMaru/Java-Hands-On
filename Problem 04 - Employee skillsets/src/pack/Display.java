package pack;

public class Display {
	public Display() {
		System.out.println("Display constructor called");
	}

	public void show(Employee employee) {
		System.out.println("Employee Details");
		System.out.println(employee.getEmployeeId() + " -- " + employee.getEmployeeName() + " -- "
				+ employee.getTechnicalSkills());
	}
}
