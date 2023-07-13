class SimCard{
static String simNames[]={null,null,null,null,null};
static int index;
public static boolean addSim(String sim){
boolean isAdded = false;
if(sim!=null){
simNames[index]=sim;
index++; 
isAdded = true;

}else{
System.out.println("cannot added sim,as it is a null value");

}
return isAdded;
}

   public static void fetchSimNames(){
   System.out.println("Invoking fetchSimNames");

 for(int sim=0;sim<simNames.length;sim++){
String reference =simNames[sim];
System.out.println("Accessing sim " + reference +  " at " +  sim );



}
System.out.println("end of fetchSimName ");
}

    public static boolean updateSimName(String existingSimName , String updateSimName){
	  boolean isUpdated=false;
	  for(int simIndex=0; simIndex < simNames.length; simIndex++){
		  if(simNames[simIndex].equals(existingSimName)){
			  simNames[simIndex] = updateSimName;
			  isUpdated= true;
		  }
	  }
	  return isUpdated;
  }
public static int deleteSimName(String  deleteSimName){
	  System.out.println("Invoking  deleteSimName");
	  System.out.println("No pf parameter :1 , tpe of parameter : String ");
	  boolean isDeleted =false;
	  int simIndex;
	  int noOfElements=simNames.length;
	  for(simIndex =0; simIndex < simNames.length; simIndex++){
		  if(simNames[simIndex].equals(deleteSimName)){
			 break;
		  }

	  }
	  
	  if(simIndex < noOfElements){
		  noOfElements = noOfElements-1;
   for( int newSimIndex = simIndex ; newSimIndex < noOfElements ; newSimIndex++){
	    simNames[newSimIndex] = simNames[newSimIndex+1];
		
   }
	  }
	  
	  return noOfElements;
  }

   public static void getAllSimNamesPostDeletion(int newLength){
	   for(int simIndex =0;simIndex < newLength ; simIndex++){
		   System.out.println(simNames[simIndex]);
		   
	   }
   }

}