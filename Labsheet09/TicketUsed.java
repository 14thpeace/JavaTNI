import javax.swing.JOptionPane;

public class TicketUsed {

    public static String show_movie_list(Ticket... tickets) {
        String msg = "";
        for (Ticket t : tickets) {
            msg += t.getTicket_id() + ": "
                    + t.getMovie().toString() + "\n";
        }
        return msg;
    }

    public static void main(String[] args) {

        Ticket[] tickets = new Ticket[] {
                new Ticket("T001", new Movie("Titanic", 120, "PG-13"), "12:00", "B7", 280),
                new Ticket("T002", new Movie("A Walk to Remember", 102, "PG"), "11:00", "G11", 240),
                new Ticket("T003", new Movie("Silent Hill", 125, "R-13"), "14:30", "H2", 240)
        };

        int start = JOptionPane.showConfirmDialog(
                null,
                "Do you want to book or use a ticket?",
                "Ticket",
                JOptionPane.YES_NO_OPTION
        );

        if (start != JOptionPane.YES_OPTION) {
            return;
        }

        boolean working = true;

        while (working) {

            String input = JOptionPane.showInputDialog(
                    show_movie_list(tickets) +
                            "\nEnter a ticket id for booking:"
            );

            if (input == null) break;
            input = input.trim();

            // ข้อ 3 — หา ticket ตาม id
            Ticket selected = null;
            for (Ticket t : tickets) {
                if (t.getTicket_id().equalsIgnoreCase(input)) {
                    selected = t;
                    break;
                }
            }

            if (selected == null) {
                JOptionPane.showMessageDialog(null, "Ticket not found");
                continue;
            }

            String menu = JOptionPane.showInputDialog(
                    selected.getTicket_id() + ": "
                            + selected.getMovie().toString()
                            + "\n\nPress 1 to book a ticket"
                            + "\nPress 2 to use a ticket"
                            + "\nPress 3 to see a ticket status"
                            + "\n\nEnter a menu:"
            );

            if (menu == null) break;
            menu = menu.trim();

            if (menu.equals("1")) {

                String r = selected.bookTicket();
                JOptionPane.showMessageDialog(null,
                        r + "\n------------------\n" + selected.toString());

            }
            else if (menu.equals("2")) {

                String r = selected.useTicket();
                JOptionPane.showMessageDialog(null,
                        r + "\n------------------\n" + selected.toString());

            }
            else if (menu.equals("3")) {

                JOptionPane.showMessageDialog(null,
                        selected.toString());

            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid menu");
            }

            int again = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to book or use other tickets?",
                    "Ticket",
                    JOptionPane.YES_NO_OPTION
            );

            if (again != JOptionPane.YES_OPTION) {
                working = false;
            }
        }
    }
}
