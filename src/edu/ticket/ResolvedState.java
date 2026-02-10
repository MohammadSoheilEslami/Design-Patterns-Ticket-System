package edu.ticket;

public class ResolvedState implements TicketState {
    @Override
    public void handle(TicketService context, String channel, String type) {
        System.out.println("Ticket resolved");

        // تغییر وضعیت به مرحله بعد (Closed)
        context.setState(new ClosedState());
    }
}