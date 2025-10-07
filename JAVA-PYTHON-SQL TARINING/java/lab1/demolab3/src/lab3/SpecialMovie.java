package lab3;

public class SpecialMovie extends Movie {
    private String soundEffectsTechnology;
    private String visualEffectsTechnology;

    public SpecialMovie(String movieName, String producedBy, String directedBy, double duration,
                        int year, String category, String soundTech, String visualTech) {
        super(movieName, producedBy, directedBy, duration, year, category);
        this.soundEffectsTechnology = soundTech;
        this.visualEffectsTechnology = visualTech;
    }

    @Override
    public String showDetails() {
        return super.showDetails() + "\n" +
                "Sound Effects: " + soundEffectsTechnology + "\n" +
                "Visual Effects: " + visualEffectsTechnology;
    }

    public void specialFeature() {
        System.out.println("Exclusive behind-the-scenes content!");
    }
}
