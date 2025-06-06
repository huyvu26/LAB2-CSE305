package CodeSmell;

class MessageFormatter {  //new class to handle the sysout (not violate the Single Responsibility Principle (SRP))
    public static void printSummary(Message msg) {
        System.out.println("Summary:");
        System.out.println("Sender: " + msg.getSender());
        System.out.println("Recipient: " + msg.getRecipient());
    }

    public static void printDetails(Message msg) {
        printSummary(msg);
        System.out.println("Content: " + msg.getContent());
        System.out.println("Content Length: " + msg.getContent().length());
        System.out.println("Sender Uppercase: " + msg.getSender().toUpperCase());
        System.out.println("Recipient Lowercase: " + msg.getRecipient().toLowerCase());
    }
}
