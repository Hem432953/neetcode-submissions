
class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";

        String minString = "";
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }

        int count = t.length();
        int low = 0;
        int high = 0;
        int minLength = Integer.MAX_VALUE;

        while(high < s.length()) {

            if(map.containsKey(s.charAt(high))) {
                map.put(s.charAt(high), map.get(s.charAt(high)) - 1);

                if(map.get(s.charAt(high)) >= 0) {
                    count--;
                }
            }

            while(count == 0) {

                if(minLength > (high - low + 1)) {
                    minLength = high - low + 1;
                    minString = s.substring(low, high + 1);
                }

                if(map.containsKey(s.charAt(low))) {
                    map.put(s.charAt(low), map.get(s.charAt(low)) + 1);

                    if(map.get(s.charAt(low)) > 0) {
                        count++;
                    }
                }

                low++;
            }

            high++;
        }

        return minString;
    }
}
