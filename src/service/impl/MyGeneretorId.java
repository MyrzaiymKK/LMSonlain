package service.impl;

public class MyGeneretorId {
    public static int idForGroup = 0;
    public static int idForStudent = 0;
    public static int idForLesson = 0;


    public static int GeneratorGroup(){
        return (++idForGroup);
    }

    public static int GeneratorStudent(){
        return (++idForStudent);
    }

    public static int GeneratorLesson(){
        return (++idForLesson);
    }
}
