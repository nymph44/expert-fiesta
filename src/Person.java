package src;

public class Person {
    String namePlayer;
    public int cash;

    public String Person(){
        
        System.out.println("Okay, you're name is: ");
        return this.namePlayer;
        //cash = 0;
        //return toString(cash);
    }
    
    public String setName(String namePlayer){
        System.out.println("You're name is: " + namePlayer + "?");
        System.out.println("If you'd like to rename your character you can do so with the method resetName");
        return namePlayer;
    }
    
    public String resetName(String namePlayer){
        System.out.println("You're name is: " + namePlayer + "?");
        System.out.println("Make up your mind, bitchboy.");
        return namePlayer;
    }

    public void getNamePlayer(){
        System.out.println(this.namePlayer);
    }
}
