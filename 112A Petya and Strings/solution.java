import java.util.Scanner;
public class solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first, second;
        first = sc.nextLine();
        second = sc.nextLine();
        int comp = 0;
        
        first = first.toLowerCase();
        second = second.toLowerCase();
        comp = first.compareTo(second);

        if(comp > 0)
        {
            System.out.println(1);
        }
        if(comp < 0)
        {
            System.out.println(-1);
        }
        sc.close();
    }
}