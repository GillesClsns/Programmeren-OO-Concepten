import be.gilles.Rekenmachine;
import be.gilles.plugins.*;

public class Main {

    private static final Rekenmachine mijnCalc = new Rekenmachine();

    public static void main(String[] args) {

        mijnCalc.installeer(new Optelling());
        mijnCalc.installeer(new Aftrekking());
        mijnCalc.installeer(new Vermenigvuldiging());
        mijnCalc.installeer(new Deling());
        mijnCalc.installeer(new Macht());

        mijnCalc.bereken("+", 5, 2);
        mijnCalc.bereken("-", 5, 2);
        mijnCalc.bereken("*", 5, 2);
        mijnCalc.bereken("/", 5, 2);
        mijnCalc.bereken("^", 5, 2);
        mijnCalc.bereken("?", 5, 2);
        System.out.println(mijnCalc.toString());

    }

    //Opgave 3.1
   /* private static void doeBerekeningEnDrukAf(String commando, double getal1, double getal2){
        System.out.printf("%f %s %f = %f\n"
                , getal1, commando, getal2
                , mijnCalc.bereken(commando, getal1, getal2));
    }*/

}
