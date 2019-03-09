package src;
import java.util.ArrayList;

public class Trader {
    public String respond;
    
    public static void startMessage(){
        System.out.println();
        System.out.println("   Trader");
        System.out.println(" /^^^^^^^^");
        System.out.println("(｀◔   ◔´)");
        System.out.println(" (   ω   )");
        System.out.println("  (     )");
        System.out.println("  (     )");
        System.out.println("  (_____)");
        System.out.println();
        System.out.println("Hello stranger!");
        System.out.println("I've got lots of items you might be interested in.");
        System.out.println("Would you like to see some?");
        System.out.println("[Y] Yes or [N] No");
        System.out.println();

    }
    
    public String doYouWantToTalk(String respond){
        String Y = "Yes";
        String N = "No";
        
        if(respond == "Y"){
            respond = Y;
            showMerch();
        }   else{
            respond = N;
        }
        return respond;
    }

    public static void main(String[] args){
        Conversation conversationObject = new Conversation();
        startMessage();
        
        
    }

    public void showMerch(){
        Shop shopObject = new Shop();
        shopObject.showItems();
    }

}
