package src;

public class Main{
    public String myName;
    public Main(String namePlayer){
        Person personObject = new Person();
        personObject.setName(namePlayer);

        this.myName = namePlayer;

    }

    public void resetName(String namePlayer){
        Person personObject = new Person();
        personObject.resetName(namePlayer);
    }

    public void toTheMerchant(){
        Trader.startMessage();
    }

    public void help(){
        Introduction.helper();
    }

    public String engageTrader(String anwser){
        Conversation conversationObject = new Conversation();
        Trader traderObject = new Trader();
        //conversationObject.intialQ();
        //conversationObject.yourChoice();
        traderObject.showMerch();
        return anwser;
        
        
    }
    
    public void ammo1(){
        Shop shopObject = new Shop();
        shopObject.buyAmmo(1);     
    }
    
    public void ammo2(){
        Shop shopObject = new Shop();
        shopObject.buyAmmo(2);     
    }
    
    public void ammo3(){
        Shop shopObject = new Shop();
        shopObject.buyAmmo(3);     
    }
    
    public void ammo4(){
        Shop shopObject = new Shop();
        shopObject.buyAmmo(4);     
    }

    public static void main(String[] args) {

        Person personObject = new Person();
        personObject.getNamePlayer();

        if(personObject != null){
            Introduction introductionObject = new Introduction();
            Introduction.helper();

        }

    }
    
    
}
