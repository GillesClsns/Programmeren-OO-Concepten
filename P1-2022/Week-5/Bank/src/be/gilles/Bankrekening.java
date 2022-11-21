package be.gilles;

public class Bankrekening {

    private final String houder;
    private final String iban;
    private double saldo;

    public Bankrekening(String houder, String iban, double saldo) {
        this.houder = houder;
        this.iban = iban;
        this.saldo = saldo;
    }

    public Bankrekening(String houder, String iban) {
        this.houder = houder;
        this.iban = iban;
        this.saldo = 0;
    }

    public String getHouder() {
        return houder;
    }

    public String getIban() {
        return iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void storting(double amount) {
        this.saldo += amount;
    }

    public void opname(double amount) {
        this.saldo -= amount;
    }

}
