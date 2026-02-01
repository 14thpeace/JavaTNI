public class Movie {

    private String title;
    private int minutes;
    private String rating;

    public Movie(String title, int minutes, String rating) {
        this.title = title;
        this.minutes = minutes;
        this.rating = rating;
    }
    public Movie(){
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + " (" + rating + ", " + minutes + " mins)";
    }
}
