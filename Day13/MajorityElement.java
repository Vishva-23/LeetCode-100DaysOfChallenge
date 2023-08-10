Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

SOLUTION:
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int x=n/2;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i: nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
         Map.Entry<Integer, Integer> maxEntry = Collections.max(map.entrySet(), Map.Entry.comparingByValue());
        if (maxEntry.getValue() > x) {
            return maxEntry.getKey();
        }
        
        return -1;
    }
}
