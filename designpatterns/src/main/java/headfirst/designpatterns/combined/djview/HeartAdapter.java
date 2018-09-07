package headfirst.designpatterns.combined.djview;

public class HeartAdapter implements BeatModelInterface {
    HeartModelInterface heart;

    public HeartAdapter(HeartModelInterface heart) {
        this.heart = heart;
    }

    @Override
    public void initialize() {
    }

    public void on() {
    }

    public void off() {
    }

    @Override
    public int getBPM() {
        return heart.getHeartRate();
    }

    @Override
    public void setBPM(int bpm) {
    }

    public void registerObserver(BeatObserver o) {
        heart.registerObserver(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        heart.removeObserver(o);
    }

    public void registerObserver(BPMObserver o) {
        heart.registerObserver(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        heart.removeObserver(o);
    }
}
