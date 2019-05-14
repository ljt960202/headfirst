package command.commandmode.command;

import command.commandmode.Light;
import command.commandmode.Stereo;

/**
 * @ClassName ControlTest
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/14 14:39
 * @Version 1.0
 **/
public class ControlTest {
    public static void main(String[] args) {
        CommandModeControl control = new CommandModeControl();
        Light bedRoomLight = new Light("bedRoom");
        Light kitchLight = new Light("kitch");
        Stereo stereo = new Stereo();

        LightOnCommand bedRoomLightOn = new LightOnCommand(bedRoomLight);
        LightOffCommand bedRoomLightOff = new LightOffCommand(bedRoomLight);
        LightOnCommand kitchLightOn = new LightOnCommand(kitchLight);
        LightOffCommand kitchLightOff = new LightOffCommand(kitchLight);

        Command[] onCommands = {bedRoomLightOn,kitchLightOn};
        Command[] offCommands = {bedRoomLightOff,kitchLightOff};
        MacroCommand onMacro = new MacroCommand(onCommands);
        MacroCommand offMacro = new MacroCommand(offCommands);


        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        StereoAddVolCommand stereoAddVol= new StereoAddVolCommand(stereo);
        StereoSubVolCommand stereoSubVol = new StereoSubVolCommand(stereo);

        control.setCommand(0,bedRoomLightOn,bedRoomLightOff);
        control.setCommand(1,kitchLightOn,kitchLightOff);
        control.setCommand(2,stereoOn,stereoOff);
        control.setCommand(3,stereoAddVol,stereoSubVol);
        control.setCommand(4,onMacro,offMacro);

        control.onButton(0);
        control.undoButton(0);
        //control.offButton(0);
        control.onButton(1);
        control.offButton(1);
        control.onButton(2);
        control.onButton(3);
        control.offButton(3);
        control.undoButton(3);
        control.offButton(2);
        control.undoButton(2);

        control.onButton(4);
        control.offButton(4);
        control.undoButton(4);
    }



}
