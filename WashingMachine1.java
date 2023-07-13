class WashingMachine1{
 static String name="samsung";
 static  int lowRotation;
 static int mediumRotation ;
 static  int highRotation=4;
 static boolean isConnected;
    
  //method
   public static boolean onOrOff(){
    System.out.println("Invoking onOrOff()");
	 System.out.println("Parameter" + 0);
	 if(isConnected==false){
	   isConnected = true;
	     System.out.println(" WashingMachine is turned onn..Enjoyy");
	 }else if(isConnected==true){
		 isConnected=false;
		 System.out.println(" WashingMachine is turned off..");
	 }
	 return isConnected;
	}
        		//increaseRotation
		public static void increaseRotation(){
			System.out.println("start of increaseRotation");
			if(isConnected==true){
				if(mediumRotation<highRotation){
				mediumRotation= mediumRotation+1;
				System.out.println("The current Rotation is "+ mediumRotation);
			}
			else{ 
				System.out.println("Max Rotation reached");
			}	
			}else{
				System.out.println("Hyee..... WashingMachine on madu");
				
			}
			
		}
			
			
		
		//decreaseTemp
		public static void decreaseRotation(){
			System.out.println("start of decreaseRotation");
			if(isConnected=true){
				if(mediumRotation>lowRotation){
					mediumRotation=mediumRotation-1;
					System.out.println("The current Rotation is "+ mediumRotation);
			}
			else{
				System.out.println("low Rotation reached");
			}
			}else{
				System.out.println("WashingMachine is turned off....cannot decrease Rotation");
				
			}
			
			//logic
		}
		}
