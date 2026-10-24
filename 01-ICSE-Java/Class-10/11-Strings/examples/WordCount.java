// WordCount: ICSE Java worked example.
public class WordCount {
    public static void main(String[] args) {
        String s="Java is fun".trim();System.out.println(s.isEmpty()?0:s.split("\s+").length);
    }
}
