// LeapYear: ICSE Java worked example.
public class LeapYear {
    public static void main(String[] args) {
        int y=2028; System.out.println((y%400==0 || (y%4==0 && y%100!=0))?"Leap year":"Not leap year");
    }
}
