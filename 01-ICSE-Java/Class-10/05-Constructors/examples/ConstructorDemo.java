// ConstructorDemo: ICSE Java worked example.
public class ConstructorDemo {
    public static void main(String[] args) {
        Book b=new Book("Java Basics");b.show();
    }
}
class Book {
    private String title;
    Book(String title){this.title=title;}
    void show(){System.out.println(title);}
}
