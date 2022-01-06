package visitor.exercise;

public class FormatSegment extends Segment {

    @Override
    void execute(SegmentOperation operation) {
        operation.apply(this);
    }
}
