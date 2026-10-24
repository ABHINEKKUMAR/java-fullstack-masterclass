// CountVowels: ICSE Java worked example.
public class CountVowels {
    public static void main(String[] args) {
        String s="Education".toLowerCase();int count=0;for(int i=0;i<s.length();i++)if("aeiou".indexOf(s.charAt(i))>=0)count++;System.out.println(count);
    }
}
