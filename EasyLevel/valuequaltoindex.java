class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
 ArrayList <Integer> ar = new ArrayList <> ();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==i+1)
            ar.add(i+1);
            
        }
        return ar;
        
        
    }
}
