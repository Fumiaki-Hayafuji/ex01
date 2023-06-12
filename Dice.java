import java.util.Random;


class Dice
{
    private Random dice = new Random();
    private int dice_num;


    
    public void roll_dice()
    {
	dice_num = dice.nextInt(6) + 1;
    }

    public int get_dice_num()
    {
	return dice_num;
    }

}
