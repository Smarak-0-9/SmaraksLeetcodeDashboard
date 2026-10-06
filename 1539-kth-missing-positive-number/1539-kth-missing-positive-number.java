class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int n=arr.length;
        int l=0;
        int r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            int noofmissingno=arr[mid]-(mid+1);
            if(noofmissingno < k){
                l=mid+1;
            }else{
                r=mid-1;
            }

        }
        return l+k;
    }
}