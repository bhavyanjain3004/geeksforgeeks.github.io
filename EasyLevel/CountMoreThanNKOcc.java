class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
     int count = (n/k)+1;
        int total = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++) {
            if(map.containsKey(arr[i])&&map.get(arr[i])==count) {
                continue;
            }
            else {
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
                if(map.get(arr[i])==count) {
                    total++;
                }
            }
            
        }
        
        return total;
    }
}
