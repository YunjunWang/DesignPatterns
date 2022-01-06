package visitor.exercise;

public class FactSegment extends Segment {

    @Override
    void execute(SegmentOperation operation) {
        operation.apply(this);
    }
}
