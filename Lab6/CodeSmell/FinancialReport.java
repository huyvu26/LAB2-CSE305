package CodeSmell;
import java.util.List;
import java.util.ArrayList;

class FinancialReport {
    private final String reportTitle;
    private final List<Property> properties;

    public FinancialReport(String reportTitle, List<Property> properties) {
        this.reportTitle = reportTitle;
        this.properties = properties;
    }

    public void generateReport() {
        double totalRent = 0;
        System.out.println("Financial Report: " + reportTitle);
        System.out.println("----------------------------");

        for (Property property : properties) {
            property.printPropertyDetails();
            totalRent += property.getRentAmount();

            String type = PropertyTypeClassifier.classify(property.getRentAmount());
            System.out.println("Type: " + type);
            System.out.println("Yearly Rent: $" + PropertyTypeClassifier.calculateYearlyRent(property.getRentAmount()));
            System.out.println("--------------------");
        }

        System.out.println("Total Rent Amount: $" + totalRent);
    }
}
