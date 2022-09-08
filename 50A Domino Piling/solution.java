import java.util.Scanner;
public class solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, d;
        m = sc.nextInt();
        n = sc.nextInt();
        d = m*n/2;
        System.out.println(d);
        sc.close();
    }
}