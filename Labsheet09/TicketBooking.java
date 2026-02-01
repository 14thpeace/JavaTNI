import javax.swing.JOptionPane;

public class TicketBooking {

    public static void main(String[] args) {

        // ใช้ Movie จากข้อก่อนหน้า
        Movie movie = new Movie("Titanic", 120, "PG-13");

        // เรียก method จาก TicketInfo
        String showTime = TicketInfo.select_showtime(movie);
        String seat = TicketInfo.select_seat_number();

        // สร้างตั๋ว
        Ticket ticket = new Ticket("T001", movie, showTime, seat, 240.0);

        // Confirm dialog
        int confirm = JOptionPane.showConfirmDialog(
                null,
                "Do you want to book a " + movie.getTitle() + " ticket?",
                "Book Ticket",
                JOptionPane.YES_NO_OPTION
        );

        // ถ้ากด Yes → จองตั๋ว
        if (confirm == JOptionPane.YES_OPTION) {
            String result = ticket.bookTicket();
            JOptionPane.showMessageDialog(null, result);
        }

        // แสดงข้อมูลตั๋ว
        JOptionPane.showMessageDialog(null, ticket.toString());
    }
}