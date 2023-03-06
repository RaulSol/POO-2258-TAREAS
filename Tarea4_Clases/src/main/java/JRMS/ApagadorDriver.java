package JRMS;

public class ApagadorDriver {
    public static void main(String[] args) {
        Apagador a1 = new Apagador("Steren", 5, "Casa", "1");
        System.out.println(a1);
        System.out.println(a1.estado());
        a1.cambio();
        a1.danio();
    }
}
