class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String f=strs[0];
        String ans="";
        for(int i=0;i<f.length();i++){
            char ch=f.charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != ch){
                    return ans;
                }
                
            }ans+=ch;
        }
        return ans;
    }
}