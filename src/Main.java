import edu.ticket.TicketService;

public class Main {

    public static void main(String[] args) {
        // Create the service (Initial state: NEW)
        TicketService ticketService = new TicketService();

        System.out.println("--- Ticket Lifecycle Start ---");

        // Step 1: State changes from NEW to ASSIGNED
        System.out.println("\n[Step 1: Creating Ticket]");
        ticketService.handle("WEB", "BUG");

        // Step 2: State changes from ASSIGNED to IN_PROGRESS
        System.out.println("\n[Step 2: Assigning Ticket]");
        ticketService.handle("WEB", "BUG");

        // Step 3: State changes from IN_PROGRESS to RESOLVED
        System.out.println("\n[Step 3: Working on Ticket]");
        ticketService.handle("WEB", "BUG");

        // Step 4: State changes from RESOLVED to CLOSED
        System.out.println("\n[Step 4: Resolving Ticket]");
        ticketService.handle("WEB", "BUG");

        // Step 5: Ticket is CLOSED (No further changes)
        System.out.println("\n[Step 5: Closing Ticket]");
        ticketService.handle("WEB", "BUG");
        
        System.out.println("\n--- Ticket Lifecycle End ---");
    }
}