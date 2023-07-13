class SpeakerA{
 static String name="JBL";
 static  int minVolume;
 static int currentVolume;
 static  int maxVolume=7;
 static boolean isConnected;
    
  //method
   public static boolean onOrOff(){
    System.out.println("Invoking onOrOff()");
	 System.out.println("Parameter" + 0);
	 if(isConnected==false){
	   isConnected = true;
	     System.out.println("Speaker is turned onn..Enjoyy");
	 }else if(isConnected==true){
		 isConnected=false;
		 System.out.println("Speaker is turned off..");
	 }
	 return isConnected;
	}
        		//increaseVolume
		public static void increaseVolume(){
			System.out.println("start of increaseVolume");
			if(isConnected==true){
				if(currentVolume < maxVolume){
				currentVolume= currentVolume+1;
				System.out.println("The current Volume is "+ currentVolume);
			}
			else{ 
				System.out.println("Max Volume reached");
			}	
			}else{
				System.out.println("Gubee.....Speaker Connect madu");
				
			}
			System.out.println("End of increase volume");	
		}
			
			
		
		//decreaseVolume
		public static void decreaseVolume(){
			System.out.println("start of decreaseVolume");
			if(isConnected==true){
				if(currentVolume>minVolume){
					currentVolume=currentVolume-1;
					System.out.println("The current Volume is "+ currentVolume);
			}
			else{
				System.out.println("Min Volume reached");
			}
			}else{
				System.out.println("speaker is turned off....cannot decrease volume");
				
			}
			System.out.println("end of decrese volume");	
			
			//logic
		}
		}

