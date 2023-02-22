package JRMS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Ingresa tu nombre, profesión y nacionalidad: ");
        String ent = key.nextLine();
        String[] sep = ent.trim().split(" ");

        String s1 = sep[0];
        String s2 = sep[1];
        String s3 = sep[2];

       System.out.println("---- Datos ordenados ----");
        System.out.println("NOMBRE: " + s1.toUpperCase());
        System.out.println("PROFESIÓN: " + s2.toUpperCase());
        System.out.println("NACIONALIDAD: " + s3.toUpperCase());
    }
}