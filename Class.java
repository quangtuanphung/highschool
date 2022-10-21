package HighSchool;

public class Class {

	private String className;
	private int room;

	private String primaryTeacher;

	public Class() {

	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public String getPrimaryTeacher() {
		return primaryTeacher;
	}

	public void setPrimaryTeacher(String primaryTeacher) {
		this.primaryTeacher = primaryTeacher;
	}

	public Class(String className, int room, String primaryTeacher) {
		super();
		this.className = className;
		this.room = room;
		this.primaryTeacher = primaryTeacher;
	}


}
