class Solution {
    public boolean isAnagram(String s, String t) {
        TreeMap<Character, Integer> sFreq = new TreeMap<>() ;

        for(int i=0; i<s.length(); i++){
            char x = s.charAt(i);
            if(sFreq.containsKey(x)){
                sFreq.put(x, sFreq.get(x)+1);
            }
            else{
                sFreq.put(x,1);
            }
        }
        TreeMap<Character, Integer> tFreq = new TreeMap<>() ;

        for(int i=0; i<t.length(); i++){
            char x = t.charAt(i);
            if(tFreq.containsKey(x)){
                tFreq.put(x, tFreq.get(x)+1);
            }
            else{
                tFreq.put(x,1);
            }
        }
        if(sFreq.size()!=tFreq.size()){
            return false;
        }
        else{
            for(Map.Entry me: sFreq.entrySet()){
                if(!tFreq.containsKey(me.getKey()) || tFreq.get(me.getKey()) != me.getValue()){
                    return false;
                }
            }
        }
        return true;
    }
}
