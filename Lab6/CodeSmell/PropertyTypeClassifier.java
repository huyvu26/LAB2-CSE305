package CodeSmell;

class PropertyTypeClassifier { // logic part(need to seperate in the report)
    public static String classify(double rentAmount) {
        return rentAmount > 2000 ? "Premium" : "Standard";
    }

    public static double calculateYearlyRent(double rentAmount) {
        return rentAmount * 12;
    }
}
