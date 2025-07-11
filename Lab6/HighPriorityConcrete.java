import java.time.LocalDate;

public class HighPriorityConcrete implements RequestProduct {
    private String priority;
    private String status;
    private String expireDay;

    public void setPriority() {
        this.priority = "Emergency";
    }

    public void setStatus() {
        this.status = "Accept";
    }

    public void setExpire() {
        this.expireDay = LocalDate.now().toString();
    }

    public void processRequest() {
        System.out.println("Emergency request, our Administer will contact you immediately! ");
    }

}
