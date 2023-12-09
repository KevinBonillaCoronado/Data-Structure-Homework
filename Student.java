
public class Student {
	
	String lastName;
	String firstName;
	int section;
	
	public Student (String lastName, String firstName, int section) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.section = section;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}
	
	

}
