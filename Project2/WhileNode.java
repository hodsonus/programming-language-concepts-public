import java.util.ArrayList;

public class WhileNode extends LoopNode {

    public WhileNode(NumNode condition, ArrayList<ExprNode> expressions) {
        this.condition = condition;
        this.expressions = expressions;
    }
}