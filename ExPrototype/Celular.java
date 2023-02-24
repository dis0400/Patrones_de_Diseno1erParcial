package ExPrototype;

public class Celular {

    private String modelo;
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private String tamano;
    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    private String peso;
    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    private String camara;
    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    private String imei;
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    private String origen;

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public Celular(){}

    public void showInfo(){

        System.out.println("MODELO: "+ getModelo());
        System.out.println("TAMANO: "+ getTamano());
        System.out.println("PESO" + getPeso());
        
    }
    
}
