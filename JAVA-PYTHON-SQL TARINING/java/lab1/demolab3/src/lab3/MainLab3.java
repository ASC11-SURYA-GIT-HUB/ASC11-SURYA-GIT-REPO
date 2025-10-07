package lab3;

public class MainLab3 {
    public static void main(String[] args) {
        Movie m1 = new Movie("Hello", "XYZ Productions", "John", 2.1, 2022, "Drama");
        SpecialMovie sm = new SpecialMovie("Avengers", "Marvel", "Joss", 2.5, 2019, "Action", "Dolby Atmos", "IMAX 3D");
        InternationalMovie im = new InternationalMovie("Parasite", "CJ Entertainment", "Bong", 2.0, 2019, "Thriller", "South Korea", "Korean");

        System.out.println(m1.showDetails());
        System.out.println("-----------");
        System.out.println(sm.showDetails());
        System.out.println("-----------");
        System.out.println(im.showDetails());
    }
}
