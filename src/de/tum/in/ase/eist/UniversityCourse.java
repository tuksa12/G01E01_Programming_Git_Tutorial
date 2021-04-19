package de.tum.in.ase.eist;

public class UniversityCourse extends Course{
    private String roomName;

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }

    @Override
    public void join() {
        System.out.println("Successfully joined course: " + super.getTitle());
    }

    @Override
    public void drop() {
        System.out.println("Successfully dropped course: " + super.getTitle());
    }
}
