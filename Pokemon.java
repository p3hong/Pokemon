
/**
 * Write a description of class Pokemon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pokemon
{
    private int attackIV;// initialise the attackIV
    private int defenseIV;
    private int healthIV;
    public int attack;// initialise its actual attack stat
    public int defense;
    public int health;
    public Pokemon(int attackIV, int defenseIV, int healthIV)
    {
        this.attackIV = (int)(Math.random()*14) + 1; // establishes a random Individual value
        this.defenseIV = (int)(Math.random()*14) + 1;
        this.healthIV = (int)(Math.random()*14) + 1;
        
        if(this.attackIV > 10) // gives its actual attack stat
            this.attack = 30;
        else if(this.attackIV > 5)
            this.attack = 20;
        else
            this.attack = 10;
            
        if(this.defenseIV > 10) // gives its actual defense stat
            this.defense = 15;
        else if(this.defenseIV > 5)
            this.defense = 10;
        else
            this.defense = 5;
            
        if(this.healthIV > 10) // gives its actual health
            this.health = (int)(Math.random()*50) + 150;
        else if(this.healthIV > 5)
            this.health = (int)(Math.random()*50) + 100;
        else
            this.health = (int)(Math.random()*50) + 50;
    }

    public void printStats()
    {
        
        System.out.println("\n" + "Attack: " + this.attack + "\n" + "Defense: " + this.defense + "\n" + "Health: " + this.health);
    }
}
