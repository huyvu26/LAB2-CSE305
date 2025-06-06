package CodeSmell;

class Property {
    private final String name;
    private final double rentAmount;
    private final String ownerName;
    private final String location;

    public Property(String name, double rentAmount, String ownerName, String location) {
        this.name = name;
        this.rentAmount = rentAmount;
        this.ownerName = ownerName;
        this.location = location;
    }

    public String getName() { return name; }
    public double getRentAmount() { return rentAmount; }
    public String getOwnerName() { return ownerName; }
    public String getLocation() { return location; }

    public void printPropertyDetails() {
        System.out.println("Property: " + name);
        System.out.println("Rent Amount: $" + rentAmount);
        System.out.println("Owner: " + ownerName);
        System.out.println("Location: " + location);
    }
}
