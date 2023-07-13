class SuperMarket{
      static String vegetables[] = {"Potato","Carrot","Beans","Brinjal","Onion"};
		static String biscuits[]= {"Gimjam","oreo","Fab","Hide and seek","parlege","Tiger","Mare", "Bounce","Good day","Burbon"};
        static String perfumes[]={ "fogg","fogg","Bella vita","Wild stone Ultra","villain perfumne","denver","calvin klein","Davidoff ","Villain","Beardo"};
        static String groceries[]={ "salt","suger","cooking oil","Honey", "red Meat","Vineger","Hair oil","Pulses","Cheese","yogurt"};
	  
	   
	  //Biscuits -10
	  //Perfumes -10
	  ///groceries - 10
	  public static void main(String market[]){
		  System.out.println("Main Started");
		  System.out.println("==============================================================================================================");
		  System.out.println("List of vegetables are:");
		  getvegetables();
		  System.out.println("==============================================================================================================");
		  System.out.println("List of biscuits are:");
		  getbiscuits();
		  System.out.println("==============================================================================================================");
		  System.out.println("List of perfumes are:");
		  getperfumes();
		  System.out.println("==============================================================================================================");
		  System.out.println("List of groceries are:");
		  getgroceries();
		  System.out.println("==============================================================================================================");
		  System.out.println("main ended");
	  }
	  //for
	  public static void getvegetables(){
		  System.out.println(" Inside getvegetables");
		  for(String vegetable:vegetables){
			  System.out.println(vegetable);
		  }
	  }
		  
		  
		  
		  

	  
		  public static void getbiscuits(){
		  System.out.println(" Inside getbiscuits");
		  for(String biscuit:biscuits){
			  System.out.println(biscuit);
		  }
	  }
		  
		  
		  
		
		  
		  public static void getperfumes(){
		  System.out.println(" Inside getperfumes");
		  for(String perfume : perfumes){
			  System.out.println(perfume);
		  }
	  }
		  
		  
		  
		  
		  
		  
		  

		  
		  public static void getgroceries(){
		  System.out.println(" Inside getgroceries ");
		  for(String grocerie : groceries){
			  System.out.println(grocerie);
		  }
	  }
		  
		   }







