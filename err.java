public class err {
    public static void main(String[] args) {
        int a=10; int b=2;
        try {
            int c = a / b;
            System.out.println(c);
        }catch (Exception e) {
            System.out.println("we can not divide by 0");
        }
    }
}
