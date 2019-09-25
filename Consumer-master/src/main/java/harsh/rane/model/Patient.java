package harsh.rane.model;

public class Patient {

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + ", city1=" + city1
				+ ", city2=" + city2 + "]";
	}
	private String id;
	private String name;
	private String surname;
	private String email;
	private String city1;
	private String city2;
	
	
	public Patient(String id, String name, String surname, String email, String city1, String city2) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.city1 = city1;
		this.city2 = city2;
	}
	public Patient()
	{}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity1() {
		return city1;
	}
	public void setCity1(String city1) {
		this.city1 = city1;
	}
	public String getCity2() {
		return city2;
	}
	public void setCity2(String city2) {
		this.city2 = city2;
	}
	
}
