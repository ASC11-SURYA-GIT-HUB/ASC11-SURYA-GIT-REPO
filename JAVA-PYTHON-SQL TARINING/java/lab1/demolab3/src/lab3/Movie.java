package lab3;

public class Movie {
    private String movieName;
    private String producedBy;
    private String directedBy;
    private double duration;
    private int year;
    private String category;

    private final String movieId; // Read-only
    private static int moviesCount = 0;

    // Constructor with only mandatory fields
    public Movie(String movieName, String producedBy) {
        this.movieName = movieName;
        this.producedBy = producedBy;
        moviesCount++;
        this.movieId = movieName + "_" + moviesCount;
    }

    // Constructor with all fields
    public Movie(String movieName, String producedBy, String directedBy, double duration, int year, String category) {
        this(movieName, producedBy); // Call mandatory constructor
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    // Getter for movieId
    public String getMovieId() {
        return movieId;
    }

    public static int getMoviesCount() {
        return moviesCount;
    }

    // Method to display details
    public String showDetails() {
        return "MovieID: " + movieId + "\n" +
                "Name: " + movieName + "\n" +
                "Produced By: " + producedBy + "\n" +
                "Directed By: " + directedBy + "\n" +
                "Duration: " + duration + " hours\n" +
                "Year: " + year + "\n" +
                "Category: " + category;
    }
}
