class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0;
        int high=0;
        int maxLength=0;
        HashSet<Character> set=new HashSet<>();
        while(high<s.length()){
           
            while(set.contains(s.charAt(high))){
                set.remove(s.charAt(low));
                low++;
            }
            set.add(s.charAt(high));
            maxLength=Math.max(maxLength,set.size());
            high++;
        }
    return maxLength;
    }
}
