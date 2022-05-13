package Operations;

import java.util.Scanner;

public class Permutations {
	public static void main(String args[])
	{
    	System.out.println("Enter a Word or a Number To get Permutated :");
    	Scanner sc=new Scanner(System.in);
        String str = sc.next();
        int n = str.length(); 
        Permutations p = new Permutations(); 
        p.permute(str, 0, n-1); 
    } 
  

    private void permute(String str, int abc , int xyz) 
    { 
        if (abc == xyz) 
            System.out.println(str); 
        else
        { 
            for (int i = abc; i <= xyz; i++) 
            { 
                str = swap(str,abc,i); 
                permute(str, abc+1, xyz); 
                str = swap(str,abc,i); 
            } 
        } 
    } 
  

    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 


}
