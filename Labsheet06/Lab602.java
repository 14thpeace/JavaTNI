import java.util.Scanner;

public class Lab602 {
    public static int find_rank(double[] scores, double targetScore){
        int rank = 1;
        for (int i = 0; i < scores.length; i++){
            if (scores[i] > targetScore){
                rank++;
            }
        }
        return rank;
    }

    public static void main(String[] args) {

        String[] movies = {
                "Me Before You",
                "Titanic",
                "Before Sunrise",
                "The Holiday",
                "A Walk to Remember"};

        double[] rate_scores = {4.2, 4.9, 4.4, 3.7, 4.3};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a movie title : ");
        String title = sc.nextLine();

        boolean found = false;

        for (int i =0 ; i< movies.length; i++){
            if (title.equalsIgnoreCase(movies[i])){
                System.out.println("\nThe rating score of \"" + movies[i] + "\" is \"" + rate_scores[i]);


                int rank = find_rank(rate_scores, rate_scores[1]);
                System.out.println("This movie is ranked number " + rank);

                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Cannot found this movie title...");
        }


    }
}