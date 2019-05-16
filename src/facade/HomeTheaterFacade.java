package facade;

import facade.entity.*;

/**
 * @ClassName HomeTheaterFacade
 * @Description 电影院外观模式
 * @Author Duplicator
 * @Date 2019/5/16 10:46
 * @Version 1.0
 **/
public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;
    private TheaterLights theaterLights;

    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
        this.theaterLights = TheaterLights.getInstance();
    }

    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        dvdPlayer.setdvd();
        theaterLights.dim(10);
    }
    public void end(){
        popcorn.off();
        theaterLights.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.setdvd();
        dvdPlayer.off();
    }

    public void play(){
        dvdPlayer.play();
    }

    public void pause(){
        dvdPlayer.pause();
    }
}
