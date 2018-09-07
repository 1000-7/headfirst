package code;

public interface BeatModelInterface {
    void initialize();

    void on();

    void off();

    int getBPM();

    void setBPM(int bpm);


}
