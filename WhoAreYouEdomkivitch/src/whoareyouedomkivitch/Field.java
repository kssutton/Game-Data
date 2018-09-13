/////////////////////////////////////////////////////////////////////////////
//
//  Name: Field
//  Author: Kelsey S K J Sutton
//  Description: This class handles the field of cards for combat encounters. 
//  This class also holds and uses all functions related to any comabt
//  related activities and all combat actions.
//
//  Fields: Player player,
//          Creature[] opponents,
//          Card[][] mainField
//  Functions:
//  Parent:
//  Children:
//
/////////////////////////////////////////////////////////////////////////////

package whoareyouedomkivitch;

/**
 *
 * @author Kelsey
 */
public class Field {
    
    Player player;
    Creature[] opponents;
    Card[][] mainField;
    
    //////////////////////////////////////////////////////////////////////////////
    //  Descritpion: This function serves as the constructor for the Field
    //  class.
    //
    //  Inputs: A Player object and an array of creatures containing all the
    //  opponents the player will fight
    //
    //  Outputs: A Field Object
    //////////////////////////////////////////////////////////////////////////////
    public Field(Player currentPlayer, Creature[] toFight)
    {
        player = currentPlayer;
        opponents = toFight;
        mainField = new Card[10][11];
    }

}
