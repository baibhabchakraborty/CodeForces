import java.util.Scanner;

public class solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr;
        arr = sc.next();
        int count0 = 0; int count1 = 0;
        for(int i=0;i<arr.length();i++)
        {
            if(arr.charAt(i)=='0')
            {
                count0++; 
            }
            else
                count0 = 0;
        }
        for(int j=0;j<arr.length();j++)
        {
            if(arr.charAt(j)=='1')
            {
                count1++; 
            }
            else
                count1 = 0;
        }

        if((count1 >= 7)||(count0>=7))
        {
            System.out.println("YES");

        }
        else
            System.out.println("NO");
        sc.close();
    }
}