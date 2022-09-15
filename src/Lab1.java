import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {

        String word = "";
        String reverse = "";

        Scanner input = new Scanner(System.in);
        System.out.print(" Enter Word ");
        word = input.nextLine();
        String acceptWord = word.replaceAll("[^a-zA-Z]","");

        char [] filterd = acceptWord.toCharArray();
        int ctr = 0;
        int index = filterd.length-1;

        while(index >= ctr )
        {
            reverse +=  filterd[index];
            index--;
        }

        if(reverse.equalsIgnoreCase(acceptWord))
        {
            System.out.println("This is palindrome");
        }
        else
        {
            System.out.println("This is not palindrome");
        }
    }

}
