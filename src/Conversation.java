package src;

public class Conversation extends Trader{
    private String aCode;
    private String anwser;
    public String enter;
    
    private String a;
    private String b;
    
    public String choice;
    public String yourChoice;
    
    
    public void yourChoice(){
        yourChoice = this.choice;
        System.out.println(choice);
    }
    
    public Conversation(String yourChoice){
        super();
        //String enter = Main.anwser;
        
        String a = new String("y");
        String b = new String("N");
    }
    
    public static void main(String[] args) {
        //Trader traderObject = new Trader();
        //traderObject.doYouWantToTalk();

    }
}
