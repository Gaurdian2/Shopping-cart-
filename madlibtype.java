import java.util.Scanner ;  
// Game where u guess 5 numbers and if they right u get points . ! 
public class madlibtype { 
	public static void main(String[] args) { 
		
		Scanner input = new Scanner(System.in) ; 
        int num1;   
        int num2;
        int num3;
        int num4;
        int num5;
        int result = 0 ; 
        System.out.println("Please guess 5 numbers between 1 and 10 to begin : ");
  num1 = input.nextInt() ; 
  num2 = input.nextInt() ; 
  num3 = input.nextInt() ; 
  num4 = input.nextInt() ; 
  num5 = input.nextInt() ; 
     if (num1 == 10)  result++ ; 
     if (num2 == 2 ) result ++ ;
     if (num3 == 5) result++ ; 
     if (num4 == 7) result++ ; 
     if ( num5 ==3) result++ ; 


System.out.print(" U scored : " + result+ "/5" );
input.close();
 }
		
		
	}
