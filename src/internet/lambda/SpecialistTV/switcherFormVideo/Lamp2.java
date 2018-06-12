package internet.lambda.SpecialistTV.switcherFormVideo;

/**
 * Created by a on 02.04.2018.
 */
public class Lamp2 implements ElectricityConsumer2 {
static String name;
String number;
    public void lightOn() {
        System.out.println(name + "_" + number + " is ON");

    }

    @Override
    public void electrisityOn(Object sender) {
        lightOn();
    }
}
