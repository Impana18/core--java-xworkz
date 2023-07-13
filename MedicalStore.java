class MedicalStore{

static String medicineNames[]={null , null , null , null , null , null , null , null , null};
static int index;

public static boolean saveMedicine(String medicine){
  boolean isSave = false;
  if(medicine != null){
   medicineNames[index]=medicine;
   index++;
   isSave=true;
  }else{
  
  
  System.out.println("can not medicine as it is a null value");
  
}
 
return isSave;
}

public static void getAllMedicine(){
	System.out.println("Invoking getAllMedicine ");
	
	for(int medicine=0;medicine<medicineNames.length;medicine++){
		String reference= medicineNames[medicine];
		System.out.println("Accessing medicine "+ reference + "  at "+ medicine);
	}
	System.out.println("end of getAllMedicine ");
}


     public static boolean updateMedicineName(String existingMedicineName , String updateMedicineName){
	  boolean isUpdated=false;
	  for(int medicineNameIndex=0; medicineNameIndex < medicineNames.length; medicineNameIndex++){
		  if(medicineNames[medicineNameIndex].equals(existingMedicineName)){
			  medicineNames[medicineNameIndex] = updateMedicineName;
			  isUpdated= true;
		  }
	  }
	  return isUpdated;
  }

public static int deleteMedicineName(String  deleteMedicineName){
	  System.out.println("Invoking  deleteMedicineName");
	  System.out.println("No pf parameter :1 , tpe of parameter : String ");
	  boolean isDeleted =false;
	  int medicineNameIndex;
	  int noOfElements=medicineNames.length;
	  for(medicineNameIndex =0; medicineNameIndex < medicineNames.length; medicineNameIndex++){
		  if(medicineNames[medicineNameIndex].equals(deleteMedicineName)){
			 break;
		  }

	  }
	  
	  if(medicineNameIndex < noOfElements){
		  noOfElements = noOfElements-1;
   for( int newMedicineNameIndex = medicineNameIndex ; newMedicineNameIndex < noOfElements ; newMedicineNameIndex++){
	    medicineNames[newMedicineNameIndex] = medicineNames[newMedicineNameIndex+1];
		
   }
	  }
	  
	  return noOfElements;
  }

   public static void getAllMedicineNamesPostDeletion(int newLength){
	   for(int medicineNameIndex =0;medicineNameIndex < newLength ; medicineNameIndex++){
		   System.out.println(medicineNames[medicineNameIndex]);
		   
	   }
   }

}