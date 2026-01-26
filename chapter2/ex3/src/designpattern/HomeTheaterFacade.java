package designpattern;

public class HomeTheaterFacade {

    private TV tv = new TV();
    private SoundSystem sound = new SoundSystem();
    private DVDPlayer dvd = new DVDPlayer();

    public void watchMovie() {
        System.out.println("Start watching movie...");
        tv.on();
        sound.on();
        dvd.on();
    }
}
