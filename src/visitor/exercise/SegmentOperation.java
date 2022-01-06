package visitor.exercise;

public interface SegmentOperation {
    void apply(FormatSegment formatSegment);
    void apply(FactSegment factSegment);
}
