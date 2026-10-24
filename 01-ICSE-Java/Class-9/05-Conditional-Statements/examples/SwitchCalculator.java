// SwitchCalculator: ICSE Java worked example.
public class SwitchCalculator {
    public static void main(String[] args) {
        int a=12,b=4; char op='*'; switch(op){case '+':System.out.println(a+b);break;case '-':System.out.println(a-b);break;case '*':System.out.println(a*b);break;case '/':System.out.println(b!=0?(a/(double)b):"Undefined");break;default:System.out.println("Invalid operator");}
    }
}
