import java.util.Scanner;
import java.util.Arrays;
public class solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int scores[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            scores[i] = sc.nextInt();
        }
        int temp = scores[k-1];
        int promoted = 0;
        Arrays.sort(scores);
        for(int j =0;j<n;j++)
        {
            if(scores[j]>=temp)
            {
                if(scores[j]>0)
                {
                    promoted++;
                }
            }
        }
        System.out.println(promoted);
        sc.close();
    }
}