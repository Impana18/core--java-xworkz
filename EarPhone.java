class EarPhone{
	
	
	
	static String brandName = "Boat";
     static int price = 1200;
    static String color = "White";
     static boolean isVolumeButtonAvailable = true;
	 static String warranty = "1 yr";
	static String headPhonesJack = "3.5mm";
	static String noiseControl = "Sound isolation";

  public static void main(String earphone[]){
  
      brandName = "MI";
      price = 1300;
      color = "Black";
      isVolumeButtonAvailable = false;
	  warranty = "1 yr";
	 headPhonesJack = "3.5mm";
	 noiseControl = "Sound isolation";
	  
	  System.out.println("The brandName is "+ brandName);
      System.out.println("The price is "+ price);
      System.out.println("The color is "+ color);
      System.out.println("Is volume button available "+ isVolumeButtonAvailable);
	  System.out.println("The warranty is "+ warranty);
	  System.out.println("The headPhonesJack is "+ headPhonesJack);
	  System.out.println("The noiseControl is "+ noiseControl);
     	 
  }
}