/////////////////////////////////////////////////////////////////////////////
//
//  Name: CombatController
//  Author: Kelsey S K J Sutton
//  Description: This class handles all functions that will be used in combat
//  and both initiates and ends combat.
//
//  Fields: Field fieldOfPlay;
//          Boolean combatActive;
//          int turn;
//          int[] turnOder;
//  Functions:  CombatController()
//              int determineTurnOrder()
//  Parent:
//  Children:
//
/////////////////////////////////////////////////////////////////////////////

package whoareyouedomkivitch;

import java.util.Arrays;

/**
 *
 * @author Kelsey
 */
public class CombatController {
    
    Field fieldOfPlay;
    Boolean combatActive;
    int turn;
    int[] turnOrder;
    
    //////////////////////////////////////////////////////////////////////////////
    //  Descritpion: This function serves as the constructor for the CombatController
    //  class.
    //
    //  Inputs: A Field object containing all the creatures needed to start combat
    //
    //  Outputs: A CombatController Object
    //////////////////////////////////////////////////////////////////////////////
    public CombatController(Field current)
    {
        fieldOfPlay = current;
        combatActive = true;
        turn = -1;
        turnOrder = new int[(current.player.Party.length+current.opponents.length)];
    }
    
    //////////////////////////////////////////////////////////////////////////////
    //  Descritpion: This function determines the ordetr of turns for the 
    //  creatures that are included in the given field object.
    //
    //  Inputs: A Field object containing all the creatures in combat
    //
    //  Outputs: An array of ints containing the order which combat will be
    //  executed in.
    //////////////////////////////////////////////////////////////////////////////
    private int[] determineTurnOrder(Field current)
    {
        int[] speedValues = new int[10];
        speedValues[0] = current.player.Party[0].Speed;
        speedValues[1] = current.player.Party[1].Speed;
        speedValues[2] = current.player.Party[2].Speed;
        speedValues[3] = current.player.Party[3].Speed;
        speedValues[4] = current.player.Party[4].Speed;
        speedValues[5] = current.opponents[0].Speed;
        speedValues[6] = current.opponents[1].Speed;
        speedValues[7] = current.opponents[2].Speed;
        speedValues[8] = current.opponents[3].Speed;
        speedValues[9] = current.opponents[4].Speed;
        
        Arrays.sort(speedValues);
        this.turn = 0;
        return speedValues;
    }

}
