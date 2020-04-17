package de.tum.in.ase.eist;

public class Student {

    private String matriculationNumber;
    private String name;
    private int age;

    public Student(String matriculationNumber, String name, int age) {
        this.matriculationNumber = matriculationNumber;
        this.name = name;
        this.age = age;
    }

    public String getMatriculationNumber() {
        return matriculationNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setMatriculationNumber(String matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void study(Course course) {

        // TODO 4: Call the join() method of the passed course

    }

}
