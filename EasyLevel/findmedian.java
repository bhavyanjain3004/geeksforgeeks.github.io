class Solution
{
    public int find_median(int[] v)
    {
      Arrays.sort(v);
        int a=(v.length-1);
        int b=a/2;
        int ans = (v[b]+v[a-b])/2;
        return ans;
          
       // Code here
    }
}
