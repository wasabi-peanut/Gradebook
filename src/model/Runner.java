package model;

class Runner {
	public static void main(String[] args) {
		Gradebook gradebook = new Gradebook("04404-10 Pre-Calculus Honors S1");
		Student student = new Student(612191, "Alex Schor");
		gradebook.addStudent(student);
		GradeCategory c1 = new GradeCategory("Tests/Projects", 0.5);
		GradeCategory c2 = new GradeCategory("Homework", 0.15);
		GradeCategory c3 = new GradeCategory("Participation", 0.1);
		GradeCategory c4 = new GradeCategory("Final Exam", 0.25);
		gradebook.addCategory(c1);
		gradebook.addCategory(c2);
		gradebook.addCategory(c3);
		gradebook.addCategory(c4);
		student.getSessions()[0].getCategories()[0].addScore(0.925);
		System.out.println(student.getSessions()[0].getAverage());

	}
}