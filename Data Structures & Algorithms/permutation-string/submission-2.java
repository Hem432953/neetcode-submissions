class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map1=new HashMap<>();
          HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i), 0)+1);
        }
        int low=0;
        int high=0;
        while(high<s2.length()){
      
            map2.put(s2.charAt(high),map2.getOrDefault(s2.charAt(high), 0)+1);
            if(map1.containsKey(s2.charAt(high))){
                    while(map2.get(s2.charAt(high))>map1.get(s2.charAt(high))){
                        
                            map2.put(s2.charAt(low),map2.get(s2.charAt(low))-1);
                        if(map2.get(s2.charAt(low))==0){
                            map2.remove(s2.charAt(low));
                        }
                          low++;
                        }
                        
                      
                    }
                     else{
            map2.clear();
            low++;
        }
        if(map1.equals(map2)) return true;
        high++;  
        }
       return false; 
    }
   
}

