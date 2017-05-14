package leetcode;



public class minimumDepthofBinaryTree {
	public int findmindepth(TreeNode root){
		if (root.left==null & root.right==null) {
			return 0;
		}else if (root.left!=null) {
			return findmindepth(root.left);
		}else {
			return findmindepth(root.right);
		}
	}
	public static void main(String[] args) {
		
	}

}
