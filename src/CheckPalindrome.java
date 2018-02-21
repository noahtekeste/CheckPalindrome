/*
 * This program accepts a string input an checks if it is palindrome or not
 * Output is Yes if string is palindrome and No otherwise
 * By definition a palindrome is a word, phrase, number, or other sequence of characters 
 * which reads the same backward as forward, such as madam or racecar.(wikipedia)
 * Further optimization in the for loop of the program can be done
 */
import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string to check ");
        String A=input.next();
        checkPalindrome(A.toLowerCase());
    }
    
    public static void checkPalindrome(String A){
    	int index = A.length()-1;
    	int count = 0;
    	for(int i=0; i<=A.length()-1; i++){
    		if(A.charAt(i)==A.charAt(index)){//checks if the first and last character are the same
    			//if yes count++...then increment the pointer at the bigining (i) and 
    			//decrement the pointer at end (index)
    			count++;
    		}
    		index = index-1;//decrementing pointer starting from the last character
    	}
    	if(count==A.length()){
    		System.out.println("Palindrome found");
    	}
    	else{
    		System.out.println("Not a Palindrome");
    	}
    	
    }
}
