/////////////////////////////////////////////////////////////////////////////
//
//  Name: ReadIn
//  Author: Kevin S K J Sutton
//  Description: Class which handles reading in data from outside sources to
//  create any objects needed for the game.
//
//  Fields: Scanner instream
//  Functions: private String[] pullIn(String fileName), 
//             private int findType(String[] input),
//             private Object createObject(int ID, String[] data),
//             public Object Constructor(String fileName)
//  Parent: none.
//  Children: none.
//
/////////////////////////////////////////////////////////////////////////////

package whoareyouedomkivitch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class ReadIn {
    
    static Scanner instream = null; // the stream that will be used to read in
    // the data.
    
    //////////////////////////////////////////////////////////////////////////////
    //  Descritpion: This function reads in all data from a provided external
    //  file.
    //
    //  Inputs: A String contianing the name of the file to be read in.
    //
    //  Outputs: A String array containing each line of the file in order.
    //////////////////////////////////////////////////////////////////////////////
    private static String[] pullIn(String fileName)
    {
        //This block attempts to open the input file.
        //If there is no file with this name, it prints an error to the 
        //console.
        try
        {
            instream = new Scanner(new File(fileName + ".txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("ERROR. There is no file named: " + fileName + ".txt");
            System.out.println(e);
        }
        
        //This block loops through the opened file and places each line of 
        //the file into an array as a string.
        int count = 0;
        String[] output = new String[10];
        while (count < output.length)
        {
            if(instream.hasNextLine())
            {
                output[count] = instream.nextLine();
            }
            count++;
        }
        
        //This block closes the opened file and then returns the output array.
        instream.close();
        return output;
    }
    
    //////////////////////////////////////////////////////////////////////////////
    //  Descritpion: This function determines the type of object to create based
    //  on the ID number provided.
    //
    //  Inputs: A String array containing all the read in data.
    //
    //  Outputs: An int representing the type of object to be created.
    //////////////////////////////////////////////////////////////////////////////
    private static int findType(String[] input)
    {
        //This block reads in the first item in the array and finds the first
        //two numbers in that value then assigns those two numbers to be the ID.
        int ID;
        String temp = input[0].substring(0,2);
        ID = Integer.parseInt(temp);
        
        //This block returns the resultant ID number.
        return ID;
    }
    
    //////////////////////////////////////////////////////////////////////////////
    //  Descritpion: This function determines which type of object to create
    //  based on the ID number from the date.
    //
    //  Inputs: An int containing the ID number of the class, A String
    //  array containing the data to create an object.
    //
    //  Outputs: An object made from the input data.
    //////////////////////////////////////////////////////////////////////////////
    private static Object createObject(int ID, String[] data)
    {
        //This block uses the provided ID to determine the type of object
        //to create then returns the provided object.
        Object output;
        switch(ID)
        {
            case 0:
                output = new Card(data);
                break;
            case 1:
                output = new City(data);
                break;
            case 2:
                output = new Creature(data);
                break;
            case 3:
                output = new Dungeon(data);
                break;
            case 4:
                output = new EliteMinion(data);
                break;
            case 5:
                output = new Friendly(data);
                break;
            case 6:
                output = new Hostile(data);
                break;
            case 7:
                output = new Item(data);
                break;
            case 8:
                output = new Key(data);
                break;
            case 9:
                output = new Location(data);
                break;
            case 10:
                output = new Mine(data);
                break;
            case 11:
                output = new Minion(data);
                break;
            case 12:
                output = new Mission(data);
                break;
            case 13:
                output = new NPC(data);
                break;
            case 14:
                output = new Player(data);
                break;
            case 15:
                output = new Tactic(data);
                break;
            case 16:
                output = new Trash(data);
                break;
            case 17:
                output = new UseItem(data);
                break;
            default:
                output = null;
                break;
        }
        return output;
    }
    
    //////////////////////////////////////////////////////////////////////////////
    //  Descritpion: This function allows outside classes to access the internal
    //  methods to read in data and create objects from it.
    //
    //  Inputs: A String containing the name of the file to be read in.
    //
    //  Outputs: An object of the appropriate type made from all the data in the
    //  given file.
    //////////////////////////////////////////////////////////////////////////////
    public static Object Constructor(String fileName)
    {
        //This block chains together the previous three functions then returns
        //the resultant object.
        String[] data = pullIn(fileName);
        int ID = findType(data);
        Object output = createObject(ID, data);
        return output;
    }

}
