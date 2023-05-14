package JRMS;

public class VideoJuego {
    private int id;
    private String nombre;
    private String genero;
    private double pesoGb;
    private String plataforma;
    private String desarrollador;

    public VideoJuego() {
    }

    public VideoJuego(int id, String nombre, String gebero, double pesoGb, String plataforma, String desarrollador) {
        this.id = id;
        this.nombre = nombre;
        this.genero = gebero;
        this.pesoGb = pesoGb;
        this.plataforma = plataforma;
        this.desarrollador = desarrollador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String gebero) {
        this.genero = gebero;
    }

    public double getPesoGb() {
        return pesoGb;
    }

    public void setPesoGb(double pesoGb) {
        this.pesoGb = pesoGb;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", gebero='" + genero + '\'' +
                ", pesoGb=" + pesoGb +
                ", plataforma='" + plataforma + '\'' +
                ", desarrollador='" + desarrollador + '\'' +
                '}';
    }
}
