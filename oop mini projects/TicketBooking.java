
class TicketCounter {

    int availableSeats = 5;

    synchronized void bookTicket(String name, int seats) {

        System.out.println(name + " is trying to book " + seats + " seats.");

        if (availableSeats >= seats) {
            System.out.println("Booking successful for " + name);
            availableSeats -= seats;
            System.out.println("Remaining seats: " + availableSeats);
        } else {
            System.out.println("Sorry " + name + ", seats not available!");
        }
    }
}

class BookingThread extends Thread {

    TicketCounter counter;
    String customer;
    int seats;

    BookingThread(TicketCounter counter, String customer, int seats) {
        this.counter = counter;
        this.customer = customer;
        this.seats = seats;
    }

    public void run() {
        counter.bookTicket(customer, seats);
    }
}

public class TicketBooking {

    public static void main(String[] args) {

        TicketCounter counter = new TicketCounter();

        BookingThread t1 = new BookingThread(counter, "Rahul", 3);
        BookingThread t2 = new BookingThread(counter, "Amit", 2);
        BookingThread t3 = new BookingThread(counter, "Priya", 2);

        t1.start();
        t2.start();
        t3.start();
    }
}
