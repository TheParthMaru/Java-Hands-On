package pack;

public class Corona {

	public void getDetails(long aadhar, String name) {
		System.out.println("\nCorona Prevention");
		System.out.println("Aadhar ID: " + aadhar);
		System.out.println("\"" + name + "\" has not visited any country for last 6 months");
	}

	public void getDetails(long aadhar, String name, String countries[]) {
		System.out.println("\nCorona Prevention");
		System.out.println("Aadhar ID: " + aadhar);
		System.out.println("\"" + name + "\" visited " + countries.length
				+ " countries in last 6 months which are listed below: ");
		for (String country : countries) {
			System.out.println(country);
		}
	}
}
