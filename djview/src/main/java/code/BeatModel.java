package code;

import javax.sound.midi.*;
import java.util.ArrayList;

public class BeatModel implements BeatModelInterface {
    Sequencer sequencer;
    int bpm = 90;
    String ss;
    Sequence sequence;
    Track track;

    public String getSs() {
        return ss;
    }

    @Override
    public void initialize() {
        setUpMidi();
    }

    @Override
    public void on() {
        System.out.println("Starting the sequencer");
        sequencer.start();
        setBPM(90);
    }

    @Override
    public void off() {
        setBPM(0);
        sequencer.stop();
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        sequencer.setTempoInBPM(getBPM());
    }


    public void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(getBPM());
            sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
