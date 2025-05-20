import java.sql.SQLOutput;

public class inherit {
    void eat() {
        System.out.println("eat");
    }
}
class dog extends inherit {
    void bark() {
        System.out.println("Bhowww");
    }
}
class puppy extends dog{
    void cute() {
        System.out.println("cutieeeee");
    }
}
class hellooo{
    public static void main(String[] args) {
        puppy obi=new puppy();
        obi.cute();
        obi.bark();
        obi.eat();

    }
}
