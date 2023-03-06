package JRMS;

public class PerroDriver {
    public static void main(String[] args) {
        Perro p1 = new Perro("Husky", "Atreus");
        System.out.println(p1);
        p1.conocer();
        p1.acercar();
        p1.ladrar();
    }

}
