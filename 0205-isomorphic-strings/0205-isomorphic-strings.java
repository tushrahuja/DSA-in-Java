class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(mapST.containsKey(a) && mapST.get(a) != b){
                return false;
            }
            if(mapTS.containsKey(b) && mapTS.get(b) != a){
                return false;
            }
            else {
                mapST.put(s.charAt(i), t.charAt(i));
                mapTS.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}