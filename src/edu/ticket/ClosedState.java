package edu.ticket;

public class ClosedState implements TicketState {
    @Override
    public void handle(TicketService context, String channel, String type) {
        System.out.println("Ticket closed");
        // اینجا پایان خط است و دیگر تغییر وضعیتی نداریم
    }
}