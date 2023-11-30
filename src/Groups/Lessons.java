package Groups;

import java.util.Arrays;

public class Lessons {
    private int ID;
    private String lessonsName;
    private String taskdescription;


    public Lessons() {
    }

    public Lessons(int ID, String lessonsName, String taskdescription) {
        this.ID = ID;
        this.lessonsName = lessonsName;
        this.taskdescription = taskdescription;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLessonsName() {
        return lessonsName;
    }

    public void setLessonsName(String lessonsName) {
        this.lessonsName = lessonsName;
    }

    public String getTaskdescription() {
        return taskdescription;
    }

    public void setTaskdescription(String taskdescription) {
        this.taskdescription = taskdescription;
    }


    @Override
    public String toString() {
        return "Lessons{\n" +
                "ID=" + ID +
                ", lessonsName='" + lessonsName + '\n' +
                ", taskdescription='" + taskdescription + '\n' +
                '}';
    }
}
