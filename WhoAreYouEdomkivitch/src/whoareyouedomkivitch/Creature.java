/////////////////////////////////////////////////////////////////////////////
//
//  Name: Creature
//  Author: Kevin S K J Sutton
//  Description: Holding class for all creatures in the game. Allows for use
//  of functions on types of creatures at once.
//
//  Fields: int Level,
//          int Experience,
//          int Health,
//          int Power,
//          int Finesse,
//          int Intellect,
//          int Faith,
//          int Speed,
//          int Endurance,
//          int Charisma,
//          int Luck,
//          Card[] Deck
//  Functions: public Creature(String[])
//  Parent:
//  Children: NPC, Inbetween_CombatCreature
//
/////////////////////////////////////////////////////////////////////////////

package whoareyouedomkivitch;

/**
 *
 * @author Kevin
 */
public class Creature {

    int id;
    String name;
    
    int Level;
    int Experience;
    
    int Health;
    
    int Power;
    int Finesse;
    int Intellect;
    int Faith;
    int Speed;
    int Endurance;
    int Charisma;
    int Luck;
    
    Card[] Deck;
    
    //////////////////////////////////////////////////////////////////////////////
    //  Descritpion: This function serves as the constructor for the Creature
    //  class.
    //
    //  Inputs: A String array containing all the data needed to create a Creature
    //  object.
    //
    //  Outputs: A Creature Object
    //////////////////////////////////////////////////////////////////////////////
    public Creature(String[] data)
    {
        id = Integer.parseInt(data[0]);
        name = data[1];
        Level = Integer.parseInt(data[2]);
        Experience = Integer.parseInt(data[3]);
        Health = Integer.parseInt(data[4]);
        Power = Integer.parseInt(data[5]);
        Finesse = Integer.parseInt(data[6]);
        Intellect = Integer.parseInt(data[7]);
        Faith = Integer.parseInt(data[8]);
        Speed = Integer.parseInt(data[9]);
        Endurance = Integer.parseInt(data[10]);
        Charisma = Integer.parseInt(data[11]);
        Luck = Integer.parseInt(data[12]);
    }
    
    public int getHealth()
    {
        return this.Health;
    }
    
    public void setHealth(int health)
    {
        this.Health = health;
    }
    
}
