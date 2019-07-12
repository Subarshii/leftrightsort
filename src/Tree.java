

public class Tree {

    public void sortthis(Node node) {
        if (node == null) return;
        if (node != null) {
            sortthis(node.left);
            System.out.print(node.value + " ");
            sortthis(node.right);
        }
    }

}

