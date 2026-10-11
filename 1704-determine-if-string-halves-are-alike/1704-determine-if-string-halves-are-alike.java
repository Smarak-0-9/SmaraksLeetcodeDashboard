class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int count1=0;
        int count2=0;
        
             //"aeiouAEIOU".indexOf('a')  // 0 → vowel
            // "aeiouAEIOU".indexOf('E')  // 5 → vowel
            // "aeiouAEIOU".indexOf('g')  // -1->consonant
        for(int i=0;i<n/2;i++){
            if("aeiouAEIOU".indexOf(s.charAt(i)) !=-1){                                             
              count1++;
           }
        }
        for(int i=n/2;i<n;i++){
            if("aeiouAEIOU".indexOf(s.charAt(i)) !=-1){ 
            count2++;
           }
        }
    return count1==count2;
        
    }
}