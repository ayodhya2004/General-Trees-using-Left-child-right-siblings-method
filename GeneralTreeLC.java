package trees;

public class GeneralTreeLC<T> {
    private GeneralTreeNode<T> root;

    public GeneralTreeLC(T rootData) {
        this.root = new GeneralTreeNode<>(rootData);
    }

    public GeneralTreeNode<T> getRoot() {
        return root;
    }

    public void setRoot(GeneralTreeNode<T> root) {
        this.root = root;
    }

    public void addChild(GeneralTreeNode<T> parent, T childData) {
        GeneralTreeNode<T> childNode = new GeneralTreeNode<>(childData);
        if (parent.leftChild == null) {
            parent.leftChild = childNode;
        } else {
            GeneralTreeNode<T> temp = parent.leftChild;
            while (temp.rightSibling != null) {
                temp = temp.rightSibling;
            }
            temp.rightSibling = childNode;
        }
    }

    public void printTree(GeneralTreeNode<T> node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.data);
        printTree(node.leftChild, indent + "  ");
        printTree(node.rightSibling, indent);
    }

    public static void main(String[] args) {
        GeneralTreeLC<String> tree = new GeneralTreeLC<>("Root");

        GeneralTreeNode<String> node1 = new GeneralTreeNode<>("Node 1");
        GeneralTreeNode<String> node2 = new GeneralTreeNode<>("Node 2");
        GeneralTreeNode<String> node3 = new GeneralTreeNode<>("Node 3");

        tree.getRoot().leftChild = node1;
        node1.rightSibling = node2;
        node2.rightSibling = node3;

        tree.addChild(node1, "Node 1.1");
        tree.addChild(node1, "Node 1.2");
        tree.addChild(node2, "Node 2.1");
        tree.addChild(node3, "Node 3.1");

        System.out.println("General Tree Structure:");
        tree.printTree(tree.getRoot(), "");
    }
}
