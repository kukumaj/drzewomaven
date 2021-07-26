import java.util.*;
class Program {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;
        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    // O(n) time | O(n) space - where n is the number of nodes in the Bina
    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> sums = new ArrayList<Integer>();
        calculateBranchSums(root, 0, sums);
        return sums;
    }
    public static void calculateBranchSums(BinaryTree node, int runningSum,List<Integer> sums){
        if (node == null) return;
        int newRunningSum = runningSum + node.value;
        if (node.left == null && node.right == null) {
            sums.add(newRunningSum);
            return;
        }
        calculateBranchSums(node.left, newRunningSum, sums);
        calculateBranchSums(node.right, newRunningSum, sums);
    }

    public static void main(String[] args) {
        
    }
}
/*            0
       9        1
          15       10
               100     200    */







