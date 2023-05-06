package JRMS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int a = 10;
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("Division: " + (a / b));
        } catch (ArithmeticException e){
            System.out.println("No es posible una division entre 0");
        } catch (NumberFormatException nfe){
            System.out.println("Agrega un numero, no letras");
        } finally {
            System.out.println("Cerrando excepciones...");
        }

        System.out.println("Fin del programa");

    }
}