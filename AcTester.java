class AcTester{

public static void main(String test[]){
System.out.println("Main Statrted");
Ac.name="samsung";

boolean connected= Ac.onOrOff();
System.out.println("Is Ac connected"+ connected);
Ac.increaseTemp();
Ac.increaseTemp();
Ac.increaseTemp();
Ac.increaseTemp();
Ac.increaseTemp();
Ac.increaseTemp();
Ac.increaseTemp();
 
 boolean connected1= Ac.onOrOff();
System.out.println("Is ac connected  "+ connected);
Ac.decreaseTemp();
Ac.decreaseTemp();
Ac.decreaseTemp();
Ac.decreaseTemp();
Ac.decreaseTemp();
Ac.decreaseTemp();
Ac.decreaseTemp();

 
    
System.out.println("Main ended");
}
}