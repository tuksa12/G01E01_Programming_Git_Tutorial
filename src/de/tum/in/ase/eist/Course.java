package de.tum.in.ase.eist;

import java.time.LocalDate;
import java.util.List;

// TODO 1: Make Course an abstract class, change join() and drop() to abstract methods
// TODO 2: Implement OnlineCourse
// TODO 3: Implement UniversityCourse

public class Course {

    private String title;
    private String description;
    private LocalDate examDate;
    private List<Lecture> lectures;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getExamDate() {
        return examDate;
    }

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setExamDate(LocalDate examDate) {
        this.examDate = examDate;
    }

    public void setLectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }

    public void join() {
        System.out.println("Successfully joined course: " + title);
    }

    public void drop() {
        System.out.println("Successfully dropped course: " + title);
    }

}
