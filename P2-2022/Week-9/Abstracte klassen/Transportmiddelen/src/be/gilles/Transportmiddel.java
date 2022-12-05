package be.gilles;

public abstract class Transportmiddel {

    private final double snelheid;
    private String geluid;
    int amount;

    public Transportmiddel(double snelheid) {

        this.snelheid = snelheid;

    }

    public String getGeluid() {
        return geluid;
    }

    public double getSnelheid() {
        return snelheid;
    }

    public void legAfstandAf(double afstand) {

        int i = (int) ((afstand * 10) / getSnelheid());
        amount = i;
        for (int j = 0; j < i; j++) {

            System.out.print(getGeluid());

        }

    }

    public String toString() {

        return getGeluid();
    }

}
