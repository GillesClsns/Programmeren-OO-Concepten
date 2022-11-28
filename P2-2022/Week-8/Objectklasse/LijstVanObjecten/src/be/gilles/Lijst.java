package be.gilles;

import java.util.ArrayList;

public class Lijst {

    ArrayList<Object> objecten = new ArrayList<>();

    public void voegToe(Object object) {

        final int MAX_CAPACITEIT = 100;

        if (objecten.size() != MAX_CAPACITEIT) {

            objecten.add(object);

        }

    }

    public boolean zoek(Object obj) {
        return objecten.contains(obj);

    }

    // TODO: 28/11/2022 Stap 4 toevoegen.

}