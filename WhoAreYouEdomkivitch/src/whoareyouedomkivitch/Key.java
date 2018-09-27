/////////////////////////////////////////////////////////////////////////////
//
//  Name: Key
//  Author: Kevin S K J Sutton
//  Description: Class which handles all Key type cards.
//
//  Fields:
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
public class Key extends Card{
    
    //////////////////////////////////////////////////////////////////////////////
    //  Descritpion: This function serves as the constructor for the Key
    //  class.
    //
    //  Inputs: A String array containing all the data needed to create a Key
    //  object.
    //
    //  Outputs: A Key Object
    //////////////////////////////////////////////////////////////////////////////
    public Key(String[] data)
    {
        super(data);
        //NOTE: All Key cards will be set to a chain of 0
    }

}
