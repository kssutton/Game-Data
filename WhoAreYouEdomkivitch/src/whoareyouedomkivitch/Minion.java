/////////////////////////////////////////////////////////////////////////////
//
//  Name: Minion
//  Author: Kevin S K J Sutton
//  Description: Class which handles all minion type cards
//
//  Fields:
//  Functions:
//  Parent: Inbetween_Minion
//  Children:
//
/////////////////////////////////////////////////////////////////////////////

package whoareyouedomkivitch;

/**
 *
 * @author Kevin
 */
public class Minion extends Inbetween_Minion{
    
    int rank;
    char characteristic;

    //////////////////////////////////////////////////////////////////////////////
    //  Descritpion: This function serves as the constructor for the Minion
    //  class.
    //
    //  Inputs: A String array containing all the data needed to create a Minion
    //  object.
    //
    //  Outputs: A Minion Object
    //////////////////////////////////////////////////////////////////////////////
    public Minion(String[] data)
    {
        super(data);
        rank = Integer.parseInt(data[6]);
        characteristic = data[7].charAt(0);
    }

}
