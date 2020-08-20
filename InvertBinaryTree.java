/*

Invert a binary tree.

Example:

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1


Trivia:
This problem was inspired by this original tweet by Max Howell:

Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so f*** off.


*/

/*


	Minha Estrategia:

		Mais um problema de arvores binarias, mais uma solucao recursiva.
		Caso base da recursao:
			se o no nao tem filhos ele eh o proprio inverso.

		Logica da recursao:
			inverte os filhos do No ( repare que o algoritmo esta invertendo os nos - ou seja,toda a subarvore com raiz nestes nos
			 estao sendo invertidas - e nao apenas os valores ).
			 inverte o filho esquerdo.
			 inverte o filho direito.
		retorna a raiz.

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

class solution{
    public TreeNode invertTree(TreeNode root){
        if(root == null) return null;
        if(root.left == null && root.right == null) return root;
        else{
            swapSons(root);
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }
    public void swapSons(TreeNode q){
        TreeNode aux = new TreeNode();
        aux = q.left;
        q.left = q.right;
        q.right = aux;
    }

}