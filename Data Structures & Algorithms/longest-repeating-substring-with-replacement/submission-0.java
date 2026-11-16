class Solution {
    public int characterReplacement(String s, int k) {
        int low=0;
        int high=0;
        int maxLength=Integer.MIN_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        int maxFreq=0;
        while(high<s.length()){
            map.put(s.charAt(high),map.getOrDefault(s.charAt(high), 0)+1);
            maxFreq=Math.max(maxFreq,map.get(s.charAt(high)));
            while((high-low+1)-maxFreq>k){
                map.put(s.charAt(low),map.get(s.charAt(low))-1);
                if(map.get(s.charAt(low))==0){
                    map.remove(s.charAt(low));
                }
                low++;
            }
            maxLength=Math.max((high-low+1),maxLength);
        high++;
        }
        return maxLength;
    }
}
