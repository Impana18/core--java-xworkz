class SpeakerTester1{

public static void main(String test[]){
System.out.println("Main Statrted");
SpeakerA.name="";

boolean connected= SpeakerA.onOrOff();
System.out.println("Is speaker connected"+ connected);
 SpeakerA.increaseVolume();
  SpeakerA.increaseVolume();
   SpeakerA.increaseVolume();
    SpeakerA.increaseVolume();
 
 boolean connected1= SpeakerA.onOrOff();
System.out.println("Is speakerA connected  "+ connected);
SpeakerA.decreaseVolume();
  SpeakerA.decreaseVolume();
   SpeakerA.decreaseVolume();
    SpeakerA.decreaseVolume();
 
    
System.out.println("Main ended");
}
}