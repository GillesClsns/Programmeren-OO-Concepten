package be.gilles;

public abstract class Transportmiddel {

    private final double snelheid;
    private String geluid;

    public Transportmiddel(double snelheid) {

        this.snelheid = snelheid;

    }

    public String getGeluid() {
        return geluid;
    }

    public void setGeluid(String geluid) {
        this.geluid = geluid;
    }

    public double getSnelheid() {
        return snelheid;
    }

    public void legAfstandAf(double afstand) {

        int i = (int) ((afstand * 10) / getSnelheid());

        for (int j = 0; j < i; j++) {

            System.out.print(getGeluid());

        }


    }

    public String toString() {
        return "%s-";
    }

}
