package be.gilles.dieren;

public class Kanarie extends Huisdier{

    private final int vleugelLengte;

    public Kanarie(String naam, int vleugelLengte) {

        super(naam, 2);
        this.vleugelLengte = vleugelLengte;

    }

    private void vlieg() {

        System.out.printf("De kanarie %s vliegt.", getNaam());


    }

    public void maakGeluid() {

        System.out.println("Twiet");

    }

}
