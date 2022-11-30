import be.gilles.*;
import be.gilles.type.*;

public class Main {

    public static void main(String[] args) {

        Transportmiddel[] transportmiddelen = new Transportmiddel[] {
              new Bus(50), new Tram(40), new Trein(120), new Fiets(25),
                new TeVoet(5), new Step(20)
        };


        for (Transportmiddel transportmiddel : transportmiddelen) {

            transportmiddel.legAfstandAf(10);
            System.out.println(transportmiddel);

        }

    }

}
