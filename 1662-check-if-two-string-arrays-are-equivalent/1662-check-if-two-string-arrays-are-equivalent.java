class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String r1="";
        String r2="";
        int m=word1.length;
        int n=word2.length;
        for(int i=0;i<m;i++){
            r1+=word1[i];
        }
        for(int j=0;j<n;j++){
            r2+=word2[j];
        }
        if(r1.equals(r2)){
            return true;
        }
        return false;
    }
}