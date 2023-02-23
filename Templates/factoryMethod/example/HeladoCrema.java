package factoryMethod.example;

public class HeladoCrema implements IHelado{

    private String tamano;
    private String forma;
    private Fruta fruta = new Fruta();
    private Base base = new Base();

    private Crema crema= new Crema();

    public HeladoCrema(){}

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Fruta getFruta() {
        return fruta;
    }

    public void setFruta(Fruta fruta) {
        this.fruta = fruta;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public Crema getCrema() {
        return crema;
    }

    public void setCrema(Crema crema) {
        this.crema = crema;
    }

    @Override
    public void preparHelado() {
        System.out.println("preparando helado de crema");
    }

    @Override
    public void showHelado() {
        System.out.println(" ** Helado Crema **");
        System.out.println("tamano:"+tamano);
        System.out.println("forma:"+forma);
        fruta.showInfo();
        base.showInfo();
        crema.showInfo();
    }
}
