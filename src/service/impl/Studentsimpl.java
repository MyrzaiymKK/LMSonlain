package service.impl;

import DataBase.DataBase;
import Groups.Student;

import service.StudentService;

import java.util.Arrays;
import java.util.Scanner;

public class Studentsimpl implements StudentService {

    DataBase dataBase = new DataBase();

    @Override
    public void addNewStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write group: ");
        String name = scanner.nextLine();
        for (int i = 0; i < DataBase.groups.length; i++) {
            if (name.equalsIgnoreCase(DataBase.groups[i].getName())) {
                Student student = new Student();

                student.setID(MyGeneretorId.GeneratorStudent());
                System.out.println("Name of Student: ");
                String name1 = scanner.nextLine();

                System.out.println("Last name of Student:  ");
                String lastName = scanner.nextLine();


                System.out.println("Write email: ");
                String email = scanner.nextLine();
                if (emailUnic(email) == 1 && email.endsWith("@gmail.com")) {
                    student.setEmail(email);
                }

                System.out.println("Write password: ");
                String password = scanner.nextLine();

                System.out.println("Write gender");
                String genderr = scanner.nextLine();



                student.setFirstName(name1);
                student.setLastName(lastName);

                student.setPassword(password);
                student.setGender(genderr);

                DataBase.groups[i].students = Arrays.copyOf(DataBase.groups[i].students, DataBase.groups[i].students.length + 1);
                DataBase.groups[i].students[DataBase.groups[i].students.length - 1] = student;
            }

        }
    }

    @Override
    public void updateStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write email: ");
        String email = scanner.nextLine();
        for (int i = 0; i < DataBase.groups.length; i++) {
            for (int j = 0; j < DataBase.groups[i].students.length; j++) {
                if (DataBase.groups[i].students[j].getEmail().equalsIgnoreCase(email)) {
                    boolean isTrue = true;
                    while (isTrue) {
                        System.out.println("""
                                1.name
                                2.lastname
                                3.email
                                4.password
                                5.gender
                                6. exit
                                """);
                        switch (scanner.nextLine()) {
                            case "1" -> {
                                System.out.println("First nameof Student: ");
                                String newfirstName = scanner.nextLine();
                                for (int r = 0; r < DataBase.groups.length; r++) {
                                    for (int n = 0; n < DataBase.groups[r].students.length; n++) {
                                        if (DataBase.groups[r].students[n].getFirstName().equalsIgnoreCase(newfirstName)) {
                                            System.out.println("Write new firstName: ");
                                            DataBase.groups[r].students[n].setFirstName(scanner.nextLine());
                                            System.out.println("Success");

                                        }
                                    }
                                }
                            }
                            case "2" -> {
                                System.out.println("Last nameof Student: ");
                                String newlastName = scanner.nextLine();
                                for (int t = 0; t < DataBase.groups.length; t++) {
                                    for (int b = 0; b < DataBase.groups[t].students.length; b++) {
                                        if (DataBase.groups[t].students[b].getLastName().equalsIgnoreCase(newlastName)) {
                                            System.out.println("Write new lastName: ");
                                            DataBase.groups[t].students[b].setLastName(scanner.nextLine());
                                            System.out.println("Success");
                                        }
                                    }
                                }
                            }
                            case "3" -> {
                                System.out.println("Email of Student: ");
                                String emaill = scanner.nextLine();
                                for (int a = 0; a < DataBase.groups.length; a++) {
                                    for (int m = 0; m < DataBase.groups[a].students.length; m++) {
                                        if (DataBase.groups[a].students[m].getEmail().equalsIgnoreCase(emaill)) {
                                            System.out.println("Write new email: ");
                                            DataBase.groups[a].students[m].setEmail(scanner.nextLine());
                                            System.out.println("Success");
                                        }
                                    }
                                }


                            }
//
                            case "4" -> {
                                System.out.println("Password of Student: ");
                                String password = scanner.nextLine();
                                for (int z = 0; z < DataBase.groups.length; z++) {
                                    for (int x = 0; x < DataBase.groups[z].students.length; x++) {
                                        if (DataBase.groups[z].students[x].getPassword().equalsIgnoreCase(password)) {
                                            System.out.println("Write new password: ");
                                            DataBase.groups[z].students[x].setPassword(scanner.nextLine());
                                            System.out.println("Success");
                                        }
                                    }
                                }

                            }
                            case "5" -> {
                                System.out.println("Gender of Student: ");
                                String gender = scanner.nextLine();
                                for (int q = 0; q < DataBase.groups.length; q++) {
                                    for (int w = 0; w < DataBase.groups[q].students.length; w++) {
                                        if (DataBase.groups[q].students[w].getGender().equalsIgnoreCase(gender)) {
                                            System.out.println("Write new gender: ");
                                            DataBase.groups[q].students[w].setGender(scanner.nextLine());
                                            System.out.println("Success");
                                        }
                                    }
                                }
                            }
                            case "6" -> isTrue = false;
                            default -> System.out.println("write right choice");
                        }
                    }
                }
            }
        }
    }

    @Override
    public void findStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write first name of Student for the search:");
        String searchStudentName = scanner.nextLine();
        for (int i = 0; i < DataBase.groups.length; i++) {
            for (int j = 0; j < DataBase.groups[i].students.length; j++) {
                if (DataBase.groups[i].students[j].getFirstName().equalsIgnoreCase(searchStudentName)) {
                    System.out.println(DataBase.groups[i].students[j]);
                }
            }
        }
    }

    @Override
    public void getallStudentsbyName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write group name: ");
        String groupn = scanner.nextLine();
        for (int i = 0; i < DataBase.groups.length; i++) {
            if(DataBase.groups[i].getName().equalsIgnoreCase(groupn)){
                System.out.println(Arrays.toString(DataBase.groups[i].getStudents()));
            }
        }
    }

    @Override
    public Student[] getAllStudentLesson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name of student: ");
        String nameStud = scanner.nextLine();
        for (int i = 0; i < DataBase.groups.length; i++) {
            for (int k = 0; k < DataBase.groups[i].students.length; k++) {
                if(DataBase.groups[i].students[k].getFirstName().equalsIgnoreCase(nameStud)){
                    for (int p = 0; p < DataBase.groups[i].lesson.length; p++) {
                        System.out.println(DataBase.groups[i].lesson[p]);
                    }
                }
            }
        }
        return new Student[0];
    }

    @Override
    public void deleteStudentByEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write email: ");
        String emailll = scanner.nextLine();
        for (int i = 0; i < DataBase.groups.length; i++) {
            for (int j = i; j < DataBase.groups[i].students.length -1; j++) {
                if(DataBase.groups[i].students[j].getEmail().equalsIgnoreCase(emailll)){
                    DataBase.groups[i].students[j] = DataBase.groups[i].students[j+1];
                }
            }
            DataBase.groups[i].setStudents(Arrays.copyOf(DataBase.groups[i].students,DataBase.groups[i].students.length - 1));
        }
    }


    private static int emailUnic(String email) {
        for (int i = 0; i < DataBase.groups.length; i++) {
            for (int j = 0; j < DataBase.groups[i].students.length; j++) {
                if (DataBase.groups[i].students[j].getEmail().equalsIgnoreCase(email)) {
                    return 0;
                }
            }
        }
        return 1;
    }
}

