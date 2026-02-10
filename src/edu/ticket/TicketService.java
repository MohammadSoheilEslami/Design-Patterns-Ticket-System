package edu.ticket;

public class TicketService {

    private String state = "NEW";

    public void handle(String channel, String type) {

        if (state.equals("NEW")) {
            System.out.println("Ticket created");

            if (channel.equals("WEB")) {
                System.out.println("Received from web");
            } else if (channel.equals("EMAIL")) {
                System.out.println("Received from email");
            }

            state = "ASSIGNED";
        }

        if (state.equals("ASSIGNED")) {
            if (type.equals("BUG")) {
                System.out.println("Assigned to engineering");
            } else {
                System.out.println("Assigned to support");
            }
            state = "IN_PROGRESS";
        }

        if (state.equals("IN_PROGRESS")) {
            System.out.println("Working on ticket");

            if (type.equals("BUG")) {
                System.out.println("Sending bug response");
            } else {
                System.out.println("Sending generic response");
            }

            state = "RESOLVED";
        }

        if (state.equals("RESOLVED")) {
            System.out.println("Ticket resolved");
            state = "CLOSED";
        }

        if (state.equals("CLOSED")) {
            System.out.println("Ticket closed");
        }

        System.out.println("Logging ticket handling");
    }
}
