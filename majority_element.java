


/*Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3*/


class Solution {
    public int majorityElement(int[] a) {
       HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        int el = 0;
        if(a.length == 1){
            return a[0];
        }

        for(int i = 0;i<a.length;i++){
            if(map.containsKey(a[i])){
                int count = map.get(a[i]) + 1;
                if(count > a.length/2){
                    System.out.println("found it");
                    el = a[i];
                    return a[i];
                }else map.put(a[i],count);
            }else{
                map.put(a[i],1);
            }
        }
        return el;
    }

}