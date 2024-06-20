package trees;

public class GeneralTreeNode<T> {
    T data;
    GeneralTreeNode<T> leftChild;
    GeneralTreeNode<T> rightSibling;

    public GeneralTreeNode(T data) {
        this.data = data;
        this.leftChild = null;
        this.rightSibling = null;
    }
}
