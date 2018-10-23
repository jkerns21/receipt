import java.util.Scanner;

public class MealReceipt 
{


	public static void main(String[]args)
	{
		
		Scanner keyboard  =  new Scanner(System.in);
		System.out.println("Please enter the name of your appetizer: ");
		String appetizerStr = keyboard.nextLine();
		System.out.println("Please enter the price of your appetizer: ");
		String appetizerPriceStr = keyboard.nextLine();
		System.out.println("Please enter the name of your entrée: ");
		String entreeStr = keyboard.nextLine();
		System.out.println("Please enter the price of your entrée: ");
		String entreePriceStr = keyboard.nextLine();
		System.out.println("Please enter the name of your dessert: ");
		String dessertStr = keyboard.nextLine();
		System.out.println("Please enter the price of your dessert: ");
		String dessertPriceStr = keyboard.nextLine();
		System.out.println("Please enter the name of your drink: ");
		String drinkStr = keyboard.nextLine();
		System.out.println("Please enter the price of your drink: ");
		String drinkPriceStr = keyboard.nextLine();
		System.out.println("What percentage would you like to tip (as decimal): ");
		String tipStr = keyboard.nextLine();
		
		double appetizer = Double.parseDouble(appetizerPriceStr);
		double entree = Double.parseDouble(entreePriceStr);
		double dessert = Double.parseDouble(dessertPriceStr);
		double drink = Double.parseDouble(drinkPriceStr);
		double subtotal = appetizer + entree  + dessert + drink;
		double tax = subtotal * 0.06;
		double tip = Double.parseDouble(tipStr);
		tip = tip * subtotal;
		double total = tip + subtotal + tax;
		
		System.out.println("\n\nItem\t\t\tPrice");
		System.out.println(appetizerStr + "\t\t\t$" + appetizer);
		System.out.println(entreeStr + "\t\t\t$" + entree);
		System.out.println(dessertStr + "\t\t\t$" + dessert);
		System.out.println(drinkStr + "\t\t\t$" + drink);
		System.out.println("Subtotal:\t\t$" + subtotal);
		System.out.println("Tax:\t\t\t$" + tax);
		System.out.println("Tip at " + tipStr + ":\t\t$" + tip);
		System.out.println("\nTotal:\t\t\t$" + total);
		
	}
	
}
