public class Building {
    private String name;
    private int floors;
    private String buildingType;

    public Building(String name, int floors, String buildingType) {
        this.name = name;
        this.floors = floors;
        this.buildingType = buildingType;
    }

    public void displayInfo() {
        System.out.println("Building: " + name);
        System.out.println("Floors: " + floors);
        System.out.println("Type: " + buildingType);
    }

    public static void main(String[] args) {
        Building building = new Building("Generic Building", 5, "General");
        building.displayInfo();
    }
}