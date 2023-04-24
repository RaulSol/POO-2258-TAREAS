package JRMS.Herencia_Multiple;

public class MainAlumno {
    public static void main(String[] args) {
        DeportistaArtista al1 = new DeportistaArtista();
        al1.setNombre("Raúl");
        al1.setNumeroCuenta(423019913);
        al1.setEdad(18);
        al1.setCarrera("ICO");
        al1.setArte("Batería");
        al1.setDeporte("Basketball");
        System.out.println(al1);
        al1.ensayar("Batería");
        al1.entrenar();
        al1.competencia("Canchas Neza");
        al1.obra();
    }
}
