
import java.util.Scanner;

public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {

        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static void main(String[] args) {
        // Movie movie=new Adventure("star wars");
        // movie.watchMovie();
        //
        // movie=new Comedy("The");
        // movie.watchMovie();
        //
        // movie=new ScienceFiction("Sat");
        // movie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true) {

            System.out.println("Enter (A for adventure, C for comedy , S for Science Fiction or Q to quit");
            String type = s.nextLine();

            if ("Qq".contains(type)) {
                break;
            }
            System.out.println("Enter movie title");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }

    }

    private static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}