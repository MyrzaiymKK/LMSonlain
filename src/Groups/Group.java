package Groups;

import java.util.Arrays;

public class Group {
    private int ID;
    private String name;
    private String discription;
    public Student[] students = new Student[0];
    public Lessons[] lesson =new Lessons[0];
    private String groupName;

    public Group(){}

    public Group(int ID, String name, String discription, Lessons[] lessons, Student[] students,String groupName) {
        this.ID = ID;
        this.name = name;
        this.discription = discription;
        this.lesson = lessons;
        this.students = students;
        this.groupName = groupName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Lessons[] getLessons() {
        return lesson;
    }

    public void setLessons(Lessons[] lessons) {
        this.lesson = lessons;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Group: \n" +
                "ID =             " + ID + "\n" +
                "name =           " + name + "\n" +
                "discription =    " + discription + "\n" +
                "lessons =        " + Arrays.toString(lesson) + "\n" +
                "students =       " + Arrays.toString(students) + "\n\n";
    }
}
