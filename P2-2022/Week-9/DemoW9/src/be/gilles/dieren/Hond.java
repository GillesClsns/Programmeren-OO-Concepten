package be.gilles.dieren;

public class Hond extends Huisdier{

    private final String ras;

    public Hond(String naam,String ras) {

        super(naam, 4);
        this.ras = ras;

    }

    public String getRas() {
        return ras;
    }

    private void loop() {

        System.out.printf("De hond %s loopt.", getNaam());

    }

    public void maakGeluid() {

        System.out.println("Blaf");

    }

}