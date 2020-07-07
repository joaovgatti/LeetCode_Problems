/*Given the root node of a binary search tree (BST) and a value. You need to find the node in the BST that the node's value equals the given value.
 Return the subtree rooted with that node. If such node doesn't exist, you should return NULL.
For example, 

Given the tree:
        4
       / \
      2   7
     / \
    1   3

And the value to search: 2

*/

/*

	Metodo Usado: este eh o problema classico de busca em uma arvore binaria de busca.
	Basta fazer as comparacoes e chamar recursivamente o metodo de busca. Sem muito
	misterio.



*/


/*	**
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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) {
                return null;
            }else{
                if(root.val == val) {
                    return root;
                }else{
                    if(val < root.val){
                        return searchBST(root.left,val);
                    }else {
                        return searchBST(root.right,val);
                    }
    
                }
            }
            
    }
}