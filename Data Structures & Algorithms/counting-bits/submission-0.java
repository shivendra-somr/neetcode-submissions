class Solution {
    public int countOne(int n){
        int c = 0;
        while(n != 0){
            n = n&(n-1);
            c++;
        }
        return c;
    }
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        int i = 0;
        while(i <= n){
            ans[i] = countOne(i);
            i++;
        }
        return ans;
    }
}
