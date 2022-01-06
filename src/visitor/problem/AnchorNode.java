package visitor.problem;

import visitor.demo.Operation;

public class AnchorNode implements HtmlNode{
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }

//    @Override
//    public void highlight() {
//        System.out.println("hight-light AnchorNode");
//    }
//
//    @Override
//    public void plaintext() {
//        System.out.println("plain-text AnchorNode");
//    }
}
