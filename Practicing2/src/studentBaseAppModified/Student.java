package studentBaseAppModified;

public class Student {
	private String name;
	private String lastName;
	private int ID;
	private String gradeYear;
	
	public Student() {
		
	}
	public Student (String name, String lastName, int ID, String gradeYear) {
		this.name = name;
		this.lastName = lastName;
		this.ID = ID;
		this.gradeYear = gradeYear;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	public String getName () {
		return name;
	}
	
	public void setLastName (String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setId (int ID) {
		this.ID = ID;
	}
	public int getId() {
		return ID;
	}
	
	public void setGradeYear (String gradeYear) {
		this.gradeYear = gradeYear;
	}
	public String getGradeYear() {
		return gradeYear;
	}

}
