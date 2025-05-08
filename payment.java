abstract class payment {
    abstract void pay(int a);

    void print() {
        System.out.println("payment done");
    }
}
class UpiPayment extends payment{
    void pay(int a){
        System.out.println("payment done via upi" +a );
    }
}
class Cardpayment extends payment{
    void pay(int a){
        System.out.println("payment done via card" +a);
    }
}
class mMain{
    public static void main(String[] args) {
        payment obj= new UpiPayment();
        obj.pay(5000);
        obj.print();
        payment obj1= new Cardpayment();
        obj1.pay(11000);
        obj1.print();
    }
}