package lambda.SpecialistTV.switcherFormVideo;

/**
 * Created by a on 02.04.2018.
 */
public class ProgramFromVideo {
    public static void fire(Object sender) {
        System.out.println("Fire from fire()");
    }
    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp01 = new Lamp();
        Radio r01 = new Radio();
        lamp01.name = "lamp";
        lamp01.number = "01";
        Lamp lamp02 = new Lamp();
        sw.addElectricityListener(lamp01);
        sw.addElectricityListener(lamp02);
        sw.addElectricityListener(r01);
        sw.addElectricityListener(()-> System.out.println("Fire!!!"));
        sw.switchOn();

        Switcher sw2 = new Switcher();
        Lamp2 lamp21 = new Lamp2();
        sw2.addElectricityListener2(lamp21);
        sw2.addElectricityListener2(s-> System.out.println("Fire_2!!!"));
        String message01 = "Message01"; // final or effective final
        sw2.addElectricityListener2(s-> System.out.println(message01));
        sw2.addElectricityListener2(s -> ProgramFromVideo.fire(s));
        // =>
        sw2.addElectricityListener2(ProgramFromVideo::fire); // `cos static


        sw2.switchOn();
    }
}
