import java.util.Scanner ; 
public class Shoppingcart {
    public static void main ( String[] args ) { 

Scanner input = new Scanner(System.in) ; 
 double price ;        // variable which acts as a place holder . (Real price )
 double Newprice ;       // variable for calculating price after the user provides quantity 

double quantity ;            // the quantity of food . 
boolean valid ; //checks if the food exists 
System.out.print(" What do you want to buy (Pizza , Burger , Salad , Coke . Chicken) ?  : ");
String food = input.nextLine() ; 
String qr = "Do you want to pay ? Please user this QR" ; //place holder for qr ! 

                 // if statements to Ask details about the food the customers want . 
if (food.equals("Pizza") )   { 
System.out.print("Please enter the quantity :  ");
    quantity = input.nextInt() ; 
price  = 6.2 ; 
Newprice = quantity * price ; 
System.out.println("The price is : $"+ Newprice);
valid = true ;
} 

else if (food.equals("Burger") )   { 
System.out.print("Please enter the quantity :  ");
    quantity = input.nextInt() ; 
price  = 5 ; 
Newprice = quantity * price ; 
System.out.println("The price is : $"+ Newprice);
valid = true ;
} 

else if (food.equals("Salad") )   { 
System.out.print("Please enter the quantity :  ");
    quantity = input.nextInt() ; 
price  = 2 ; 
Newprice = quantity * price ; 
System.out.println("The price is : $"+ Newprice);
valid = true ;
} 

else if (food.equals("Chicken") )   { 
System.out.print("Please enter the quantity :  ");
    quantity = input.nextInt() ; 
price  = 5 ; 
Newprice = quantity * price ; 
System.out.println("The price is : $"+ Newprice);
valid = true ;
} 


else if (food.equals("Coke") )   { 
System.out.print("Please enter the quantity :  ");
    quantity = input.nextInt() ; 
price  = 1.5 ; 
Newprice = quantity * price ; 
System.out.println("The price is : $"+ Newprice);
valid = true ;
} 

else { 
     System.out.print(" Sorry We dont serve that . ");
      valid = false ; 
}

 if (valid==true) System.out.println(qr);
input.close();
    }
}
