package LearnJavaAlone;

public class PalindromeExample {
    public static void main(String[] args) {
        int r,sum=0,temp;
        int n=454; // this is the number variable to be checked for palindrome

        temp=n;
        while(n>0){
            r=n%10; // getting remainder
            sum= (sum * 10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("Palindrome Number");
        }else
            System.out.println("Not Palindrome Number");
    }
}
/*
The Palindrome number is for example 323, 121, 545 and etc
we can use palindrome liek string also dad, madam and etc
in this task we had 454 and we used this algorithm to find 454 is palindirome or not and if plandirome we have answer Palindrome number
else Not Palindrome Number
 */