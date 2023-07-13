class Garden{
static String flowerNames[]={null,null,null,null};
static int index;
public static boolean addFlower(String flower){
boolean isAdded = false;
if(flower!=null){
flowerNames[index]=flower;
index++; 
isAdded = true;

}else{
System.out.println("cannot added flower,as it is a null value");

}
return isAdded;
}
public static void fetchflowerNames(){
System.out.println("Invoking fetchflowerNames ");

 for(int flower=0;flower<flowerNames.length;flower++){
String reference =flowerNames[flower];
System.out.println("Accessing flower " + reference +  " at " +  flower );



}
System.out.println("end of fetchflowerNames ");
}
public static boolean updateFlowerName(String existingFlowerName , String updateFlowerName){
	  boolean isUpdated=false;
	  for(int flowerNameIndex=0; flowerNameIndex < flowerNames.length; flowerNameIndex++){
		  if(flowerNames[flowerNameIndex].equals(existingFlowerName)){
			  flowerNames[flowerNameIndex] = updateFlowerName;
			  isUpdated= true;
		  }
	  }
	  return isUpdated;
  }
  
  public static int deleteFlowerName(String deleteFlowerName){
	System.out.println("Invoking deleteflowerName");
	System.out.println("no of parameter : 2, type of parameter:String ,String");
boolean isDeleted=false;
int flowerIndex;
int noOfElements=flowerNames.length;
for(flowerIndex=0;flowerIndex<flowerNames.length;flowerIndex++){
	if(flowerNames[flowerIndex].equals(deleteFlowerName)){
	break;
	}
}	
	
if(flowerIndex<noOfElements){
noOfElements=noOfElements-1;
for(int newflowerIndex=flowerIndex;newflowerIndex<noOfElements;newflowerIndex++){
	flowerNames[newflowerIndex]=flowerNames[newflowerIndex+1];
}
}
return noOfElements;	
	
	
}	
public static void  getAllflowerNamesPostDeletion(int newLength){
	for(int flowerIndex=0; flowerIndex<newLength;flowerIndex++){
	System.out.println(flowerNames[flowerIndex]);	
		
	}
	
}	
	
	
}	
	