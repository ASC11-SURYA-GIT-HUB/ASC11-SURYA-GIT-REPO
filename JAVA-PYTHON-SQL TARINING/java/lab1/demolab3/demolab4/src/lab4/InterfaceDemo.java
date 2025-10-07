package lab4;

// Interface A
interface Playable {
    void play();
}

// Interface B extending A
interface Downloadable extends Playable {
    void download();
}

// Class implementing multiple interfaces
class AudioFile implements Downloadable {
    String name;

    public AudioFile(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(name + " is playing.");
    }

    public void download() {
        System.out.println(name + " is downloading.");
    }
}

// Use interface reference
public class InterfaceDemo {
    public static void main(String[] args) {
        Downloadable file = new AudioFile("Song.mp3");
        file.play();
        file.download();
    }
}
