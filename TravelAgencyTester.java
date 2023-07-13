class TravelAgencyTester{
  public static void main(String famousPlaces[]){
  
  TravelAgency.createTouristPlaces("Kashmir");
  TravelAgency.createTouristPlaces("Manali");
  TravelAgency.createTouristPlaces("Waynad");
  TravelAgency.createTouristPlaces("kerala");
  TravelAgency.createTouristPlaces("Hampi");
  TravelAgency.createTouristPlaces("Aagra");
  TravelAgency.createTouristPlaces("Shiradi");
  TravelAgency.createTouristPlaces("Goa");
  
  TravelAgency.getAllFamousPlaces();
  boolean isUpdated = TravelAgency.updateTouristPlace("kerala","Ooty");
   System.out.println("Is Tourist Place name updated "+ isUpdated);
   TravelAgency.getAllFamousPlaces();
   
   int newLength = TravelAgency.deleteTouristPlace("Aagra");
   System.out.println("Calling getAllTouristPlaceDeletion");
   TravelAgency.getAllTouristPlaceDeletion(newLength);
   
   
  }
}