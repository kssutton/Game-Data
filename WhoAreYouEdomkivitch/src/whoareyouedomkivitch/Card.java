/////////////////////////////////////////////////////////////////////////////
//
//  Name: Card
//  Author: Kevin S K J Sutton
//  Description: A class to contain all types of cards.
//
//  Fields: int id;
//          String name;
//          String type;
//          int effectType;
//  Functions: public Card(String[])
//             public String toString()
//  Parent:
//  Children: Inbetween_Minion, Tactic, Mine, Key
//
/////////////////////////////////////////////////////////////////////////////

package whoareyouedomkivitch;

/**
 *
 * @author Kevin
 */
public class Card {
    
    int id;
    String name;
    String type;
    int effectType;
    
    //////////////////////////////////////////////////////////////////////////////
    //  Descritpion: This function serves as the constructor for the Card
    //  class.
    //
    //  Inputs: A String array containing all the data needed to create a Card
    //  object.
    //
    //  Outputs: A Card Object
    //////////////////////////////////////////////////////////////////////////////
    public Card(String[] data)
    {
        id = Integer.parseInt(data[0]);
        name = data[1];
        type = data[2];
    }
    
    //////////////////////////////////////////////////////////////////////////////
    //  Descritpion: This function allows for conversion of Card objects to 
    //  Strings
    //
    //  Inputs: Nothing
    //
    //  Outputs: A String containing the name of the Card object
    //////////////////////////////////////////////////////////////////////////////
    @Override
    public String toString()
    {
        System.out.println(this.id);
        System.out.println(this.type);
        return(this.name);
    }
    
    //////////////////////////////////////////////////////////////////////////////
    //  Descritpion: This function handles which effect a card will execute.
    //
    //  Inputs: An int flag containing the type of effect to select, and an 
    //  int value containing the numeric value to be used to execute the effect
    //
    //  Outputs: nothing
    //////////////////////////////////////////////////////////////////////////////
    public void effectSelector(int effectType, int value)
    {
        switch (effectType)
        {
            case 1:
                //todo
                break;
            case 2:
                //todo
                break;
            case 3:
                //todo
                break;
            default:
                System.out.println("INVALID EFFECT DATA");
        }
    }
    
    //////////////////////////////////////////////////////////////////////////////
    //  Descritpion: This function executes a card effect which deals
    //  damage to an enemy
    //
    //  Inputs: A Creature target containing the object to be targeted,
    //  int damageAmmount the ammount of damage to be dealt
    //
    //  Outputs: nothing
    //////////////////////////////////////////////////////////////////////////////
    public void effect_dealDamage(Creature target, int damageAmmount)
    {
        int targetHealth = target.getHealth();
        targetHealth = targetHealth - damageAmmount;
        target.setHealth(targetHealth);
    }

}
