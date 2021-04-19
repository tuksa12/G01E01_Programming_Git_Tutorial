package de.tum.in.ase.eist;

public final class Main {

	private Main() {

	}

	public static void main(String[] args) {

		// TODO 5:
		//  1. Uncomment the following code
		//  2. Change the Course type to OnlineCourse and set its title to "EIST" before the student starts to study


        Student student = new Student("01234567", "John Doe", 42);
        OnlineCourse course = new OnlineCourse();
        course.setTitle("EIST");

        student.study(course);


	}

}
