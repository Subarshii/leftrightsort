import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

    private Node root;

    public BinarySearch(int x) {
        this.root = this.getNode(x);
    }


    public Node getNode(int x) {

        Node node = new Node();
        node.value = x;
        node.left = null;
        node.right = null;
        return node;
    }

    private void addLeft(Node parent, int x) {

        parent.left = this.getNode(x);
    }

    private void addRight(Node parent, int x) {

        parent.right = this.getNode(x);
    }

    void addnode(Node node, int x) {
        if (x > node.value && node.right == null) {
            this.addRight(node, x);

        }
        if (x > node.value) {
            this.addnode(node.right, x);
        }

        if (x < node.value && node.left == null) {
            this.addLeft(node, x);
            return;
        }
        if (x < node.value) {
            this.addnode(node.left, x);
        }

    }

    void adds(int x) {
        addnode(this.root, x);
    }

    public void sortthis(Node node) {
        if (node == null) ;
        if (node != null) {
            sortthis(node.left);
            System.out.print(node.value + " ");
            sortthis(node.right);

        }

    }

    public static void main(String[] args) {
        BinarySearch serech = new BinarySearch(5);
        serech.adds(7);
        serech.adds(2);
        serech.adds(6);
        serech.adds(1);
        serech.adds(11);

        serech.sortthis(serech.root);

    }
}
