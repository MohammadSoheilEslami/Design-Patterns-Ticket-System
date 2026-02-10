package edu.ticket;

public class NewState implements TicketState {
    @Override
    public void handle(TicketService context, String channel, String type) {
        System.out.println("Ticket created");

        if (channel.equals("WEB")) {
            System.out.println("Received from web");
        } else if (channel.equals("EMAIL")) {
            System.out.println("Received from email");
        }

        context.setState(new AssignedState());
    }
}