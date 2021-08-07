package data_structure.BinarySearchTrees;

public class main {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(10, "ten");
        tree.insert(5, "five");
        tree.insert(6, "six");
        tree.insert(1, "one");
        tree.insert(0, "cero");

        System.out.println(tree.findMin().key);

    }
}
