class Solution {

    public String encode(List<String> strs) {
        if(strs.size() == 0) return null;
        if(strs.size() == 1 && strs.get(0) == ""){
            return "";
        }
        String ans = "";
        for(String s: strs){
            ans += s+"a1b2c3";
        }
        return ans;
    }

    public List<String> decode(String str) {
        if(str == null){
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        String[] strs = str.split("a1b2c3");
        if(str == ""){
            res.add("");
            return res;
        }
        for(String s : strs){
            res.add(s);          
        }
        return res;
    }
}
