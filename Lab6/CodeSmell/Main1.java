package CodeSmell;

import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        MessagingService messagingService = new MessagingService();

        // Sending messages
        messagingService.sendMessage("Hello, tenant!", "Property Manager", "Tenant A");
        messagingService.sendMessage("Important notice: Rent due next week.", "Property Owner", "Tenant A");
        messagingService.sendMessage("Maintenance request received.", "Tenant A", "Property Manager");

        // Retrieving messages for a recipient
        List<Message> tenantAMessages = messagingService.getMessagesForRecipient("Tenant A");
        for (Message message : tenantAMessages) {
            System.out.println("From: " + message.getSender() + ", Content: " + message.getContent());
        }

        // Using the new formatter for detailed printing
        Message exampleMessage = new Message("Test", "Sender", "Recipient");
        MessageFormatter.printDetails(exampleMessage);

        // Print all messages
        messagingService.printAllMessages();
    }
}

