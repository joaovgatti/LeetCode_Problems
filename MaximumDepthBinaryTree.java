/*

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.


*/


/*


	Minha estratégia:

		 Este é mais um problema clássico de árvores binarias. È feito de maneira simples usando
		 recursão.
		 O caso base é este: se o nó em questão é uma folha logo sua profundidade é 1.
		 Para os nós restantes,sua altura é a altura da maior das suas duas subárvores mais um.
		 Aplicando o método no nó raiz temos a profundidade da árvore.


		obs: não se pode esquecer de um cornercase em que uma árvore vazia é passada para a função.
		neste caso retorna-se 0.
		Tenho que confessar que minha primeira submissão foi negada pois tinha esquecido de tal situação e 
		assim obtive o famoso nullPointerException ;))  

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
    public int maxDepth(TreeNode root){
        if(root == null) return 0;
        if(root.right == null && root.left == null){
            return 1;
        }else{
            int depth = Math.max(maxDepth(root.left),maxDepth(root.right));
            return depth + 1;
        }
    }
}









