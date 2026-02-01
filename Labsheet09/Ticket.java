public class Ticket {

    private String ticket_id;
    private Movie movie;
    private String show_time;
    private String seat_number;
    private double price;
    private boolean is_booked;
    private boolean is_used;

    public Ticket(String ticket_id, Movie movie, String show_time,
                  String seat_number, double price) {
        this.ticket_id = ticket_id;
        this.movie = movie;
        this.show_time = show_time;
        this.seat_number = seat_number;
        this.price = price;
        this.is_booked = false;
        this.is_used = false;
    }

    public Ticket() {

    }

    // getTicket_id()
    public String getTicket_id() {
        return ticket_id;
    }

    // getMovie()
    public Movie getMovie() {
        return movie;
    }

    // bookTicket()
    public String bookTicket() {
        if (is_booked) {
            return "This ticket is already booked";
        }
        is_booked = true;
        return "Ticket booked successfully!";
    }

    // useTicket()
    public String useTicket() {
        if (!is_booked) {
            return "Please book the ticket first";
        }

        if (is_used) {
            return "Ticket already used";
        }

        is_used = true;
        return "Enjoy the movie!";
    }

    // toString()
    @Override
    public String toString() {
        return "Ticket Id: " + ticket_id + "\n" +
                "Movie: " + movie.toString() + "\n" +
                "Show Time: " + show_time + "\n" +
                "Seat Number: " + seat_number + "\n" +
                "Ticket Price: " + price + "\n" +
                "Booked: " + (is_booked ? "Yes" : "No") + "\n" +
                "Used: " + (is_used ? "Yes" : "No");
    }
}
