package bo;

import exception.DuplicateException;
import model.Employee;

public class EmployeeBO {
	public void topThree(Employee employee[]) throws DuplicateException {

		// First Check whether duplicates exists or not
		for(int i = 0; i < employee.length; i++) {
			for(int j=i+1; j <employee.length; j++) {				
				if(employee[i].getEmployeeId() == employee[j].getEmployeeId()) {
					throw new DuplicateException();
				}
			}
		}
		
		
		// This will only work if above loop doesn't throw exception otherwise 
		// would never come here
		System.out.printf("%-15s%-10s\n", "Employee ID", "Employee Name");
		for(int i = 0; i < employee.length; i++) {
				System.out.printf("%-15s%-10s\n", employee[i].getEmployeeId(), employee[i].getEmployeeName());
			}
		}
}
