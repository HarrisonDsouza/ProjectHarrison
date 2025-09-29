public class ResidentialBuilding extends Building {
    private int numberOfUnits;
    private boolean hasParking;

    public ResidentialBuilding(String name, int floors, int numberOfUnits, boolean hasParking) {
        super(name, floors, "Residential");
        this.numberOfUnits = numberOfUnits;
        this.hasParking = hasParking;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Units: " + numberOfUnits);
        System.out.println("Parking: " + (hasParking ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        ResidentialBuilding apartment = new ResidentialBuilding("Sunset Apartments", 12, 48, true);
        apartment.displayInfo();
    }
}