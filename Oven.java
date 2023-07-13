class Oven{
 static String name="philips";
 static  int lowDegree;
 static int mediumDegree ;
 static  int highDegree=4;
 static boolean isConnected;
    
  //method
   public static boolean onOrOff(){
    System.out.println("Invoking onOrOff()");
	 System.out.println("Parameter" + 0);
	 if(isConnected==false){
	   isConnected = true;
	     System.out.println("oven is turned onn..Enjoyy");
	 }else if(isConnected==true){
		 isConnected=false;
		 System.out.println(" oven is turned off..");
	 }
	 return isConnected;
	}
        		//increaseDegree
		public static void increaseDegree(){
			System.out.println("start of increaseDegree");
			if(isConnected=true){
				if(mediumDegree<highDegree){
				mediumDegree= mediumDegree+1;
				System.out.println("The current degree is "+ mediumDegree);
			}
			else{ 
				System.out.println("Max degree reached");
			}	
			}else{
				System.out.println("Hyee..... oven on madu");
				
			}
			
		}
			
			
		
		//decreaseTemp
		public static void decreaseDegree(){
			System.out.println("start of decreaseDegree");
			if(isConnected=true){
				if(mediumDegree>lowDegree){
					mediumDegree=mediumDegree-1;
					System.out.println("The current degree is "+ mediumDegree);
			}
			else{
				System.out.println("low degree reached");
			}
			}else{
				System.out.println("oven is turned off....cannot decrease degree");
				
			}
			
			//logic
		}
		}
