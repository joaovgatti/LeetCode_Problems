/*
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
 

But the following [1,2,2,null,3,null,3] is not:

    1
   / \
  2   2
   \   \
   3    3
*/


/*

	Minha estratégia:

		Uma árvore é simétrica se suas duas sub-arvores forem.
		Duas árvores são simétricas se as raizes forem
		iguais e a subarvore esquerda eh simetrica com a subarvore
		direita da outra arvore nas duas arvores.



*/

	public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isSymmetric(TreeNode root) {

        if(root == null) return true;
        return isSubTreesSymetrics(root.left,root.right);
    }


    public boolean isSubTreesSymetrics(TreeNode p,TreeNode q){
        if((p == null) && q == null) return true;
        if((p == null) || q == null) return false;
        return((p.val == q.val) && isSubTreesSymetrics(p.left,q.right) &&
                isSubTreesSymetrics(p.right,q.left));
    }

}