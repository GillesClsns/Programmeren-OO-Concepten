package be.gilles;

public record Auto(String merk, String model, Bandenmaat bandenmaat) {

    // This is a record class. Automatically generates the all-args constructor,
    // getters, equals, hashcode and toString

    @Override
    public String toString() {
        return String.format("%s %s %s", merk, model, bandenmaat.toString());
    }

}