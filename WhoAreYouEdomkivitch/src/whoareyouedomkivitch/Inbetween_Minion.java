/////////////////////////////////////////////////////////////////////////////
//
//  Name: Inbetween_Minion
//  Author: Kevin S K J Sutton
//  Description: A class which acts as an inbetween for minions and Elite
//  minions. Handles functions which effect both minions and Elite minions
//  but not just one. NOTE: no cards will be labeled as Inbetween_Minions.
//
//  Fields: char attribute, int attack, int defense
//  Functions:
//  Parent: Card
//  Children: Minion, EliteMinion
//
/////////////////////////////////////////////////////////////////////////////

package whoareyouedomkivitch;

/**
 *
 * @author Kevin
 */
public class Inbetween_Minion extends Card{
    
    char attribute;
    int attack;
    int defense;
    
    //////////////////////////////////////////////////////////////////////////////
    //  Descritpion: This function serves as the constructor for the 
    //  inbetween_minion class. Note, this is only used to give traits to
    //  both minions and elite minions.
    //
    //  Inputs: A String array containing all the data needed to create
    //  and inbetween_minion object.
    //
    //  Outputs: A new inbetween_minion object
    //////////////////////////////////////////////////////////////////////////////
    public Inbetween_Minion(String[] data)
    {
        super(data);
        attribute = data[4].charAt(0);
        attack = Integer.parseInt(data[5]);
        defense = Integer.parseInt(data[6]);
    }

}
