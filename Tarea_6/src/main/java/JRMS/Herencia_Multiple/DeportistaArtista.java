package JRMS.Herencia_Multiple;

public class DeportistaArtista extends Alumno implements Deportista,Artista {
    private int idActividades;
    private String deporte;
    private String arte;

    public DeportistaArtista() {
    }

    public DeportistaArtista(String nombre, int edad, int numeroCuenta, String carrera, double promedio, int idActividades, String deporte, String arte) {
        super(nombre, edad, numeroCuenta, carrera, promedio);
        this.idActividades = idActividades;
        this.deporte = deporte;
        this.arte = arte;
    }

    public int getIdActividades() {
        return idActividades;
    }

    public void setIdActividades(int idActividades) {
        this.idActividades = idActividades;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getArte() {
        return arte;
    }

    public void setArte(String arte) {
        this.arte = arte;
    }

    @Override
    public String toString() {
        return super.toString() +
                "DeportistaArtista{" +
                "idActividades=" + idActividades +
                ", deporte='" + deporte + '\'' +
                ", arte='" + arte + '\'' +
                '}';
    }

    @Override
    public int ensayar(String disciplina) {
        System.out.println("El alumno ensaya " + this.arte);
        return 4;
    }

    @Override
    public boolean obra() {
        System.out.println(getNombre() + " está en un concurso de " + arte);
        return true;
    }

    @Override
    public int entrenar() {
        System.out.println(getNombre() + " está entrenando " + deporte);
        return 2;
    }

    @Override
    public boolean competencia(String ubicacon) {
        System.out.println(getNombre() + " está en un torneo de " + deporte);
        return true;
    }
}
