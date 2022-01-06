package visitor.demo;

import visitor.problem.AnchorNode;
import visitor.problem.HeaderNode;

public class PlainTextOperation implements Operation{
    @Override
    public void apply(HeaderNode headerNode) {
        System.out.println("plain-text HeaderNode");
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("plain-text AnchorNode");
    }
}
