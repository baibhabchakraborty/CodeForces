import java.util.Scanner;
public class solution2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String word1 = input.next();
        String word2 = input.next();
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        int result = word1.compareTo(word2);
        if(result > 0){
            result = 1;
        }else if(result < 0){
            result = -1;
        }
        System.out.println(result);
    }
}