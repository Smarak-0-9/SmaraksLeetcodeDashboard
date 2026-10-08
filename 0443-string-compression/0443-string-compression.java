class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int index=0;
        for(int i=0;i<n;i++){
           int count=1;
           chars[index++]=chars[i];

            while(i+1<n && chars[i]==chars[i+1]){
                count++;
                i++;
            }
            if(count >1){
                for(char c:String.valueOf(count).toCharArray()){
                 chars[index++]=c;
               }
            }
        }
        return index;
    }
}