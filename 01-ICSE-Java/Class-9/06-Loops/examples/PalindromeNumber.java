// PalindromeNumber: ICSE Java worked example.
public class PalindromeNumber {
    public static void main(String[] args) {
        int n=1221,copy=n,r=0; while(copy>0){r=r*10+copy%10;copy/=10;}System.out.println(n==r);
    }
}
