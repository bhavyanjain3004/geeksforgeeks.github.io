class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
      int Max =0;
        ArrayList<Integer> ans = new  ArrayList<Integer>();
        for(int i=n-1; i>=0; i--){
            if(Max <= arr[i]){
               Max= arr[i];
               ans.add(0,arr[i]);
            }
        }
        return  ans;
    }
}
