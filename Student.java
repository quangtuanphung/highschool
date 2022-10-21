package HighSchool;

public class Student {
	private int Id;
	private String Name;
	private String className;
	private double grade;
	
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Student(int id, String name) {
		super();
		Id = id;
		Name = name;
		
	}
	


}
