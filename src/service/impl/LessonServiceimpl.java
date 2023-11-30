package service.impl;

import DataBase.DataBase;
import Groups.Lessons;
import service.LessonService;

import java.util.Arrays;
import java.util.Scanner;

public class LessonServiceimpl implements LessonService {
    @Override
    public void addnewlessontoGroup() {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Write group: ");
        String nameLesson = scanner.nextLine();
        for (int i = 0; i < DataBase.groups.length; i++) {
            if(nameLesson.equalsIgnoreCase(DataBase.groups[i].getName())){
                Lessons lessons = new Lessons();
                lessons.setID(MyGeneretorId.GeneratorLesson());
                System.out.println("Write name of Lesson: ");
                String nameless = scanner.nextLine();

                System.out.println("Write description of Lesson: ");
                String deskles = scanner.nextLine();

                lessons.setLessonsName(nameless);
                lessons.setTaskdescription(deskles);

                DataBase.groups[i].lesson = Arrays.copyOf(DataBase.groups[i].lesson,DataBase.groups[i].lesson.length +1);
                DataBase.groups[i].lesson[DataBase.groups[i].lesson.length - 1] = lessons;
            }
        }
    }

    @Override
    public void getlessonbyname() {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Write name of lesson: ");
        String nameles = scanner.nextLine();
        for (int i = 0; i < DataBase.groups.length; i++) {
            for (int j = 0; j < DataBase.groups[i].lesson.length; j++) {
                if(DataBase.groups[i].lesson[j].getLessonsName().equalsIgnoreCase(nameles)){
                    System.out.println(DataBase.groups[i].lesson[j]);
                }
            }
        }
    }

    @Override
    public void getalllesbygrname() {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Write group name for all lessons: ");
        String namegroupp = scanner.nextLine();
        for (int i = 0; i < DataBase.groups.length; i++) {
            if (DataBase.groups[i].getName().equalsIgnoreCase(namegroupp)){
                for (int j = 0; j < DataBase.groups[i].lesson.length; j++) {
                    System.out.println(DataBase.groups[i].lesson[j]);
                }
            }
        }
    }

    @Override
    public void deletelessonbyID() {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Write ID of lesson: ");
        int id = scanner.nextInt();
        for (int i = 0; i < DataBase.groups.length; i++) {
            for (int w = i; w < DataBase.groups[i].lesson.length -1; w++) {
                if(DataBase.groups[i].lesson[w].getID() == (id)){
                    DataBase.groups[i].lesson[w] = DataBase.groups[i].lesson[w +1];
                }
            }
            DataBase.groups[i].setLessons(Arrays.copyOf(DataBase.groups[i].lesson, DataBase.groups[i].lesson.length -1));
        }
    }

    @Override
    public void deletelessonbygroupName() {

    }
}
