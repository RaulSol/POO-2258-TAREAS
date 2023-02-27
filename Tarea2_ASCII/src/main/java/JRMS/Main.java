package JRMS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su secuencia ASCII: ");
        String asci = scan.nextLine();
        System.out.println("La secuencia ingresada es: " + asci);
        boolean valida = true;

        for (int j = 0; j < asci.length(); j++) {
            char asc = asci.charAt(j);
            int dec = (int) asc;
            System.out.println("El valor ASCII de " + asc + " es: " + dec);
        }

        for (int i = 0; i < asci.length()-1; i++) {
            int a1 = asci.charAt(i);
            int a2 = asci.charAt(i+1);
            if (a2 != a1 + 1){
                valida = false;
                break;
            }
        }
        System.out.println("La secuencia ASCII existe: " + valida);
    }

}