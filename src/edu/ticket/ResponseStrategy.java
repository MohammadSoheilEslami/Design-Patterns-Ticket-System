package edu.ticket;

public interface ResponseStrategy {
    // این متد برای مرحله ارجاع (Assigned) است
    void assign();

    // این متد برای مرحله پاسخ‌دهی (InProgress) است
    void reply();
}