
/**
 * Write a description of class Battle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battle
{
    public Pokemon p1;
    public Pokemon p2;
    public int p1Attack;// initialise pokemon 1s attack
    public int p1Defense;
    public int p1Health;
    public int p2Attack; // initialise pokemon 2s attack
    public int p2Defense;
    public int p2Health;
    public Battle(Pokemon first , Pokemon second)
    {
        Pokemon p1 = first;
        Pokemon p2 = second;
        p1Attack = p1.attack;
        p1Defense = p1.defense;
        p1Health = p1.health;
        p2Attack = p2.attack;
        p2Defense = p2.defense;
        p2Health = p2.health;
    }
    
    public void fight()
    {
        double p1DefenseRatio;// create a decimal for defense stat
        double p2DefenseRatio;

        if(p1Defense == 15)
        {
            p1DefenseRatio = .5;
        }
        else if(p1Defense == 10)
        {
            p1DefenseRatio = .33;
        }
        else
        {
            p1DefenseRatio = .2;
        }

        if(p2Defense == 15)
        {
            p2DefenseRatio = .5;
        }
        else if(p2Defense == 10)
        {
            p2DefenseRatio = .33;
        }
        else
        {
            p2DefenseRatio = .2;
        }
        
        int counter = 1; // rounds
        while( p1Health > 0 && p2Health > 0 )
        {
            p1Health = p1Health - (int)((1-p1DefenseRatio)*p2Attack);// health goes down
            p2Health = p2Health - (int)((1-p2DefenseRatio)*p1Attack);
            System.out.println("Round: " + counter);
            System.out.println("");
            counter++;
        }

        System.out.println("P1 Final Health: " + p1Health + "\n");
        System.out.println("P2 Final Health: " + p2Health + "\n");

        if(p1Health <= 0)
        {
            System.out.println("p2 Wins!");
        }
        else
        {
            System.out.println("p1 Wins!");
        }
    }

}