package ExSingleton;

import java.util.Date;

public class JefeDeRecursosHumanos {
    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private String ci;
    public String getCi() {
        return ci;
    }
    public void setCi(String ci) {
        this.ci = ci;
    }

    private synchronized void registroTesis( Tesis tesis, Date date){
        AlmacenaTesis.getInstance().registroTesis(tesis, date);
    }

    public void verDatosEnRegistro(){
         AlmacenaTesis.getInstance().verRegistr0();
    }

    
}
