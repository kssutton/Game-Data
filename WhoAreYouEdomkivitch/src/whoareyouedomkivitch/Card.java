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
    
    public Card(String[] data)
    {
        id = Integer.parseInt(data[0]);
        name = data[1];
        type = data[2];
    }
    
    @Override
    public String toString()
    {
        System.out.println(this.id);
        System.out.println(this.type);
        return(this.name);
    }
    
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
    
    public void effect_dealDamage(Creature target, int damageAmmount)
    {
        int targetHealth = target.getHealth();
        targetHealth = targetHealth - damageAmmount;
        target.setHealth(targetHealth);
    }

}
