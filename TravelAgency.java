class TravelAgency{

static String touristPlaces[]= {null , null , null , null , null , null , null, null};
static int index;

public static boolean createTouristPlaces(String famousPlaces){
  boolean isCreate =false;
  if(famousPlaces!= null){
  touristPlaces[index]= famousPlaces;
  index++;
  isCreate= true;
  }else{
  
  System.out.println("can not create famousPlaces as it is a null");
  
  }
  return isCreate;

}

public static void getAllFamousPlaces(){
System.out.println("Invoking getAllFamousPlaces ");


for(int famousPlaces=0;famousPlaces<touristPlaces.length;famousPlaces++){
String reference=touristPlaces[famousPlaces];
System.out.println("Accessing famousPlaces  "+ reference + "  at  "+ famousPlaces);
}
System.out.println("end of getAllFamousPlaces ");
}

     public static boolean updateTouristPlace(String existingTouristPlace , String updateTouristPlace){
	  boolean isUpdated=false;
	  for(int touristPlaceIndex=0; touristPlaceIndex < touristPlaces.length; touristPlaceIndex++){
		  if(touristPlaces[touristPlaceIndex].equals(existingTouristPlace)){
			  touristPlaces[touristPlaceIndex] = updateTouristPlace;
			  isUpdated= true;
		  }
	  }
	  return isUpdated;
	 
  }

  public static int deleteTouristPlace(String  deleteTouristPlace){
	  System.out.println("Invoking  deleteTouristPlace");
	  System.out.println("No pf parameter :1 , tpe of parameter : String ");
	  boolean isDeleted =false;
	  int touristPlaceIndex;
	  int noOfElements=touristPlaces.length;
	  for(touristPlaceIndex =0; touristPlaceIndex < touristPlaces.length; touristPlaceIndex++){
		  if(touristPlaces[touristPlaceIndex].equals(deleteTouristPlace)){
			 break;
		  }

	  }
	  
	  if(touristPlaceIndex < noOfElements){
		  noOfElements = noOfElements-1;
   for( int newTouristPlaceIndex = touristPlaceIndex ; newTouristPlaceIndex < noOfElements ; newTouristPlaceIndex++){
	    touristPlaces[newTouristPlaceIndex] = touristPlaces[newTouristPlaceIndex+1];
		
   }
	  }
	  
	  return noOfElements;
  }

   public static void getAllTouristPlaceDeletion(int newLength){
	   for(int touristPlaceIndex =0;touristPlaceIndex < newLength ; touristPlaceIndex++){
		   System.out.println(touristPlaces[touristPlaceIndex]);
		   
	   }
   }
}