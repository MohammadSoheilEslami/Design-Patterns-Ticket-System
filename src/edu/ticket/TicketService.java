package edu.ticket;

public class TicketService {
    
    private TicketState state;
    private ResponseStrategy strategy; // فیلد جدید برای نگهداری استراتژی

    public TicketService() {
        this.state = new NewState();
        // یک استراتژی پیش‌فرض برای جلوگیری از ارور NullPointer
        this.strategy = new GenericResponseStrategy(); 
    }

    public void setState(TicketState state) {
        this.state = state;
    }

    // متدی که وضعیت‌ها (States) بتونن استراتژی رو صدا بزنن
    public ResponseStrategy getStrategy() {
        return strategy;
    }

    public void handle(String channel, String type) {
        // تعیین استراتژی در لحظه شروع کار
        // (این تنها جایی است که شرط چک می‌شود و بعد از آن همه چیز پلی‌مورفیک است)
        if (state instanceof NewState) {
            if (type != null && type.equalsIgnoreCase("BUG")) {
                this.strategy = new BugResponseStrategy();
            } else {
                this.strategy = new GenericResponseStrategy();
            }
        }
        
        // سپردن کار به وضعیت فعلی
        state.handle(this, channel, type);
    }
}