/*
Given a binary tree, return the inorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,3,2]
*/

/*

	Minha Estrategia:

		Este eh apenas a implementacao de um percurso em Ordem
		de uma arvore binaria.
		Muito simples usando calls recursivas.

/*/


import java.util.*;

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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> inOrder = new ArrayList<>();
        inorderTraversalAux(root,inOrder);
        return inOrder;
    }

    private void inorderTraversalAux(TreeNode root,List<Integer> aux){
        if(root != null){
            inorderTraversalAux(root.left,aux);
            aux.add(root.val);
            inorderTraversalAux(root.right,aux);
        }
    }

}

