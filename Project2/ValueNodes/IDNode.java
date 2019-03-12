package ValueNodes;

public class IDNode extends NumNode {

    public String id;

    public IDNode(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}