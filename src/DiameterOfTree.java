public class DiameterOfTree {
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);

        // height of tree = to the number of nodes on a path
        // edges of tree = height - 1
        return ans - 1;
    }

    // get the height of the tree
    public int depth(TreeNode node) {
        // if the node is empty dont count anything
        if (node == null) return 0;

        // count the left nodes
        int l = depth(node.left);

        // count the right nodes
        int r = depth(node.right);

        // have to cover the case where the root of the tree is not included
        // the + 1 is for counting the current node
        ans = Math.max(ans, l + r + 1);

        return Math.max(l, r) + 1;
    }
}
