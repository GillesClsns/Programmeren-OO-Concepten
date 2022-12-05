import be.gilles.Lid;

import java.util.List;

import static be.gilles.Soort.*;

public class Main {

    public static void main(String[] args) {

        List<Lid> leden = List.of(
                new Lid(1001, "Luka", GEWOON),
                new Lid(1002, "Gevorg", ERELID),
                new Lid(1003, "Lorenzo", STEUNEND),
                new Lid(1004, "Pavel", GEWOON),
                new Lid(1005, "Sarah", GEWOON),
                new Lid(1006, "Noam", ERELID)

        );

        leden.stream().filter(lid -> lid.soort() != STEUNEND).forEach(System.out::println);

    }

}