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
//          Card[] Chain1Deck
//          Card[] Chain2Deck
//          Card[] Chain3Deck
//          Card[] Chain4Deck
//          Card[] Chain5Deck
//  Functions: public Creature(String[]), public int getHealth(), 
//  public void setHealth(int health), 
//  protected Card[] shuffleDeck(Card[] deck)
//  Parent:
//  Children: NPC, Inbetween_CombatCreature
//
/////////////////////////////////////////////////////////////////////////////

package whoareyouedomkivitch;

import java.util.Random;

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
    
    Card[] Chain1Deck;
    Card[] Chain2Deck;
    Card[] Chain3Deck;
    Card[] Chain4Deck;
    Card[] Chain5Deck;
    
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
    
    //////////////////////////////////////////////////////////////////////////////
    //  Descritpion: This function allows other functions to access the health
    //  of the creature
    //
    //  Inputs: nothing
    //
    //  Outputs: an int containing the creature's health
    //////////////////////////////////////////////////////////////////////////////
    public int getHealth()
    {
        return this.Health;
    }
    
    //////////////////////////////////////////////////////////////////////////////
    //  Descritpion: This function allows other functions to assign the health
    //  of the creature
    //
    //  Inputs: an int health, containing the health to be set
    //
    //  Outputs: nothing
    //////////////////////////////////////////////////////////////////////////////
    public void setHealth(int health)
    {
        this.Health = health;
    }
    
    //////////////////////////////////////////////////////////////////////////////
    //  Descritpion: This function takes the given creature's deck and shuffles 
    //  it.
    //
    //  Inputs: a card array containing the deck attribute of a creature.
    //
    //  Outputs: a card array containing the shuffled deck.
    //////////////////////////////////////////////////////////////////////////////
    protected Card[] shuffleDeck(Card[] deck)
    {
        int length = deck.length;
        for(int i = length - 1; i > 0; i--)
        {
            int index = new Random().nextInt(i+1);
            Card swap = deck[index];
            deck[index] = deck[i];
            deck[i] = swap;
        }
        return deck;
    }
    
}
