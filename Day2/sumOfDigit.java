public class DRoot {
  public static int digital_root(int n) {
    int sum = 0, r, count=0;
    while(n>0){
      r=n%10;
      sum = sum+r;
      n=n/10;
      count++;
    }
    return 1<count? digital_root(sum):sum;
  }
}