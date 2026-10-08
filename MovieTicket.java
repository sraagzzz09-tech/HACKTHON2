class MovieTicket {
    String movieName;
    double ticketPrice;
    int numberOfTickets;

    MovieTicket(String name, double price, int tickets) {
        movieName = name;
        ticketPrice = price;
        numberOfTickets = tickets;
    }

    double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    double calculateDiscount() {
        if (numberOfTickets >= 5) {
            //taking 10% discount as 0.10.
            return calculateTotal() * 0.10;
        } else {
            return 0;
        }
    }

    double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    void displayBill(double total, double discount, double finalAmount) {
        System.out.println("----- CINEMA TICKET BOOKING BILL -----");
        System.out.println("Movie Name       : " + movieName);
        System.out.printf("Ticket Price     : %.2f%n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf("Total Amount     : %.2f%n", total);
        System.out.printf("Discount         : %.2f%n", discount);
        System.out.printf("Final Amount     : %.2f%n", finalAmount);
    }
}

public class Main {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Doomsday", 250.00, 5);

        double total = ticket.calculateTotal();
        double discount = ticket.calculateDiscount();
        double finalAmount = ticket.calculateFinalAmount();

        ticket.displayBill(total, discount, finalAmount);
    }
}
 