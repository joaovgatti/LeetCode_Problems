/*
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
*/


/*

Minha Estrategia:
	
	Cria-se um primeiro set e add todos os elementos do primeiro array.
	Cria-se um segundo set e so add os elementos do segundo array que estao
	presentes no primeiro set.
	Joga tudo num array e Voila :)
	

*/













class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> set = new HashSet<>();
            HashSet<Integer> setB = new HashSet<>();
            for(int nums : nums1){
                set.add(nums);
            }
            for(int nums : nums2){
                if(set.contains(nums)){
                    setB.add(nums);
                }
            }
            int[] n = new int[setB.size()];
            int i  = 0;
            for(int x : setB){
                n[i] = x;
                i++;
            }
            return n;
    }
}