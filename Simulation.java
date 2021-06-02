
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Simulation
{
    public static void main(String[] args)
    {
        Pokemon Red = new Pokemon(1,1,1);// creates new Pokemon
        Pokemon Blue = new Pokemon(1,1,1);
        Red.printStats();// prints pokemon's stats
        Blue.printStats();
        Battle fight1 = new Battle(Red,Blue);// creates the battle between the two pokemons
        fight1.fight();
    }
}