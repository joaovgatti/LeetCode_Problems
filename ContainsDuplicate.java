/*Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:

Input: [1,2,3,1]
Output: true*/

/*


Estrategia da Solucao:

	Este eh um problema bem simples.Itera-se o array e se o presente elemento nao estiver 
	contido na tabela de hash, adiciona-se, se estiver contido,retorna true.
	Se ao final do loop ele nao retornou true,entao nao possui duplicatas logo
	retorna false.

*/


import java.util.HashMap;

public class Solucao {

    public boolean containsDuplicate(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int element : nums){
            if(map.containsKey(element)){
                return true;
            }else{
                map.put(element,0);
            }
        }
        return false;
    }

}