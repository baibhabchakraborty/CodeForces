import java.util.Scanner;
import java.lang.Math;
public class solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=0;
        for(int i = 0; i<5;i++)
        {
            for(int j =0;j<5;j++)
            {
                x = sc.nextInt();
                if(x==1)
                {
                    System.out.println(Math.abs(i-3)+Math.abs(j-3));
                }
            }
        }
        sc.close();
    }
}