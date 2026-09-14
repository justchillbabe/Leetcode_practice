class Solution {
    public void reverseString(char[] s) {
        int a = 0, b = s.length-1;
        while(a<b){
            s[a]=(char)(s[a]^s[b]);
            s[b]=(char)(s[a]^s[b]);
            s[a]=(char)(s[a]^s[b]);
            a++; b--;
        }
    }
}