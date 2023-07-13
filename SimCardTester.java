class SimCardTester{
public static void main(String Sim[]){
SimCard.addSim("Jio");
SimCard.addSim("Airtel");
SimCard.addSim("BSNL");
SimCard.addSim("Vodafone");
SimCard.addSim("Idea");


SimCard.fetchSimNames();



boolean isUpdated = SimCard.updateSimName("Vodafone","VI");
   System.out.println("Is SIM card name updated "+ isUpdated);
   SimCard.fetchSimNames();
   
   
   
   int newLength = SimCard.deleteSimName("BSNL");
   System.out.println("Calling getAllSimNamesPostDeletion");
   SimCard.getAllSimNamesPostDeletion(newLength);
   
   
   
   
}



}