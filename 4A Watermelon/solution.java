import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w;
        w=sc.nextInt();
        String output;
        if(w<=2||w%2==1)
        {
            output = "NO";
        }
        else
            output = "YES";

        System.out.println(output);
        sc.close();
    }
}


