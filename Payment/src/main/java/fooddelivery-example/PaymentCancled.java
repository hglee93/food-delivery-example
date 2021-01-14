package fooddelivery-example;

public class PaymentCancled extends AbstractEvent {

    private Long id;

    public PaymentCancled(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
