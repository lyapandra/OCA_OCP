package lambda.SpecialistTV.switcherFormVideo;

/**
 * Created by a on 02.04.2018.
 */
public class Radio2 implements ElectricityConsumer2 {
    void playMusic() {
        System.out.println("Radio plays music");
    }

    @Override
    public void electrisityOn(Object sender) {
        playMusic();
    }
}
