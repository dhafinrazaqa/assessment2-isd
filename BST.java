public class BST<Peserta extends Comparable<Peserta>> {
    BSTNode<Peserta> root;

    public BST() {
        root = null;
    }

    public void insertNode(Peserta insertValue) {
        if (root == null) {
            root = new BSTNode<Peserta>(insertValue);
        } else {
            root.insert(insertValue);
        }
    }

    public void searchBST (Peserta key) {
        boolean result = searchBSTHelper(root, key);
        if (result) {
            System.out.println("Data telah dimasukkan");
        } else {
            System.out.println("Data tidak ditemukan, belum dimasukkan");
        }
    }
    public boolean searchBSTHelper(BSTNode<Peserta> node, Peserta key) {
        boolean result = false;

        if (node != null) {
            if (key.equals(node.getData())) {
                result = true;
            } else if (key.compareTo(node.getData()) < 0) {
                result = searchBSTHelper(node.getLeftNode(), key);
            } else {
                result = searchBSTHelper(node.getRightNode(), key);
            }
        }
        return result;
    }

    public void inOrder() {
        inOrderRec(root);
    }
    public void inOrderRec(BSTNode<Peserta> root) {
        if (root != null) {
            inOrderRec(root.getLeftNode());
            System.out.println(root.getData());
            inOrderRec(root.getRightNode());
        }
    }

    public void displayWinner() {
        displayWinnerRec(root);
    }
    public void displayWinnerRec(BSTNode<Peserta> root) {
        if (root.getRightNode() != null) {
            inOrderRec(root.getRightNode());
        } else {
            System.out.println(root.getData());
        }
    }
}