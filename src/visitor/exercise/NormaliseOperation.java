package visitor.exercise;

public class NormaliseOperation implements SegmentOperation{
    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Normalize FormatSegment");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Normalize FactSegment");
    }
}
