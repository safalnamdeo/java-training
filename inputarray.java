import java.util.Scanner;

public class inputarray {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter size of arrrr");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter value of arr");
        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }
        for(int k=0; k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
