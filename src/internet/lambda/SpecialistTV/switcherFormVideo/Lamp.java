package internet.lambda.SpecialistTV.switcherFormVideo;

/**
 * Created by a on 02.04.2018.
 */
public class Lamp implements ElectricityConsumer {
static String name;
String number;
    public void lightOn() {
        System.out.println(name + "_" + number + " is ON");

    }

    @Override
    public void electrisityOn() {
        lightOn();
    }
}
