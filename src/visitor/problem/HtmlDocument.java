package visitor.problem;

import visitor.demo.HighlightOperation;
import visitor.demo.Operation;
import visitor.demo.PlainTextOperation;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {

    private List<HtmlNode> nodes = new ArrayList<>();

    public void addNode(HtmlNode node) {
        nodes.add(node);
    }

    public List<HtmlNode> getNodes() {
        return nodes;
    }

    public void execute(Operation operation) {
        for (HtmlNode node : nodes) {
            node.execute(operation);
        }
    }

//    public void highlight() {
//        for (HtmlNode node : nodes) {
//            node.execute(new HighlightOperation());
////            node.highlight();
//        }
//    }
//
//    public void plaintext() {
//        for (HtmlNode node : nodes) {
//            node.execute(new PlainTextOperation());
////            node.plaintext();
//        }
//    }
}
