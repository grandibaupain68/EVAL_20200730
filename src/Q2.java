
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Formation
 */
public class Q2 {

  
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in) ;
        String mot1 ; int b ;
        
        System.out.print("Saisir un mot au clavier :");
        mot1 = reader.nextLine() ;
        b = mot1.length() ;
        
        System.out.println((EstPalindrome (b , mot1)) ? "Ce mot est un palindrome" : "Ce mot n'est pas un palindrome");
    }
    
    public static boolean EstPalindrome(int a, String mot) {
   
        a = mot.length();
        char[] tab = new char[a];
 
        for(int i = 0; i < a ; i++){
        tab[i] = mot.charAt(i);
        
        if (tab[a-1-i] != tab[i])
            return false ;
        }
        return true ;
    }  
}
