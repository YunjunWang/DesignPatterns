package visitor.demo;

import visitor.problem.AnchorNode;
import visitor.problem.HeaderNode;

public interface Operation {
    void apply(HeaderNode headerNode);
    void apply(AnchorNode anchorNode);
}
