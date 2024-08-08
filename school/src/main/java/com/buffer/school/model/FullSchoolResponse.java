package com.buffer.school.model;



import java.util.List;
import java.util.Objects;

public class FullSchoolResponse {

    private String name;
    private String email;
    private List<Student> students;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "FullSchoolResponse [name=" + name + ", email=" + email + ", students=" + students + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, name, students);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FullSchoolResponse other = (FullSchoolResponse) obj;
		return Objects.equals(email, other.email) && Objects.equals(name, other.name)
				&& Objects.equals(students, other.students);
	}
	public FullSchoolResponse(String name, String email, List<Student> students) {
		super();
		this.name = name;
		this.email = email;
		this.students = students;
	}
	public FullSchoolResponse() {
		super();
	}
	

}