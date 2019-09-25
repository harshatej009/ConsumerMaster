package harsh.rane.model;

public class PatientAccount {

	private String id;
	private String department;
	private String salary;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "PatientAccount [id=" + id + ", department=" + department + ", salary=" + salary + "]";
	}
	
}
