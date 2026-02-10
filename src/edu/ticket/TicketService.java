package edu.ticket;

public class TicketService {
    
    // به جای String state، حالا از اینترفیس استفاده می‌کنیم
    private TicketState state;

    public TicketService() {
        // وضعیت اولیه همیشه NEW است
        this.state = new NewState();
    }

    // این متد اجازه می‌دهد کلاس‌های وضعیت، وضعیت فعلی را تغییر دهند
    public void setState(TicketState state) {
        this.state = state;
    }

    public TicketState getState() {
        return state;
    }

    public void handle(String channel, String type) {
        // به جای اینکه اینجا تصمیم بگیریم، کار را به وضعیت فعلی می‌سپاریم
        state.handle(this, channel, type);
    }
}