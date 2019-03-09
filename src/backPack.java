package src;
import java.util.ArrayList;

/**
 * Write a description of class backPack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class backPack extends Person
{
    // instance variables - replace the example below with your own
    private int x;
    public int ammountOfAmmo;
    public String currentWeapon;
    public ArrayList ammountOfHealth;
    public ArrayList packArmor;
   
    
    /**
     * Constructor for objects of class backPack
     */
    public backPack()
    {
        // initialise instance variables
        ArrayList<String> backPack = new ArrayList<String>();
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
