package model;
import java.util.Arrays;

class School {
	private Student[] students;
	private Gradebook[] gradebooks;

	public School() {
		students = new Student[0];
		gradebooks = new Gradebook[0];
	}
	public void addStudent(Student student) {
        students  = Arrays.copyOf(students, students.length + 1);
        students[students.length - 1] = student;
    }
}