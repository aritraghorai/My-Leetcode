/*
 !Name: Aritra Ghorai
 !Date:30/10/2021
 ?Program Details:2049. Count Nodes With the Highest Score
*https://leetcode.com/problems/count-nodes-with-the-highest-score/
   */
public class Q189_Count_Nodes_With_Highest_Score {
    public int countHighestScoreNodes(int[] parents) {
        long max = Integer.MIN_VALUE;
        int n = parents.length;
        TreeNode[] nodes = new TreeNode[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new TreeNode();
        }
        for (int i = 1; i < parents.length; i++) {
            int parentId = parents[i];
            if (nodes[parentId].left == null)
                nodes[parentId].left = nodes[i];
            else {
                nodes[parentId].right = nodes[i];
            }
        }
        countNodes(nodes[0]);
        for (int i = 0; i < parents.length; i++) {
            long product = 1;
            int leftCount = nodes[i].left == null ? 0 : nodes[i].left.count;
            int rightCount = nodes[i].right == null ? 0 : nodes[i].right.count;
            int parentCount = n - leftCount - rightCount - 1;
            if (leftCount > 0)
                product *= leftCount;
            if (rightCount > 0)
                product *= rightCount;
            if (parentCount > 0)
                product *= parentCount;
            max = Math.max(max, product);
            nodes[i].score = product;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nodes[i].score == max)
                count++;
        }
        return count;

    }

    public static int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        root.count = countNodes(root.left) + countNodes(root.right) + 1;
        return root.count;
    }
}

class TreeNode {
    TreeNode left;
    TreeNode right;
    long score = 0L;
    int count = 0;
}
