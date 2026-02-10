package edu.ticket;

public class AssignedState implements TicketState {
    @Override
    public void handle(TicketService context, String channel, String type) {
        // استفاده از استراتژی برای چاپ پیام ارجاع
        context.getStrategy().assign();
        
        // تغییر وضعیت به مرحله بعد
        context.setState(new InProgressState());
    }
}