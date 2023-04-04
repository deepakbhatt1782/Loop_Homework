//11. WAP to enter any String and count total number of &#39;a&#39; in that
//String.

import java.util.Scanner;
public class TotalAInString {
    public static void main(String[] args){
        int count = 0;
        System.out.println("Enter a sentence :");
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        //counting 'a' in a given sentence and saving it in a 'count'
        for(int i =0; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            if( ch =='a'){
                count++;
            }
        }
        System.out.println("Number of 'a' in given sentence is " + count);
    }
}
