package A6encapsulation;

public class Test {

	public static void main(String[] args) {
		Patient patient = new Patient();
		patient.setId(679);
		patient.setName("Bob");
		patient.setSsn("hdnk986");
		
		System.out.println("Patient Id is "+ patient.getId());
		System.out.println("Patient Name is "+ patient.getName());
		System.out.println("Patient Ssn is "+ patient.getSsn());
	}
}
