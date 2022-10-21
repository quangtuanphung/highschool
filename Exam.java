package HighSchool;

public class Exam {
private String type;
private int semester;
private String subject;
private int year;

public Exam() {
	
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public int getSemester() {
	return semester;
}

public void setSemester(int semester) {
	this.semester = semester;
}

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

public Exam(String type, int semester, int year, String subject) {
	super();
	this.type = type;
	this.semester = semester;
	this.year = year;
	this.subject = subject;
}


}
