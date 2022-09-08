import java.util.Scanner;

public class solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,a;
        n = sc.nextInt();
        m=sc.nextInt();
        a = sc.nextInt();
        int num = (n+n%a)*(m+m%a)/(a*a);
        System.out.println(num);
        sc.close();
    }
}