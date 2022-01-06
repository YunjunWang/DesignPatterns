package visitor.problem;

import visitor.demo.Operation;

public class HeaderNode implements HtmlNode{
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
//    @Override
//    public void highlight() {
//        System.out.println("high-light HeaderNode");
//    }
//
//    @Override
//    public void plaintext() {
//        System.out.println("plain-text Header Node");
//    }
}
