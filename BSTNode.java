public class BSTNode<Peserta extends Comparable<Peserta>> {
    BSTNode<Peserta> leftNode;
    Peserta data;
    BSTNode<Peserta> rightNode;

    public BSTNode(Peserta nodeData) {
        data = nodeData;
        leftNode = rightNode = null;
    }

    public BSTNode<Peserta> getLeftNode() {
        return leftNode;
    }
    public Peserta getData() {
        return data;
    }
    public BSTNode<Peserta> getRightNode() {
        return rightNode;
    }

    public void insert(Peserta insertValue) {
        if (insertValue.compareTo(data) <= 0) {
            if (leftNode == null) {
                leftNode = new BSTNode<Peserta>(insertValue);
            } else {
                leftNode.insert(insertValue);
            }
        } else if (insertValue.compareTo(data) > 0) {
            if (rightNode == null) {
                rightNode = new BSTNode<Peserta>(insertValue);
            } else {
                rightNode.insert(insertValue);
            }
        }
    }
}
