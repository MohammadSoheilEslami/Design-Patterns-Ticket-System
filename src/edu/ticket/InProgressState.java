package edu.ticket;

public class InProgressState implements TicketState {
    @Override
    public void handle(TicketService context, String channel, String type) {
        System.out.println("Working on ticket");

        // منطق پاسخ‌دهی
        if (type.equals("BUG")) {
            System.out.println("Sending bug response");
        } else {
            System.out.println("Sending generic response");
        }

        // تغییر وضعیت به مرحله بعد (Resolved)
        context.setState(new ResolvedState());
    }
}