/*

Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its minimum depth = 2.

*/


/*

	Minha estratégia:

		Este é o oposto do problema MaximumDepht,ou seja, para calcular a profundidade miníma
		de um nó, pega-se a a profundidade de sua subárvore mais curta e soma-se 1.
		Outra diferença é a seguinte:
		na hora de escolher a menor, eh necessário checar se uma das subárvores é nula.
		pois se for, ele escolheria esta como menor caminho pois um nó nulo tem profundidade 0.
		Então se uma das subárvores for nula,deve-se pegar obrigatoriamente a profundidade da outra
		subárvore que nao é nula.


*/


public class TreeNode {
    int val;
    TreeNode right;
    TreeNode left;
    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution{

    public int minDepth(TreeNode root){
        if(root == null) return 0;
        if(root.left == null && root.right == null){
            return 1;
        }else{
            if(root.left != null && root.right != null) {
                return (Math.min(minDepth(root.left), minDepth(root.right)) + 1);
            }else if(root.left == null){
                return minDepth(root.right);
            }else{
                return minDepth(root.left);
            }
        }
    }
}
