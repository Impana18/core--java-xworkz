class IceCream{
static String flavors[]={null,null,null,null,null,null,null};
static int index;
public static boolean saveFlavors(String flavor){
boolean isSave = false;
if(flavor!=null){
flavors[index]=flavor;
index++; 
isSave = true;

}else{
System.out.println("cannot save flavors,as it is a null value");

}
return isSave;
}
public static void fetchFlavors(){
System.out.println("Invoking fetchFlavors  ");

 for(int flavor =0;flavor<flavors.length;flavor++){
String reference =flavors[flavor];
System.out.println("Accessing flavor" + reference +  " at " +  flavor );



}
System.out.println("end of fetchFlavors ");
}
public static boolean updateFlavor(String existingFlavor , String updateFlavor){
	  boolean isUpdated=false;
	  for(int flavorIndex=0; flavorIndex < flavors.length; flavorIndex++){
		  if(flavors[flavorIndex].equals(existingFlavor)){
			  flavors[flavorIndex] = updateFlavor;
			  isUpdated= true;
		  }
	  }
	  return isUpdated;
  }
  
  
  
  
  public static int deleteFlavour(String deleteFlavour){
	  System.out.println("Invoking deleteFlavour");
	  System.out.println("No of parameter :1,type of parameter:String");
	  boolean isDeleted=false;
	  int flavorIndex;
	  int noOfElements=flavors.length;
	  for(flavorIndex=0;flavorIndex<flavors.length;flavorIndex++){
	  if(flavors[flavorIndex].equals(deleteFlavour)){
		  break;
		  
	  }
	  
	  
  }
  
  if(flavorIndex<noOfElements){
	  noOfElements=noOfElements-1;
	  for(int newFlavorIndex=flavorIndex; newFlavorIndex<noOfElements;newFlavorIndex++){
		 flavors[newFlavorIndex]=flavors[newFlavorIndex+1];		 
		  
		  
	  }
	  
	   
  }
  return noOfElements;
}
public static void getAllFlavorsPostDeletion(int newLength){
	
	for(int flavorIndex=0;flavorIndex<newLength;flavorIndex++){
		System.out.println(flavors[flavorIndex]);
	}
}
 } 
  
  