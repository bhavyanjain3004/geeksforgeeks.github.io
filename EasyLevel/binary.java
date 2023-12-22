class Solution {
    int binarysearch(int arr[], int n, int k) {
        int l= 0 ,r= arr.length-1;
        while (l <=r){
            int m = l + (r - l) / 2;
 
            if (arr [m] == k){
                return m;
            }
            if (arr[m] < k){
                l = m + 1;
            }
            else{
                r = m - 1;
        }
        }
 
        return -1;
    }
}
