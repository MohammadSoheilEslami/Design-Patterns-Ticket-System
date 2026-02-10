package edu.ticket;

public class BugResponseStrategy implements ResponseStrategy {
    @Override
    public void assign() {
        System.out.println("Assigned to engineering");
    }

    @Override
    public void reply() {
        System.out.println("Sending bug response");
    }
}