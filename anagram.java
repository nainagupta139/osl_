/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author naina
 */
import java.util.Arrays;
import java.util.Scanner;
public class anagram
{
    public static void main(String[] args) 
    {
        Scanner input =new Scanner (System.in);
        String s1="", s2="";
        char a1[], a2[];
        int i,l1,l2;
        
        System.out.println("Enter 1st string");
        s1=input.nextLine().toLowerCase();
         l1=s1.length();
        
        System.out.println("Enter 2nd string");
        s2=input.nextLine().toLowerCase();
         l2 = s2.length();
        
                a1= new char[l1];
                a2= new char[l2];
     
                for(i=0;i<l1;i++)
                {
                  a1[i]=s1.charAt(i);
                }
                for(i=0;i<l2;i++)
                {
                  a2[i]=s1.charAt(i);
                }
                 Arrays.sort(a1);
                Arrays.sort(a2);
                {
                if(Arrays.equals(a1, a2))
                {
                    System.out.println("Anagram");
                }
                else
                {
                    System.out.println("Not anagram");
                }
                }
                
    }
}
