package visitor.exercise;

public class ReduceNoiseOperation implements SegmentOperation{
    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Reduce FormatSegment noise");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Reduce FactSegment noise");
    }
}
