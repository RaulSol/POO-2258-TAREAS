package JRMS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Agrega los 9 carácteres de tu juego en mayúsculas: ");
        String ent = key.nextLine();
        String[] sp = ent.trim().split("");

        if (ent.length() != 9 || !ent.matches("[XO_]+")) {
            System.out.println("Ingresa X, O _ y verifica que sean 9 carácteres");
        }

        else {
                System.out.println("_______");
                System.out.println("| " + sp[0] + sp[1] + sp[2] + " |");
                System.out.println("| " + sp[3] + sp[4] + sp[5] + " |");
                System.out.println("| " + sp[6] + sp[7] + sp[8] + " |");
                System.out.println("_______");
        }
    }
}