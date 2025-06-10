package headFirst07.facade;


import headFirst07.facade.entity.*;

/**
 * Created by wangjize on 2025/6/10.
 */

/*
 * 外观模式
 * 提供了一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用。
 */
public class MainTest {
    public static void facadePattern() {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();
        CdPlayer cd = new CdPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheaterFacade =
                new HomeTheaterFacade(amp, tuner, dvd, cd, projector, lights, screen, popper);

        homeTheaterFacade.watchMovie("Raiders of the Lost Ark");
        System.out.println("\n----------\n");
        homeTheaterFacade.endMovie("Raiders of the Lost Ark");
    }

}
