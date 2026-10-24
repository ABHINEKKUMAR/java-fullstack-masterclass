// NumberDigits: ICSE Java worked example.
public class NumberDigits {
    public static void main(String[] args) {
        int n=5704,count=0;do{count++;n/=10;}while(n!=0);System.out.println(count);
    }
}
