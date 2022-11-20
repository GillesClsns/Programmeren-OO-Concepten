package be.gilles;

public class Btw {

    private int percentage;

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public double voegBtwBij(double amount) {
        return amount * (1 + percentage / 100.0);
    }

    public double neemBtwWeg(double amount) {
        return amount / (1 + percentage / 100.0);
    }

}
