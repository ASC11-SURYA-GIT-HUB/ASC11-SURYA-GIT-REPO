package lab3;

public class InternationalMovie extends Movie {
    private String country;
    private String language;

    public InternationalMovie(String movieName, String producedBy, String directedBy, double duration,
                              int year, String category, String country, String language) {
        super(movieName, producedBy, directedBy, duration, year, category);
        this.country = country;
        this.language = language;
    }

    @Override
    public String showDetails() {
        return super.showDetails() + "\n" +
                "Country: " + country + "\n" +
                "Language: " + language;
    }

    public void subtitlesInfo() {
        System.out.println("Subtitles available in multiple languages.");
    }
}
