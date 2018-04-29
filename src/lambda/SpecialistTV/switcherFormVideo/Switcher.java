package lambda.SpecialistTV.switcherFormVideo;

import java.util.ArrayList;
import java.util.List;
public class Switcher {
//    public ElectricityConsumer consumer;
    private List<ElectricityConsumer> listeners = new ArrayList<>();
    private List<ElectricityConsumer2> listeners2 = new ArrayList<>();

    public void addElectricityListener( ElectricityConsumer listener)
    {
        listeners.add(listener);
    }
    public void addElectricityListener2( ElectricityConsumer2 listener)
    {
        listeners2.add(listener);
    }

    public void removeElectricityListener( ElectricityConsumer listener)
    {
        listeners.remove(listener);
    }

    public void switchOn(){
        System.out.println("Switcher is ON");
//        if (consumer !=  null)
//            consumer.electrisityOn();

    for (ElectricityConsumer c : listeners)
        c.electrisityOn();

    for (ElectricityConsumer2 c2 : listeners2)
        c2.electrisityOn(this);
    }
}
