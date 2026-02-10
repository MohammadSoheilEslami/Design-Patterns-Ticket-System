package edu.ticket;

public interface TicketState {
    // متدی که رفتار هر وضعیت را تعریف می‌کند
    void handle(TicketService context, String channel, String type);
}