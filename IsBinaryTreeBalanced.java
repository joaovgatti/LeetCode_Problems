/*
	
	Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as:

a binary tree in which the left and right subtrees of every node differ in height by no more than 1.

 

Example 1:

Given the following tree [3,9,20,null,null,15,7]:

    3
   / \
  9  20
    /  \
   15   7
Return true.

Example 2:

Given the following tree [1,2,2,3,3,null,null,4,4]:

       1
      / \
     2   2
    / \
   3   3
  / \
 4   4
Return false.


*/

/*

	Minha estrategia:

		ALgoritmo bem simples. A ideia eh testar se cada no eh balanceado.
		Para tal, foi feita uma funcao auxiliar que calcula a altura de um no.
		Seguindo o padrao, utilizamos recursividade.
		Caso Base:

			Se o no for folha retorna 1.

		Corpo da recursao:

			calcula-se a diferenca entre as alturas dos filhos do no. Se nao for
			balanceado, ja pode-se retornar falso.
			Se for verdadeira, testamos pra ver se seus filhos o sao tambem.
			E assim por diante...



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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        else{
            if((Math.abs(getHeight(root.left) - getHeight(root.right)) > 1)){
                return false;
            }else{
                return isBalanced(root.right) && isBalanced(root.left);

            }
        }
    }

    public int getHeight(TreeNode root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        else{
            return (Math.max(getHeight(root.right),getHeight(root.left)) + 1);

        }
    }
}
