class MetroTester{
 public static void main(String stations[]){
 
 Metro.saveStations("Nagasandra");
 Metro.saveStations("Dasarahalli");
 Metro.saveStations("Yashwanthpur");
 Metro.saveStations("Peenya");
 Metro.saveStations("SandleSoap Factory");
 Metro.saveStations("Mahalakshmipuram");
 Metro.saveStations("Rajajinagar");
 
 Metro.getAllStations();
 boolean isUpdated = Metro.updateStationName("Peenya","Peenya industry");
   System.out.println("Is station name updated "+ isUpdated);
   Metro.getAllStations();
   
   
   int newLength = Metro.deleteStationName("Nagasandra");
   System.out.println("Calling getAllStationNamesPostDeletion");
   Metro.getAllStationNamesPostDeletion(newLength);
   
 
 }



}