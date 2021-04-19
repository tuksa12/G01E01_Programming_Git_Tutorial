package de.tum.in.ase.eist;

import java.net.URL;

public class OnlineCourse extends Course{
    private URL livestreamUrl;

    public URL getLivestreamUrl() {
        return livestreamUrl;
    }

    public void setLivestreamUrl(URL livestreamUrl) {
        this.livestreamUrl = livestreamUrl;
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
