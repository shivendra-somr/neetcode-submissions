class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] alphabets = new int[26];

        for(int i=0; i<s.length(); i++){
            alphabets[s.charAt(i) - 'a']++;
            alphabets[t.charAt(i) - 'a']--;
        } 

        for(int a: alphabets){
            if(a != 0){
                return false;
            }
        }
        
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagramGroups = new ArrayList<>();

        for(int i = 0; i<strs.length; i++){
            boolean isPresent = false;
            for(int j = 0; j<anagramGroups.size(); j++){
                if(anagramGroups.get(j).contains(strs[i])){
                    isPresent = true;
                }
            }
            if(!isPresent){
                List<String> l = new ArrayList<>();
                l.add(strs[i]);
                for(int j = i+1; j<strs.length; j++){
                    if(isAnagram(strs[i],strs[j])){
                        l.add(strs[j]);
                    }
                }
                anagramGroups.add(l);
            }
            
        }
        return anagramGroups;
    }
}
