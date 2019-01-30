import java.util.List;
import objects.BinaryTreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BSTSequencesTest {

    private BinaryTreeNode root;

    @BeforeEach
    public void before() {
        root = new BinaryTreeNode(5);
    }

    @Test
    public void test1Array() {
        List<int[]> result = BSTSequences.sequences(root);
        assertEquals(1, result.size());
        assertEquals(new int[] { 5 }, result.remove(0));
    }

    @Test
    public void test16Arrays() {
        BinaryTreeNode leftChild = new BinaryTreeNode(2, new BinaryTreeNode(1), new BinaryTreeNode(3));
        BinaryTreeNode rightChild = new BinaryTreeNode(7, new BinaryTreeNode(6), new BinaryTreeNode(8));
        root.setLeftChild(leftChild);
        root.setRightChild(rightChild);
        List<int[]> result = BSTSequences.sequences(root);
        assertEquals(16, result.size());

        assertTrue(result.contains(new int[] {5, 2, 7, 1, 3, 6, 8}));
        assertTrue(result.contains(new int[] {5, 2, 7, 3, 6, 8, 1}));
        assertTrue(result.contains(new int[] {5, 2, 7, 6, 8, 1, 3}));
        assertTrue(result.contains(new int[] {5, 2, 7, 8, 1, 3, 6}));

        assertTrue(result.contains(new int[] {5, 2, 1, 3, 7, 6, 8}));
        assertTrue(result.contains(new int[] {5, 2, 1, 3, 7, 8, 6}));

        assertTrue(result.contains(new int[] {5, 2, 3, 1, 7, 6, 8}));
        assertTrue(result.contains(new int[] {5, 2, 3, 1, 7, 8, 6}));

        assertTrue(result.contains(new int[] {5, 7, 2, 1, 3, 6, 8}));
        assertTrue(result.contains(new int[] {5, 7, 2, 3, 6, 8, 1}));
        assertTrue(result.contains(new int[] {5, 7, 2, 6, 8, 1, 3}));
        assertTrue(result.contains(new int[] {5, 7, 2, 8, 1, 3, 6}));

        assertTrue(result.contains(new int[] {5, 7, 6, 8, 2, 1, 3}));
        assertTrue(result.contains(new int[] {5, 7, 6, 8, 2, 3, 1}));

        assertTrue(result.contains(new int[] {5, 7, 8, 6, 2, 1, 3}));
        assertTrue(result.contains(new int[] {5, 7, 8, 6, 2, 3, 1}));
    }

}
