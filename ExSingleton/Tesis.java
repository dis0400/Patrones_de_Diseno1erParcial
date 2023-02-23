package ExSingleton;

public class Tesis {
    private String titulo;
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String mencion;
    public String getMencion() {
        return mencion;
    }

    public void setMencion(String mencion) {
        this.mencion = mencion;
    }

    private Estudiante datosEst;

    public Estudiante getDatosEst() {
        return datosEst;
    }

    public void setDatosEst(Estudiante datosEst) {
        this.datosEst = datosEst;
    }

    public Tesis (){}
    
    
}
