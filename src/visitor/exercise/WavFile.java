package visitor.exercise;

import java.util.ArrayList;
import java.util.List;

public class WavFile{
    private List<Segment> segments = new ArrayList<>();

    public static WavFile read(String fileName) {
        // Simulate reading a wav file and building the segments
        var wavFile = new WavFile();
        wavFile.segments.add(new FormatSegment());
        wavFile.segments.add(new FactSegment());
        wavFile.segments.add(new FactSegment());
        wavFile.segments.add(new FactSegment());

        return wavFile;
    }


    public void reduceNoise() {
        for (var segment : segments)
            segment.execute(new ReduceNoiseOperation());
    }

    public void addReverb() {
        for (var segment : segments)
            segment.execute(new AddReverbOperation());
    }

    public void normalize() {
        for (var segment : segments)
            segment.execute(new NormaliseOperation());
    }
}
