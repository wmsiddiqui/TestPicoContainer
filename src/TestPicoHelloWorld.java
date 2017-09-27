import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;

/**
 * Created by Waqar on 9/26/2017.
 */
public class TestPicoHelloWorld {
    public static void main (String[] args) {
        MutablePicoContainer pico = new DefaultPicoContainer();
        pico.addComponent(HelloWorldPhrase.class);
        pico.addComponent(Speaker.class);

        Speaker speaker = (Speaker) pico.getComponent(Speaker.class);
        speaker.Speak();
    }
}

