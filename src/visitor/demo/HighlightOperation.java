package visitor.demo;

import visitor.problem.AnchorNode;
import visitor.problem.HeaderNode;

public class HighlightOperation implements Operation{
    @Override
    public void apply(HeaderNode headerNode) {
        System.out.println("high-light HeaderNode");
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("high-light AnchorNode");
    }
}
