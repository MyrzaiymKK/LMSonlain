import DataBase.DataBase;
import Role.Admin;
import service.GroupService;
import service.LessonService;
import service.StudentService;
import service.impl.Adminimpl;
import service.impl.GroupServiceimpl;
import service.impl.LessonServiceimpl;
import service.impl.Studentsimpl;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GroupServiceimpl groupService = new GroupServiceimpl();

        Studentsimpl studentService = new Studentsimpl();

        LessonServiceimpl lessonService = new LessonServiceimpl();

        Admin admin = new Admin();

        Adminimpl adminservice = new Adminimpl();

        outerLoop:
        while (true) {
            ZonedDateTime zonedDateTime = ZonedDateTime.now();
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");

            int correct = zonedDateTime.getHour();

            if (correct > 6 && correct < 10) {
                System.out.println("Good morning!  -> " + zonedDateTime.format(dateTimeFormatter));
            } else if (correct >= 10 && correct < 16) {
                System.out.println("Good afternoon!  -> " + zonedDateTime.format(dateTimeFormatter));
            } else if (correct >= 16 && correct < 23) {
                System.out.println("Good evening!  -> " + zonedDateTime.format(dateTimeFormatter));
            } else {
                System.out.println("Hello!  -> " + zonedDateTime.format(dateTimeFormatter));
            }

            System.out.println("""
                         Hello!
                       1 -> If you rigistred 
                       2 -> If you registred but fotgot the password
                       3 -> Exit
                    """);
            switch (scanner.nextLine()) {
                case "1" -> {
                    if (adminservice.voiti(admin) != null) {
                        innerLoop:
                        while (true) {
                            System.out.println("""
                                    0.Exit
                                    1.Addnewgroup
                                    2.Getgroup
                                    3.Update
                                    4.Getallgroup
                                    5.Add new Student to group
                                    6.Update student
                                    7.Find student by firstName
                                    8.Get all students by groupName
                                    9.Get all students lesson
                                    10.Delete Student by email
                                    11.Add new Lesson to group
                                    12.Get lesson by name
                                    13.Get all lesson by group name
                                    14.Delete lesson by ID
                                    15.Delete group by name
                                                            
                                    """);
                            switch (scanner.nextLine()) {
                                case "0" -> {break innerLoop;}
                                case "1" -> {
                                    groupService.addNewGroups();
                                }
                                case "2" -> {
                                    System.out.println(groupService.getGroup());
                                }
                                case "3" -> {
                                    groupService.updateGroup();
                                }
                                case "4" -> {
                                    System.out.println(Arrays.toString(groupService.getAllGroup()));
                                }
                                case "5" -> {
                                    studentService.addNewStudent();
                                }
                                case "6" -> {
                                    studentService.updateStudent();
                                }
                                case "7" -> {
                                    studentService.findStudent();
                                }
                                case "8" -> {
                                    studentService.getallStudentsbyName();
                                }
                                case "9" -> {
                                    studentService.getAllStudentLesson();
                                }
                                case "10" -> {
                                    studentService.deleteStudentByEmail();
                                }
                                case "11" -> {
                                    lessonService.addnewlessontoGroup();
                                }
                                case "12" -> {
                                    lessonService.getlessonbyname();
                                }
                                case "13" -> {
                                    lessonService.getalllesbygrname();
                                }
                                case "14" -> {
                                    lessonService.deletelessonbyID();
                                }
                                case "15" -> {
                                    DataBase.groups = groupService.deletegroup();
                                }
                            }
                        }
                    }
                }
                case "2" -> admin = adminservice.izmenit(admin);
                case "3" -> {break outerLoop;}
                default -> System.out.println("enter right choice");
            }
        }
    }
}