// task №1305

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> answer = new ArrayList<>();
        addFromTree(answer, root1);
        addFromTree(answer, root2);
        Collections.sort(answer);
        return answer;
    }

    private void addFromTree(List<Integer> answer, TreeNode root) {
        if (root == null) return;
        answer.add(root.val);
        addFromTree(answer, root.left);
        addFromTree(answer, root.right);
    }
}
