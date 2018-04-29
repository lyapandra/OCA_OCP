package lambda.SpecialistTV.switcherFormVideo;

/**
 * Created by a on 02.04.2018.
 */
public class Radio implements ElectricityConsumer {
    void playMusic() {
        System.out.println("Radio plays music");
    }

    @Override
    public void electrisityOn() {
        playMusic();
    }
}
