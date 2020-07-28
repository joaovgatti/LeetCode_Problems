/*
Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false*/

/*


Minha Estrategia:
	
	Adiciona-se todos os caracteres de ambas strings em diferentes hashTables.
	compara-se as hashTables...

*/

	class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
            HashMap<Character,Integer> map2 = new HashMap<>();
            for(int i=0;i<s.length();i++){
                if(!map1.containsKey(s.charAt(i))){
                    map1.put(s.charAt(i),1);
                }else{
                    int count = map1.get(s.charAt(i));
                    map1.put(s.charAt(i),count + 1);
                }
            }
            for(int i=0;i<t.length();i++){
                if(!map2.containsKey(t.charAt(i))){
                    map2.put(t.charAt(i),1);
                }else{
                    int count = map2.get(t.charAt(i));
                    map2.put(t.charAt(i),count + 1);
                }
            }
            return map1.equals(map2);
    }
}