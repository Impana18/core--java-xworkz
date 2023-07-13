class  Stationary{
static int index=0;
static String stationaryItems[]={null,null,null,null,null,null,null,null};
public  static boolean addStationaryItems(String itemName){
System.out.println("Invoking addStationaryItems");
System.out.println("NO of parameters :1,type  of parameter :String");
boolean isAdded=false;
if(itemName!=null){
if(index<stationaryItems.length){
stationaryItems[index++]=itemName;
isAdded=true;
}else{
System.out.println("oh...Elli jaaga kaali agide");
}
}else{
System.out.println("itemName cannot be null");
}

return isAdded;
}

public static void getAllStationaryItems(){
	System.out.println("List of Stationary Are:");
for(String itemName : stationaryItems){
	System.out.println(itemName);	
	
}	
	
}
public static boolean editStationaryItemName(String updatedItemName, String existingItemName){
System.out.println("Invoking editStationaryItemName");
System.out.println("no of parameter : 2, type of parameter:String ,String");
boolean isUpdated=false;
for(int itemIndex=0;itemIndex<stationaryItems.length;itemIndex++){
	if(stationaryItems[itemIndex].equals(existingItemName)){
	stationaryItems[itemIndex]=updatedItemName;
		isUpdated=true;
	}
}	
	
return isUpdated;	
	
}
public static int deletestationaryItemsName(String deleteItemName){
	System.out.println("Invoking deletestationaryItemsName");
	System.out.println("no of parameter : 2, type of parameter:String ,String");
boolean isDeleted=false;
int itemIndex;
int noOfElements=stationaryItems.length;
for(itemIndex=0;itemIndex<stationaryItems.length;itemIndex++){
	if(stationaryItems[itemIndex].equals(deleteItemName)){
	break;
	}
}	
	
if(itemIndex<noOfElements){
noOfElements=noOfElements-1;
for(int newItemIndex=itemIndex;newItemIndex<noOfElements;newItemIndex++){
	stationaryItems[newItemIndex]=stationaryItems[newItemIndex+1];
}
}
return noOfElements;	
	
	
}	
public static void  getAllStationaryItemsPostDeletion(int newLength){
	for(int itemIndex=0; itemIndex<newLength;itemIndex++){
	System.out.println(stationaryItems[itemIndex]);	
		
	}
	
}	
	
	
}	
	