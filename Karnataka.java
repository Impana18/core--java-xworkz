class Karnataka{
 
 static String cityNames[] = {null, null, null, null , null , null, null};
 static int index;
 
  public static boolean addCity(String city){
	  boolean isAdded = false;
	  if(city!= null){
		  cityNames[index]=city;
		  index++;
		  isAdded = true;
		  
	  }else{
		  System.out.println("can not add city as its null value");
	  }
	  return isAdded;
  }

public static void fetchCityAvailable(){
	System.out.println("Invoking fetchCityAvailable  ");
	
	for(int city=0;city<cityNames.length;city++){
		String reference = cityNames[city];
		System.out.println("Accessing city "+ reference + " at "+ city);
	}
	System.out.println("end of fetchCityAvailable");
}

  public static boolean updateCityName(String existingCityName , String updateCityName){
	  boolean isUpdated=false;
	  for(int cityIndex=0; cityIndex < cityNames.length; cityIndex++){
		  if(cityNames[cityIndex].equals(existingCityName)){
			  cityNames[cityIndex] = updateCityName;
			  isUpdated= true;
		  }
	  }
	  return isUpdated;
  }

  public static int deleteCityName(String  deleteCityName){
	  System.out.println("Invoking  deleteCityName");
	  System.out.println("No pf parameter :1 , tpe of parameter : String ");
	  boolean isDeleted =false;
	  int cityIndex;
	  int noOfElements=cityNames.length;
	  for(cityIndex =0; cityIndex < cityNames.length; cityIndex++){
		  if(cityNames[cityIndex].equals(deleteCityName)){
			 break;
		  }

	  }
	  
	  if(cityIndex < noOfElements){
		  noOfElements = noOfElements-1;
   for( int newcityIndex = cityIndex ; newcityIndex < noOfElements ; newcityIndex++){
	    cityNames[newcityIndex] = cityNames[newcityIndex+1];
		
   }
	  }
	  
	  return noOfElements;
  }

   public static void getAllCityNamesPostDeletion(int newLength){
	   for(int cityIndex =0;cityIndex < newLength ; cityIndex++){
		   System.out.println(cityNames[cityIndex]);
		   
	   }
   }
  
}