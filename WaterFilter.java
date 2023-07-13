class WaterFilter{
	
    static String brandName ;
    static int price ;
    static String color ;
	static String material ;
	static String capacity;
	static String specialFeature ;
	static String warranty ;
	static String typeOfWater;

  public static void main(String filter[]){
  
     brandName = "Aquaguard";
     price = 50000;
      color = "White";
	 material = "Plastic";
	  capacity = "7 lts";
	 specialFeature = "UV, UF, RO";
	 warranty = "1 year";
	 typeOfWater = "borewell, municipal water";
	 
	  System.out.println("The brandName is "+ brandName);
      System.out.println("The price is "+ price);
      System.out.println("The color is "+ color);
	  System.out.println("The material is "+ material);
	  System.out.println("The capacity is "+ capacity);
	  System.out.println("The specialFeature is "+ specialFeature);
	  System.out.println("The warranty is "+ warranty);
	  System.out.println("The typeOfWater is "+ typeOfWater);
   
  }
}