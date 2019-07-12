
public class BinarySerech {

    private Node root;

    public BinarySerech(int x) {
        this.root = this.getNode(x);
    }


    public Node getRoot() {
        return this.root;
    }

    private Node getNode(int x) {

        Node node = new Node();
        node.value = x;
        node.left = null;
        node.right = null;
        return node;
    }

    private void addLeft(Node parent, int x) {

        Node node = this.getNode(x);
        parent.left = node;
    }

    private void addRight(Node parent, int x) {

        Node node = this.getNode(x);
        parent.right = node;
    }

    void add(Node node, int x) {
        if (x > node.value && node.right == null) {
            this.addRight(node, x);
            return;
        }
        if (x > node.value) {
            this.add(node.right, x);
        }

        if (x <= node.value && node.left == null) {
            this.addLeft(node, x);
            return;
        }
        if (x <= node.value) {
            this.add(node.left, x);
        }

    }


    public static void main(String[] args) {
        BinarySerech serech = new BinarySerech(5);
        Node root = serech.getRoot();
        Tree tree = new Tree();
        serech.add(root, 8);
        serech.add(root, 2);
        serech.add(root, 9);
        serech.add(root, 8);
        serech.add(root, 3);
        serech.add(root, 1);
        serech.add(root, 11);
        serech.add(root, 15);

        tree.sortthis(root);

    }
}
