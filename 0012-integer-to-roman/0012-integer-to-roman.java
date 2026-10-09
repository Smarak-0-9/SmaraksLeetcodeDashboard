class Solution {
    public String intToRoman(int num) {
       int []nums={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String []roman={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int j=0;
        String result="";
        int n=nums.length;
        for(int i=0;i<n;i++){
            int times=num/nums[i];
            if(times>=1){
                j=i;
                for(int z=0;z<times;z++){
                      result +=roman[j];
                }              
                int rem=num%nums[i];
                num=rem;
            }
        }

        return result;
    }
}