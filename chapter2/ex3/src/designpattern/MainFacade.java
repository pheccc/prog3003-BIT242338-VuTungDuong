package designpattern;

public class MainFacade {
    public static void main(String[] args) {
        HomeTheaterFacade home = new HomeTheaterFacade();
        home.watchMovie();
    }
}
