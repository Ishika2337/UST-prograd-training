public class Solution{
  public static long sumCubes(long n)
  {
    //put your code here :D
    long sum=0;
    for(long i =1; i<=n; i++){
      sum += i*i*i;
    }
    return sum;
  }
}