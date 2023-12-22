class Solution{
    static int sumOfDigits(int N) {
       int Sum=0;
         while (N>0){
             int digit = N%10;
             Sum += digit;
             N=N/10;
         }
       return Sum;// code here
    }
}
