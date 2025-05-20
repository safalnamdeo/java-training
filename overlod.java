public class overlod {
    void sum(int a,int b){
        System.out.println(a+b);

    }
    void sum(int a, int b,int c){
        System.out.println(a+b+c);
    }
}
class Hello{
    public static void main(String[] args) {
        overlod hu=new overlod();
        hu.sum(2,3,5);
    }
}