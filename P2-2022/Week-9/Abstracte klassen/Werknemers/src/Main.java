import be.gilles.Werknemer;
import be.gilles.type.Arbeider;
import be.gilles.type.Bediende;

public class Main {

    public static void main(String[] args) {

        Werknemer[] werknemers = {
                new Arbeider("Jos", 57082332149L, 38),
                new Arbeider("Els", 61030350468L, 40),
                new Bediende("Erik", 54110774131L, 1.6)
        };

        for(Werknemer x : werknemers) {

            System.out.println(x);
        }

    }

}