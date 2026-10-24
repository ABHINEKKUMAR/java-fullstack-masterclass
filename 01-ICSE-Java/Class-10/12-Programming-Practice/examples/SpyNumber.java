// SpyNumber: ICSE Java worked example.
public class SpyNumber {
    public static void main(String[] args) {
        int n=1124,sum=0,product=1;while(n>0){int d=n%10;sum+=d;product*=d;n/=10;}System.out.println(sum==product);
    }
}
