//判断树是否为平衡二叉树
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
    public class BalancedTree {
        public static boolean isBalance(TreeNode root) {
            if (root == null) {
                return true;
            }
            if (root.right == null && root.left == null) {
                return true;
            }
            //判断左右子树深度
            int leftlevel = treeDepth(root.left);
            int rightlevel = treeDepth(root.right);
            if (Math.abs(leftlevel - rightlevel) > 1) {
                return false;
            }
            return isBalance(root.left) && isBalance(root.right);
        }

        private static int treeDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            //计算左右子树深度
            int left = treeDepth(root.left);
            int right = treeDepth(root.right);
            //树root的深度 = 路径最长的子树深度 + 1
            return left >= right ? (left + 1) : (right + 1);
        }
    }
