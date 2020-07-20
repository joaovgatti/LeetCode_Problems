/*Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4*/



/*Estrategia para resolucao:

	Criamos uma HashTable para armazenar o numero de vezes que cada numero aparece.
	Iteramos o array e atualizamos a nossa tabela.
	Depois retornamos o elemento da tabela que tem como valor 1.

*/






class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int elems : nums){
            if(map.containsKey(elems)){
                int count = map.get(elems) + 1;
                map.put(elems,count);
            }else{
                map.put(elems,1);
            }
        }
        for(int i:nums){
            if(map.get(i) == 1){
                return i;
            }
        }
        return 0;
    }
}