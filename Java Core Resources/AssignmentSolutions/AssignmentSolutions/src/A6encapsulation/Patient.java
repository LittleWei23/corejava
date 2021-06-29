package A6encapsulation;

public class Patient {
	private int id;
	private String name;
	private String ssn;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSsn() {
		return ssn;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
}
