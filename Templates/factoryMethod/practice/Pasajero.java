package factoryMethod.practice;

public class Pasajero {
    private String name;
    private String ci;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void printInfo(){
        System.out.println("Pasajero> name:"+name);
        System.out.println("Pasajero> ci:"+ci);
    }
}
