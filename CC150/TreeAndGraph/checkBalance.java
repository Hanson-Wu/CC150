
public class checkBalance {

	public static int checkHeight(TreeNode root){
		if(root == null){
			return 0;
		}
		int leftHeight = checkHeight(root.getLeft());
		if(leftHeight == -1)return -1;
		int rightHeight = checkHeight(root.getRight());
		if(rightHeight == -1)return -1;
		
		int heightDiff = leftHeight - rightHeight;
		if(Math.abs(heightDiff) > 1)return -1;
		else return Math.max(leftHeight, rightHeight)+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
