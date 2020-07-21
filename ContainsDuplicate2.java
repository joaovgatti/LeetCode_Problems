/*Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true*/

/*
	 
	 Estrategia da Solucao:

	 	Itera-se o array e se o elemento nao esta presente na tabela hash, adiciona-se, com
	 	a chave sendo o proprio elemento e o valor sendo o indice no array.
	 	Se o elemento estiver presente na tabela hash,calcula-se a difereca entre o indice
	 	do elemente atual e o indice que esta na tabela. Se for <= k, retorna true.
		Neste ponto eu acreditei ter resolvido a questao,porem eh necessario que 
		se a diferenca nao for satisfeita,atualiza-se o indice do elemento na tabela hash para 
		futuras comparacoes.

*/



import java.util.HashMap;
import static java.lang.Math.abs;

public class teste {

    public boolean containsNearbyDuplicate(int[] nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }else{
                if(map.containsKey(nums[i])){
                    int difference  = abs(i-map.get(nums[i]));
                    if(difference <= k){
                        return true;
                    }
                    map.put(nums[i],i);
                }
            }
        }
        return false;
    }

}