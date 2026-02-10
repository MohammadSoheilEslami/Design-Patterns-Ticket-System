package edu.ticket;

public class AssignedState implements TicketState {
    @Override
    public void handle(TicketService context, String channel, String type) {
        // منطق مربوط به نوع باگ
        if (type.equals("BUG")) {
            System.out.println("Assigned to engineering");
        } else {
            System.out.println("Assigned to support");
        }

        // تغییر وضعیت به مرحله بعد (In Progress)
        context.setState(new InProgressState());
    }
}