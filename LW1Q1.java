import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a odd length word: ");
        String text = input.next();
        int length = text.length();
        while(text.length()%2==0){        
            System.out.println("Enter a odd length word: ");
            text = input.next();
        }
        int midIndex = ((length+1)/2)-1;
        System.out.println("Character in the middle of the word: "+text.charAt(midIndex));
    }
}
