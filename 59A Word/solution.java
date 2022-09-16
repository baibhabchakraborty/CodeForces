import java.util.Scanner;
public class solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ucase=0,lcase = 0;
        
        for(int i =0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
                ucase++;
            }
            else
                lcase++;
        }

        if(lcase>=ucase)
        {
            s=s.toLowerCase();
        }
        else
            s=s.toUpperCase();

        System.out.println(s);
        sc.close();
    }
}