package ellll;

public class sum {
    public static void main(String[] args) {
        int a=555; 
        int res =0;

        while (a>0){
        final int digit =a%10;
        res=res+digit;
        a=a/10;
        } 
        
        System.out.println(res);

            
        }

    }
    

