
public class TreeNode {
	 /**
     * Construct a tree node with specified value, with 
     * null left and right subtrees.
     * @param initValue is the value stored in the node
     */
    
    public TreeNode(Object initValue)
    {
        value = initValue; left = null; right = null;
    }

    
    /**
     * Construct a tree node with specified value, left, and right
     * subtrees.
     * @param initValue is the value stored in the node
     * @param initLeft is the left subtree of the node
     * @param initRight is the right subtree of the node
     */
    
    public TreeNode(Object initValue, TreeNode initLeft, TreeNode initRight)
    {
        value = initValue; left = initLeft; right = initRight;
    }

    /**
     * Returns the value stored in this tree node.
     * @return this tree node's value
     */
    
    public Object getValue()
    {
        return value;
    }

    /**
     * Returns the left subtree of this node.
     * @return a reference to the left subtree of this node
     */
    
    public TreeNode getLeft()
    {
        return left;
    }

    /**
     * Returns the right subtree of this node.
     * @return a reference to the right subtree of this node
     */
    
    public TreeNode getRight()
    {
        return right;
    }

    /**
     * Sets the value of this tree node.
     * @param theNewValue is the (new) value stored in this node
     */
    
    public void setValue(Object theNewValue)
    {
        value = theNewValue;
    }

    /**
     * Sets the value of the left subtree of this node.
     * @param theNewLeft is the (new) left subtree of this node
     */
    
    public void setLeft(TreeNode theNewLeft)
    {
        left = theNewLeft;
    }

    /**
     * Sets the value of the right subtree of this node.
     * @param theNewRight is the (new) right subtree of this node
     */
    
    public void setRight(TreeNode theNewRight)
    {
        right = theNewRight;
    }

    private Object value;
    private TreeNode left;
    private TreeNode right;
}
