import edu.ticket.TicketService;

public class Main {

    public static void main(String[] args) {

        TicketService ticketService = new TicketService();

        // Example 1: Bug reported from web
        ticketService.handle("WEB", "BUG");

        System.out.println("------------");

        // Example 2: Question reported via email
        ticketService.handle("EMAIL", "QUESTION");
    }
}
