package be.gilles;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Lijst {

    private final int MAX_CAPACITEIT = 100;
    private int aantal = 0;

    ArrayList<Object> objecten = new ArrayList<>();

    public int getAantal() {
        return objecten.size();
    }

    public boolean voegToe(Object object) {

        if (objecten.size() != MAX_CAPACITEIT) {
            objecten.add(object);
            return true;
        } else return false;

    }

    public Object zoek(int index) {
        return objecten.get(index);
    }


}
