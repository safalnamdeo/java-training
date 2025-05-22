import java.sql.SQLOutput;

public class ar3 {
    public static void main(String[] args) {
        String str="aaaabbbccc  ";
        int count=1;
        StringBuilder newStr=new StringBuilder();
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;

            }
            else {
                newStr.append(str.charAt(i-1)).append(count);
                count=1;
            }
        }

        System.out.println(newStr);
    }
}
