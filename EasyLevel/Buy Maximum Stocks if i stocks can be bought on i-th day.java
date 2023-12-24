class Solution {
    public static int buyMaximumProducts(int n, int k, int[] price) {
     Queue<int[]> pq=new PriorityQueue<>((x,y)->x[0]-y[0]);
        for(int i=0;i<n;i++) pq.add(new int[]{price[i],i+1});
        int total=0;
        while(!pq.isEmpty()){
            int[] p=pq.poll();
            int j=p[1],currPrice=p[0];
            while(k>=currPrice && j-->0){
                k-=currPrice;
                total++;
            }
        }
        return total;
    }
}

       
