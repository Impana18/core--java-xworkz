class Ac{
 static String name="samsung";
 static  int minTemp;
 static int currentTemp;
 static  int maxTemp=7;
 static boolean isConnected;
    
  //method
   public static boolean onOrOff(){
    System.out.println("Invoking onOrOff()");
	 System.out.println("Parameter" + 0);
	 if(isConnected==false){
	   isConnected = true;
	     System.out.println("Ac is turned onn..Enjoyy");
	 }else if(isConnected==true){
		 isConnected=false;
		 System.out.println("Acis turned off..");
	 }
	 return isConnected;
	}
        		//increaseVolume
		public static void increaseTemp(){
			System.out.println("start of increaseTemp");
			if(isConnected==true){
				if(currentTemp<maxTemp){
				currentTemp= currentTemp+1;
				System.out.println("The current Temp is "+ currentTemp);
			}
			else{ 
				System.out.println("Max Temp reached");
			}	
			}else{
				System.out.println("Gubee.....Ac on madu");
				
			}
			System.out.println("End of increase Temp");	
		}
			
			
		
		//decreaseTemp
		public static void decreaseTemp(){
			System.out.println("start of decreaseTemp");
			if(isConnected=true){
				if(currentTemp>minTemp){
					currentTemp=currentTemp-1;
					System.out.println("The current Temp is "+ currentTemp);
			}
			else{
				System.out.println("Min Temp reached");
			}
			}else{
				System.out.println("Ac is turned off....cannot decrease Temp");
				
			}
			System.out.println("end of decrease Temp");	
			
			//logic
		}
		}
