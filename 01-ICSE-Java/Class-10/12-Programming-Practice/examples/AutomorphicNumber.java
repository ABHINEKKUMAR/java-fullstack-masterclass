// AutomorphicNumber: ICSE Java worked example.
public class AutomorphicNumber {
    public static void main(String[] args) {
        int n=25,square=n*n,power=10;while(power<=n)power*=10;System.out.println(square%power==n);
    }
}
