import java.util.Scanner;
public class solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        String str;
        int op = 0;
        str = sc.nextLine();
        while(--num >=0)
        {
            if(str.charAt(1)=='+')
                op++;
            else
                op--;
        }
        System.out.println(op);
        sc.close();
    }
}