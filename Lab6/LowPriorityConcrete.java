import java.time.LocalDate;

public class LowPriorityConcrete implements RequestProduct {
    private String priority;
    private String status;
    private String expireDay;

    public void setPriority() {
        this.priority = "Ignore";
    }

    public void setStatus() {
        this.status = "Done";
    }

    public void setExpire() {
        this.expireDay = LocalDate.now().toString();
    }

    public void processRequest() {
        System.out.println("Request denied");
    }

}
