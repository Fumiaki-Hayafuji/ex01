class Dice_application
{
    public static void main(String[] args)
    {
	Dice d = new Dice();
	int i;
	int total_dice_num = 0;
	int dice_num = 0;

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

    }

}
