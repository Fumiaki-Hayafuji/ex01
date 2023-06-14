import java.util.Scanner;

class Dice_application
{
    public static void main(String[] args)
    {
	Dice d = new Dice();
	int i;
	int total_dice_num = 0;
	int dice_num = 0;
	String name;

	Scanner scan = new Scanner(System.in);
	
	System.out.println("What is your name?");

	System.out.print("> ");
	
	name = new String(scan.next());

	System.out.println("Hello, " + name + "!");
	
	System.out.println("Rolling dice...");

	for(i = 0; i < 2; i++)
	    {
		dice_num = i + 1;
		d.roll_dice();

		System.out.print("Die " + dice_num + ":");

		System.out.println(d.get_dice_num());

		total_dice_num += d.get_dice_num();
		
		
	    }

	System.out.println("Total value: " + total_dice_num);

	if(total_dice_num > 7) System.out.println("You won");
	
	else System.out.println("You lost");
    }

}
