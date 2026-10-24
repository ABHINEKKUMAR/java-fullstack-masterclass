// ArmstrongNumber: ICSE Java worked example.
public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=153,temp=n,sum=0,digits=String.valueOf(n).length();while(temp>0){sum+=(int)Math.pow(temp%10,digits);temp/=10;}System.out.println(sum==n);
    }
}
