package visitor.exercise;

public class AddReverbOperation implements SegmentOperation{
    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Add reverb to FormatSegment");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Add reverb to FactSegment");
    }
}
