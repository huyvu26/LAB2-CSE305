package CodeSmell;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MessagingService {
    private final Map<String, List<Message>> inbox = new HashMap<>();

    public void sendMessage(String content, String sender, String recipient) {
        Message message = new Message(content, sender, recipient);
        inbox.computeIfAbsent(recipient, k -> new ArrayList<>()).add(message);
    }

    public List<Message> getMessagesForRecipient(String recipient) {
        return inbox.getOrDefault(recipient, new ArrayList<>());
    }

    public void printAllMessages() {
        for (String recipient : inbox.keySet()) {
            for (Message msg : inbox.get(recipient)) {
                MessageFormatter.printSummary(msg);
                System.out.println("Content: " + msg.getContent());
            }
        }
    }
}
