/*You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0*/


/*


Estrategia para resolucao:

	Adiciona-se todas as joias em uma HashTable.
	Em seguida,percorre-se todos as minhas stones
	e quando uma for uma joia,incrementa 
	o seu numero de ocorrencias.
	Depois basta somar todos os valores para obter a 
	quantidade total de joias.

*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class teste {

    public int numJewelsInStones(String J, String S) {

        HashMap<Character,Integer> map  = new HashMap<>();
        for(int i=0;i<J.length();i++){
            map.put(J.charAt(i),0);
        }
        for(int i=0;i<S.length();i++){
            if(map.containsKey(S.charAt(i))){
                int count = map.get(S.charAt(i)) + 1;
                map.put(S.charAt(i),count);
            }
        }
        List<Integer> allValues = new ArrayList<>(map.values());
        int total = 0;
        for (int elems : allValues){
            total = total + elems;
        }
        return total;
    }

}


/*


Um metodo muito mais simples,postado no forum de discussao da questao no LeetCode:

	public static int numJewelsInStones(String J, String S) {
       int res=0;
       for(char c : S.toCharArray()){
           if(J.indexOf(c) != -1){
               res++;
           }
       }
       return res;
   }


*/