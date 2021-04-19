package de.tum.in.ase.eist;

public class OnlineCourse extends Course{
    @Override
    public void join() {
        System.out.println("Successfully joined course: " + super.getTitle());
    }

    @Override
    public void drop() {
        System.out.println("Successfully dropped course: " + super.getTitle());
    }
}
