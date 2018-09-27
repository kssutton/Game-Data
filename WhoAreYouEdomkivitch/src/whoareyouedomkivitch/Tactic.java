/////////////////////////////////////////////////////////////////////////////
//
//  Name: Tactic
//  Author: Kevin S K J Sutton
//  Description: Class which handles all tactic type cards.
//
//  Fields: char School;
//          char Attribute;
//  Functions:
//  Parent: Card
//  Children:
//
/////////////////////////////////////////////////////////////////////////////

package whoareyouedomkivitch;

/**
 *
 * @author Kevin
 */
public class Tactic extends Card{
    
    char School;
    char Attribute;
    
    //////////////////////////////////////////////////////////////////////////////
    //  Descritpion: This function serves as the constructor for the Tactic
    //  class.
    //
    //  Inputs: A String array containing all the data needed to create a Tactic
    //  object.
    //
    //  Outputs: A Tactic Object
    //////////////////////////////////////////////////////////////////////////////
    public Tactic(String[] data)
    {
        super(data);
        
        School = data[4].charAt(0);
        Attribute = data[5].charAt(0);
    }

}
