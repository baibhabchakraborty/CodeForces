import java.util.Scanner;

public class solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String input = sc.next();
        int total =0, index=0;
        char state = input.charAt(0);

        while(++index < length)
        {
            if(input.charAt(index) == state)
            {
                ++total;
            }
            else{
                state = input.charAt(index);
            }
        }
        System.out.println(total);

        sc.close();
    }
}