package HighSchool;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Student student1 = new Student(1, "tuan");
		Student student2 = new Student(2, "quang");

		Teacher teacher1 = new Teacher(1, "linh");
		Teacher teacher2 = new Teacher(2, "tom");
		Teacher teacher3 = new Teacher(3, "quang");

		Class classA = new Class("A", 10, "linh");
		Class classB = new Class("B", 11, "tom");
		Class classC = new Class("C", 12, "angus");

		Exam exam15M = new Exam("15min", 1, 2022, "Math");
		Exam exam45M = new Exam("45min", 1, 2022, "Math");
		Exam examFM = new Exam("Final", 1, 2022, "Math");

		Subject subject1 = new Subject(1, "Math");
		Subject eng = new Subject(2, "English");
		Subject lit = new Subject(3, "Literature");
		Student[] students = { student1, student2 };
		Teacher[] teachers = { teacher1, teacher2, teacher3 };
		Class[] classes = { classA, classB, classC };
		Exam[] exams = { exam15M, exam45M, examFM };
		

		student1.setClassName(classA.getClassName());
		classA.setPrimaryTeacher(teacher1.getName());
		

	}
}
