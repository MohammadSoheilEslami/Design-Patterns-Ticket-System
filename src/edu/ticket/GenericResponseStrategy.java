package edu.ticket;

public class GenericResponseStrategy implements ResponseStrategy {
    @Override
    public void assign() {
        System.out.println("Assigned to support");
    }

    @Override
    public void reply() {
        System.out.println("Sending generic response");
    }
}