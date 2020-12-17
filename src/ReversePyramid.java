import java.util.Scanner;

public class ReversePyramid {
	
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of rows: ");    
	    int rows = sc.nextInt(); 
	    int i, j, space = 1;     
	    
	    for (j = 1; j <= rows; j++)  
	    {  
	    for (i = 1; i < space; i++)  
	    {  
	    System.out.print(" ");  
	    }  
	    
	    space++;  
	    for (i = 1; i <= 2 * (rows - j + 1) - 1; i++)  
	    {  
	    System.out.print("*");  
	    }  
	    System.out.println("");  
	    }      
	    
		sc.close();
		
	}
	
}
