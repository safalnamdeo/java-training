public class override {
    void eat() {
        System.out.println("maggie");
    }
}
class Child extends override{
    int a=5;
    void eat(){
        System.out.println("pastaaa");
super.eat();
    }
}
class  Helllo{
    public static void main(String[] args) {
        override hj=new Child();
        hj.eat();
    }
}