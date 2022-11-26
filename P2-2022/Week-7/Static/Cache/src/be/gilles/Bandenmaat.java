package be.gilles;

public record Bandenmaat(int breedte, int aspect, int velgDiameter) {

    // This is a record class. Automatically generates the all-args constructor,
    // getters, equals, hashcode and toString


    @Override
    public String toString() {
        return String.format("%d/%d R%d", breedte, aspect, velgDiameter);
    }

}