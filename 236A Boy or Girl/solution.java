import java.util.Scanner;
public class solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        if(S.length()%2==0)
        {
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
        
        sc.close();
    }
}