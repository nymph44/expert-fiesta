package src;

public class Conversation extends Trader{
    private String aCode;
    private String anwser;
    public String enter;
    
    private String a;
    private String b;
    
    public String choice;
    
    
    public void yourChoice(){
        System.out.println(choice);
    }
    public Conversation(){
        super();
        //String enter = Main.anwser;
        
        String a = new String("y");
        String b = new String("No, thanks.");
        

    }

    //public String intialQ(){
        
        //boolean check1 = a.intern() == b.intern();
        
        
        
       //     System.out.println("Food");
       ///     System.out.println("Potions");
       ///     System.out.println("Armor");
       //     System.out.println("Weapons");
       //     System.out.println("Spells");
       ///     String choice = this.anwser;
       // }   else{
     //       System.out.println("Dit is de fout: " + choice);
    //        System.out.println("Okay, can I help you with anything else?");
    //        System.out.println("[Y] Yes or [N] No");
     //   }
        
       // return anwser;
    //}
    public static void main(String[] args) {
        //Trader traderObject = new Trader();
        //traderObject.doYouWantToTalk();

    }
}
