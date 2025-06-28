import java.util.*;
public class PalindromeCheck {

     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String ans="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            ans+=ch;
        }
        if(str.equals(ans)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
     }
}