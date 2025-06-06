package CodeSmell;

import java.util.ArrayList;
import java.util.List;

public class ReportGenerator {
    public static void main(String[] args) {
        List<Property> properties = new ArrayList<>();

        Property property1 = new Property("Apartment A", 1500.0, "John Doe", "City Center");
        Property property2 = new Property("House B", 2000.0, "Jane Smith", "Suburb");
        Property property3 = new Property("Condo C", 1800.0, "Bob Johnson", "Downtown");

        properties.add(property1);
        properties.add(property2);
        properties.add(property3);

        FinancialReport report = new FinancialReport("Monthly Rental Report", properties);
        report.generateReport();
    }
}
