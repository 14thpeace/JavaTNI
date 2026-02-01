import javax.swing.JOptionPane;

public class TicketInfo {

    public static String select_showtime(Movie movie) {

        String msg = movie.toString() +
                "\nPress 1 to select show time = 13:00" +
                "\nPress 2 to select show time = 14:30" +
                "\nPress 3 to select show time = 15:00";

        String input = JOptionPane.showInputDialog(msg);

        if ("2".equals(input)) return "14:30";
        if ("3".equals(input)) return "15:00";
        return "13:00";
    }

    public static String select_seat_number() {

        String row = JOptionPane.showInputDialog("Select seat row [A-G]");
        if (row == null || row.isEmpty()) row = "A";
        row = row.toUpperCase();

        String num = JOptionPane.showInputDialog("Select seat number [1-12]");
        if (num == null || num.isEmpty()) num = "1";

        return row + num;
    }

    static void main() {

        Movie movie = new Movie("Titanic", 120, "PG-13");

        String showTime = TicketInfo.select_showtime(movie);

        String seat = TicketInfo.select_seat_number();

        Ticket ticket = new Ticket("T001", movie, showTime, seat, 240.0);

        JOptionPane.showMessageDialog(null, ticket.toString());
    }
}