package src;
import java.util.ArrayList;

/**
 * Write a description of class Shop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shop extends Trader
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Shop
     */
    public Shop()
    {
        // initialise instance variables
        
    }
    
    public void showItems(){
        
        ArrayList<String> Ammo = new ArrayList<String>();
        ArrayList<String> Health = new ArrayList<String>();
        ArrayList<String> Armor = new ArrayList<String>();
        ArrayList<String> Weapons = new ArrayList<String>();
        ArrayList<String> foods = new ArrayList<String>();
        
        Ammo.add("1: 9mm, $0.70");
        Ammo.add("2: 5.56mm, $1.02");
        Ammo.add("3: 7.62mm, $1.32");
        Ammo.add("4: 12mm, " + "$1.70");
        
        Armor.add("1: light vest, $500");
        Armor.add("2: Wooky uniform, $1300");
        Armor.add("3: Tangletis fully plated, $4500" );
        Armor.add("4: euphoria total coverage, $15000");
        
        Weapons.add("1: Assault rifle, 3000 >");
        Weapons.add("2: Handgun, 1200 >");
        Weapons.add("3: Carbine, 4450 >");
        Weapons.add("4: Explosives 2000 >");
        
        Health.add("1: Bandaids, $50");
        Health.add("2: Health kit, $150");
        Health.add("3: calmy calmy Pills, $80");
        Health.add("4: F i n e  a s s  C r a c k, $45");
        
        foods.add("1: 3 day old sandwhich, $5");
        foods.add("2: chips, $6");
        foods.add("3: Hamburger, $12");
        foods.add("4: escargo sarcred blue, $20");
            
            System.out.println("----------------");
            System.out.println("------AMMO------");
        for(String object : Ammo){
            
            System.out.println("----------------");
            System.out.println(object);
            System.out.println("----------------");
        }
            System.out.println("----------------");
            System.out.println("-----HEALTH-----");
        for(String object : Health){
            
            System.out.println("----------------");
            System.out.println(object);
            System.out.println("----------------");
        }
            System.out.println("----------------");
            System.out.println("------Armor------");
        for(String object : Armor){
            
            System.out.println("----------------");
            System.out.println(object);
            System.out.println("----------------");
        }
            System.out.println("----------------");
            System.out.println("-----Weapons----");
        for(String object : Weapons){
            System.out.println("----------------");
            System.out.println(object);
            System.out.println("----------------");
        }
            System.out.println("----------------");
            System.out.println("------Foods-----");
        for(String object : foods){
            System.out.println("----------------");
            System.out.println(object);
            System.out.println("----------------");
        }
    }
    
    public void buyAmmo(int productNummer){
        if(productNummer == 1){
            System.out.println("50 bullets, 9mm bought.");
        }   if(productNummer == 2){
            System.out.println("35 bullets, 5.56mm bought.");
        }   if(productNummer == 3){
            System.out.println("25 bullets, 7.62mm bought.");
        }   if(productNummer == 4){
            System.out.println("8 bullets, 12mm bought.");
        }   else{
            System.out.println("Invalid product code entered!");
        }
    }
    
    public static void main(String[] args){
        
        
    }
}
