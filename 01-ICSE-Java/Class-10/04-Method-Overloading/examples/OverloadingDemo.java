// OverloadingDemo: ICSE Java worked example.
public class OverloadingDemo {
    public static void main(String[] args) {
        System.out.println(area(4));System.out.println(area(4,6));
    }
    static int area(int side){return side*side;}
    static int area(int length,int breadth){return length*breadth;}
}
