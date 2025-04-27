public class Property {
    private String propertyID;
    private String description;
    private String propertyOwnerId;

    // Constructor
    public Property(String propertyID, String description, String propertyOwnerId) {
        this.propertyID = propertyID;
        this.description = description;
        this.propertyOwnerId = propertyOwnerId;
    }

    // Getters
    public String getPropertyID() {
        return propertyID;
    }

    public String getDescription() {
        return description;
    }

    public String getPropertyOwnerId() {
        return propertyOwnerId;
    }

    // Setters
    public void setDescription(String description) {
        this.description = description;
    }

    public void setPropertyOwnerId(String propertyOwnerId) {
        this.propertyOwnerId = propertyOwnerId;
    }
}
