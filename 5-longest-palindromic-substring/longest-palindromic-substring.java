class Solution {
    int max = 0, start = 0, end = 0;
    public String longestPalindrome(String s) {
        
        for(int i = 0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                if(isPalindrome(s,i,j)==true){
                    if(j-i+1>max){
                        max = j-i+1;
                        start = i;
                        end = j;
                    }
                }
            }
        }
       return s.substring(start,end+1);
    }


    public boolean isPalindrome(String s, int left, int right){
        
        while(left<right){
            char c1 = s.charAt(left);
            char c2 = s.charAt(right);
            if(c1!=c2){
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;   
    }
}