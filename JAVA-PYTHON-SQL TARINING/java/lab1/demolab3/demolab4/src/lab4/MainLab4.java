package lab4;

import lab3.*;

public class MainLab4 {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];

        movies[0] = new Movie("Hello", "XYZ Productions", "John", 2.1, 2022, "Drama");
        movies[1] = new SpecialMovie("Avengers", "Marvel", "Joss", 2.5, 2019, "Action", "Dolby Atmos", "IMAX 3D");
        movies[2] = new InternationalMovie("Parasite", "CJ Entertainment", "Bong", 2.0, 2019, "Thriller", "South Korea", "Korean");

        for (Movie m : movies) {
            System.out.println(m.showDetails()); // Polymorphism
            System.out.println();

            // Typecasting to call subclass-specific methods
            if (m instanceof SpecialMovie) {
                ((SpecialMovie) m).specialFeature();
            } else if (m instanceof InternationalMovie) {
                ((InternationalMovie) m).subtitlesInfo();
            }

            System.out.println("================================");
        }
    }
}
