class Solution {
    public int lengthOfLastWord(String s) {
        char[] sa = s.toCharArray();
        int count = 0;
        int a = sa.length;
        for(int i =a-1; i>=0; i--){
            if (sa[i] == ' ') {
                if (count > 0) {
                    return count;
                }
            }else{
                count++;
            }
        }
        return count;    
    }
}