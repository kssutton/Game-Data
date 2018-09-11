/////////////////////////////////////////////////////////////////////////////
//
//  Name: Inbetween_CombatCreature
//  Author: Kevin S K J Sutton
//  Description: Class which acts as an inbetween, handling functions which
//  effect both friendly and hostile creatures which can fight but not just
//  one. NOTE: No creatures will be labeled as Inbetween_CombatCreature.
//
//  Fields:
//  Functions:
//  Parent: Creature
//  Children: Friendly, Hostile
//
/////////////////////////////////////////////////////////////////////////////

package whoareyouedomkivitch;

/**
 *
 * @author Kevin
 */
public class Inbetween_CombatCreature extends Creature{
    
    public Inbetween_CombatCreature(String[] data)
    {
        super(data);
        
    }

}
