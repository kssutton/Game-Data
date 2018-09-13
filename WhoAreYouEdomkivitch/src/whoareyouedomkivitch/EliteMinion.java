/////////////////////////////////////////////////////////////////////////////
//
//  Name: EliteMinion
//  Author: Kevin S K J Sutton
//  Description: Handles all Elite Minion Type cards.
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
public class EliteMinion extends Inbetween_Minion{

    Card[] exileRequirements;

    //////////////////////////////////////////////////////////////////////////////
    //  Descritpion: This function serves as the constructor for the Elite
    //  Minion class.
    //
    //  Inputs: A String array containing all the data needed to create an Elite
    //  Minion object.
    //
    //  Outputs: An Elite Minion Object
    //////////////////////////////////////////////////////////////////////////////
    public EliteMinion(String[] data)
    {
        super(data);
        
        String[] requirements = new String[3];
        requirements[0] = data[6];
        requirements[1] = data[7];
        requirements[2] = data[8];
        
        exileRequirements = new Card[3];
        String[] holdingArray = null;
        
        int count = 0;
        while (count < exileRequirements.length)
        {
            holdingArray = ReadIn.pullIn(requirements[count]);
            Card temp = new Card(holdingArray);
            exileRequirements[count] = temp;
            count++;
        }
        
    }
    
}
