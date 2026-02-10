package edu.ticket;

public class InProgressState implements TicketState {
    @Override
    public void handle(TicketService context, String channel, String type) {
        System.out.println("Working on ticket");

        // استفاده از استراتژی برای چاپ پیام پاسخ
        context.getStrategy().reply();

        // تغییر وضعیت به مرحله بعد
        context.setState(new ResolvedState());
    }
}