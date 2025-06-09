package headFirst06;


import headFirst06.commadImpl.*;
import headFirst06.entity.GarageDoor;
import headFirst06.entity.Light;
import headFirst06.entity.Stereo;
import headFirst06.remoteControl.RemoteControl;
import headFirst06.remoteControl.SimpleRemoteControl;

/**
 * Created by wangjize on 2025/6/9.
 */

/*
 * 命令模式
 * 将"请求"封装成对象,以便使用不同的请求、队列或者日志来参数化其它对象。命令模式也支持可撤销的操作。
 */
public class MainTest {
    public static void commandPattern() {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor("Car");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        GarageDoorUpCommand gdUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand gdDownCommand = new GarageDoorDownCommand(garageDoor);
        GarageDoorLightOnCommand gdLightOnCommand = new GarageDoorLightOnCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        simpleRemoteControl.setCommand(gdLightOnCommand);
        simpleRemoteControl.buttonWasPressed();

        remoteControl.setCommand(0,livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(1,kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setCommand(2,gdUpCommand, gdDownCommand);
        remoteControl.setCommand(3,stereoOnWithCDCommand, stereoOffCommand);

        System.out.println(remoteControl.toSting());

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();
    }
}
