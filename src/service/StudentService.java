package service;

import Groups.Student;

public interface StudentService {
    void addNewStudent();
    void updateStudent();
    void findStudent();
    void getallStudentsbyName();
    Student[] getAllStudentLesson();
    void deleteStudentByEmail();

}
