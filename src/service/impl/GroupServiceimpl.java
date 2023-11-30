package service.impl;

import DataBase.DataBase;
import Groups.GeneratorId;
import Groups.Group;
import service.GroupService;

import java.util.Arrays;
import java.util.Scanner;

public class GroupServiceimpl implements GroupService {

    @Override
    public Group[] addNewGroups() {
        Scanner scanner = new Scanner(System.in);
        Group group = new Group();

        group.setID(MyGeneretorId.GeneratorGroup());
        System.out.println("New Group name: ");
        String groupName = scanner.nextLine();
        group.setName(groupName);

        System.out.println("Description groups: ");
        String deskofgroup = scanner.nextLine();
        group.setDiscription(deskofgroup);

        DataBase.groups = Arrays.copyOf(DataBase.groups,DataBase.groups.length+1);
        DataBase.groups[DataBase.groups.length-1] = group;
        return DataBase.groups;

    }

    @Override
    public Group getGroup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write group name for search: ");
        String namegroup = scanner.nextLine();
        for (int i = 0; i < DataBase.groups.length; i++) {
            if (DataBase.groups[i].getName().equalsIgnoreCase(namegroup)) {
                return DataBase.groups[i];
            }
        }

        return null;
    }

    @Override
    public String updateGroup() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Write the group name: ");
       String namee = scanner.nextLine();
        for (int i = 0; i < DataBase.groups.length; i++) {
            if(DataBase.groups[i].getName().equalsIgnoreCase(namee)){
                System.out.println("New group name: ");
                DataBase.groups[i].setName(scanner.nextLine());
                return DataBase.groups[i].getName();
            }else System.out.println("Not found");
        }
        return null;

    }



    @Override
    public Group[] getAllGroup() {
        Group[] groups = DataBase.groups;
        return groups;
    }

    @Override
    public Group[] deletegroup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write group name: ");
        String namegr = scanner.nextLine();
        for (int i = 0; i < DataBase.groups.length; i++) {
            if(DataBase.groups[i].getName().equalsIgnoreCase(namegr)){
                for (int j = i; j < DataBase.groups.length -1; j++) {
                    DataBase.groups[i] = DataBase.groups[i+1];
                }
            }
        }
        return Arrays.copyOf(DataBase.groups, DataBase.groups.length -1);
    }
}
