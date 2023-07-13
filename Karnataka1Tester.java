class Karnataka1Tester{
public static void main(String city[]){
   Karnataka.addCity("Bangalore");
   Karnataka.addCity("Davanagere");
   Karnataka.addCity("Hassan");
   Karnataka.addCity("Chikkamagaluru");
   Karnataka.addCity("Hubballi");
   Karnataka.addCity("Chamarajanagar");
   Karnataka.addCity("Belagavi");
   
   Karnataka.fetchCityAvailable();
    boolean isUpdated = Karnataka.updateCityName("Hassan","Simhasanapuri");
   System.out.println("Is city name updated "+ isUpdated);
   Karnataka.fetchCityAvailable();
   
   int newLength = Karnataka.deleteCityName("Chamarajanagar");
   System.out.println("Calling getAllCityNamesPostDeletion");
   Karnataka.getAllCityNamesPostDeletion(newLength);
   
   
}

}