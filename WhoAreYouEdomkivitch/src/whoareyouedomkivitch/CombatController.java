/////////////////////////////////////////////////////////////////////////////
//
//  Name: CombatController
//  Author: Kelsey S K J Sutton
//  Description: This class handles all functions that will be used in combat
//  and both initiates and ends combat.
//
//  Fields: Field fieldOfPlay;
//          Boolean combatActive;
//          Boolean isFirstTurn;
//          int globalTurnNumber;
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
    Boolean isFirstTurn;
    int globalTurnNumber;
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
        isFirstTurn = true;
        globalTurnNumber = 0;
        turn = -1;
    }
    
    //////////////////////////////////////////////////////////////////////////////
    //  Descritpion: This function determines the ordetr of turns for the 
    //  creatures that are included in the given field object.
    //
    //  Inputs: A Field object containing all the creatures in combat
    //
    //  Outputs: Nothing.
    //////////////////////////////////////////////////////////////////////////////
    private void determineTurnOrder(Field current)
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
        this.turnOrder = speedValues;
    }
    
    private void COMBATLOOP()
    {
        int index = 0;
        while(combatActive == true)
        {
            if(turn < 0)
            {
                this.determineTurnOrder(this.fieldOfPlay);
            }
            
            Creature actor = this.returnCreature(turn);
            //LIST OF THINGS TO DO ON EACH TURN.
            
            //DRAW:
                //if first turn, draw 3 cards from each chain 1-4
                //if not, prompt player to draw 3 cards total from
                //their choice of chains.
            if(isFirstTurn == true)
            {
                
            }
            
            //STANDBY:
                //check for any continuous effects and resolve them
                
            //MAIN:
                //allow player to use any cards they can from their hand
                //resolve any effects that activate here.
            
            //PROMPT:
                //ask the player if they want to either attack with thier
                //minions or use an item.
            
            //ACTION:
                //allow the player to use their item or make their attacks
                //calculate any damage or effects.
                
            //END:
                //set the turn counter to the next turn
                //determine if any creatures were killed
                //return to top of the loop.
        }
    }
    
    //////////////////////////////////////////////////////////////////////////////
    //  Descritpion: This function returns the creature which matches the speed
    //  value present in the turn order array.
    //
    //  Inputs: An int representing the speed of the creature to select.
    //
    //  Outputs: A creature object.
    //////////////////////////////////////////////////////////////////////////////
    private Creature returnCreature(int speed)
    {
        int count = 0;
        Creature holding = null;
        while(count < 5)
        {
            holding = this.fieldOfPlay.player.Party[count];
            if(holding.Speed == speed)
            {
                count = 6;
            }
            else
            {
                count++;
                if(count == 5)
                {
                    count = 0;
                    while (count < 5)
                    {
                        holding = this.fieldOfPlay.opponents[count];
                        if(holding.Speed == speed)
                        {
                            count = 6;
                        }
                        else
                        {
                            count++;
                        }
                    }
                }
            }
        }
        if(holding == null)
        {
            System.out.println("ERROR IN LOCATING CREATURE");
            System.out.println("THERE IS NO CREATURE WITH THIS SPEED");
        }
        return holding;
    }

}
