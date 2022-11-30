import be.gilles.interfaces.Movable;
import be.gilles.interfaces.Visible;

public class Table extends Entity implements Visible, Movable {

    public Table(String naam, double[] position) {

        super(naam, position);

    }

    @Override
    public void move(double[] x, double[] y, double[] z) {

    }

    @Override
    public void draw() {

    }
}
