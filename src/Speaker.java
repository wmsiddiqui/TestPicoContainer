public class Speaker {
    private IPhrase _phrase;
    public Speaker(IPhrase phrase) {
        _phrase = phrase;
    }
    public void Speak() {
        System.out.println(_phrase.SayPhrase());
    }
}
