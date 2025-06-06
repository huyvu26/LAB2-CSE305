import java.time.LocalDate;

public class MidPriorityConcrete implements RequestProduct {
    private String priority;
    private String status;
    private String expireDay;

    public void setPriority() {
        this.priority = "Medium";
    }

    public void setStatus() {
        this.status = "Accepted";
    }

    public void setExpire() {
        this.expireDay = LocalDate.now().plusMonths(1).toString();
    }

    public void processRequest() {
        System.out.println("Request accept, estimated completion day is " + this.expireDay);
    }

}
