package service.impl;

import Role.Admin;
import service.Adminservice;

import java.util.Scanner;

public class Adminimpl implements Adminservice {
    @Override
    public Admin voiti(Admin admin) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write email: ");
        String email = scanner.nextLine();

        System.out.println("Write password: ");
        String pass = scanner.nextLine();
        if(email.equalsIgnoreCase(admin.getEmail()) && pass.equalsIgnoreCase(admin.getPassword())){
            System.out.println("Welcom!");
            return admin;
        }else System.out.println("Invalid password or email");
        return null;
    }

    @Override
    public Admin izmenit(Admin admin) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write email: " );
        String email = scanner.nextLine();

        if (email.equalsIgnoreCase(admin.getEmail())){
            System.out.println("Write new Password: ");
            String pass = scanner.nextLine();

            admin.setPassword(pass);
            System.out.println("Success updated");
            System.out.println(admin);
        }else System.out.println("User not found");
        return admin;
    }
}
