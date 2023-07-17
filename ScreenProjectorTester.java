class ScreenProjectorTester{

  public static void main(String projector[]){
   
	  System.out.println("Creating first copy of projector");
	  ScreenProjector projector1 = new ScreenProjector();
	  projector1.brand = "E Gate";
	  projector1.warranty = "1 year";
	  projector1.price = 4000;
	  projector1.color = "navy blue";
	  projector1.toDisplayOnScreen();
	  System.out.println(projector1.brand + " " + projector1.warranty + " " + projector1.price + " " + projector1.color);
	  
	  System.out.println("Creating second copy of projector");
	  ScreenProjector projector2 = new ScreenProjector();
	  projector2.brand = "Luminous";
	  projector2.warranty = "2 years";
	  projector2.price = 14000;
	  projector2.color = "dark blue";
	  projector2.toDisplayOnScreen();
	  System.out.println(projector2.brand + " " + projector2.warranty + " " + projector2.price + " " + projector2.color);
	  
	  System.out.println("Creating third copy of projector");
	  ScreenProjector projector3 = new ScreenProjector();
	  projector3.brand = "Philips";
	  projector3.warranty = "4 years";
	  projector3.price = 8000;
	  projector3.color = "maroon";
	  projector3.toDisplayOnScreen();
	  System.out.println(projector3.brand + " " + projector3.warranty + " " + projector3.price + " " + projector3.color);
	  
	  System.out.println("Creating fourth copy of projector");
	  ScreenProjector projector4 = new ScreenProjector();
	  projector4.brand = "Samsung";
	  projector4.warranty = "1 year";
	  projector4.price = 6000;
	  projector4.color = "violet";
	  projector4.toDisplayOnScreen();
	  System.out.println(projector4.brand + " " + projector4.warranty + " " + projector4.price + " " + projector4.color);
	  
	  System.out.println("Creating fifth copy of projector");
	  ScreenProjector projector5 = new ScreenProjector();
	  projector5.brand = "LG";
	  projector5.warranty = "1/2 year";
	  projector5.price = 3000;
	  projector5.color = "purple";
	  projector5.toDisplayOnScreen();
	  System.out.println(projector5.brand + " " + projector5.warranty + " " + projector5.price + " " + projector5.color);
	  
	  System.out.println("Creating sixth copy of projector");
	  ScreenProjector projector6 = new ScreenProjector();
	  projector6.brand = "Wipro";
	  projector6.warranty = "5 years";
	  projector6.price = 14000;
	  projector6.color = "black";
	  projector6.toDisplayOnScreen();
	  System.out.println(projector6.brand + " " + projector6.warranty + " " + projector6.price + " " + projector6.color);
	  
	  System.out.println("Creating seventh copy of projector");
	  ScreenProjector projector7 = new ScreenProjector();
	  projector7.brand = "Bosch";
	  projector7.warranty = "4 years";
	  projector7.price = 10000;
	  projector7.color = "dark brown";
	  projector7.toDisplayOnScreen();
	  System.out.println(projector7.brand + " " + projector7.warranty + " " + projector7.price + " " + projector7.color);
	  
	  System.out.println("Creating eighth copy of projector");
	  ScreenProjector projector8 = new ScreenProjector();
	  projector8.brand = "Whirlpool";
	  projector8.warranty = "1 year";
	  projector8.price = 5500;
	  projector8.color = "grey";
	  projector8.toDisplayOnScreen();
	  System.out.println(projector8.brand + " " + projector8.warranty + " " + projector8.price + " " + projector8.color);
	  
	  System.out.println("Creating ninth copy of projector");
	  ScreenProjector projector9 = new ScreenProjector();
	  projector9.brand = "Epson";
	  projector9.warranty = "9 years";
	  projector9.price = 80000;
	  projector9.color = "dark pink";
	  projector9.toDisplayOnScreen();
	  System.out.println(projector9.brand + " " + projector9.warranty + " " + projector9.price + " " + projector9.color);
	  
	  System.out.println("Creating tenth copy of projector");
	  ScreenProjector projector10 = new ScreenProjector();
	  projector10.brand = "Gate";
	  projector10.warranty = "7 years";
	  projector10.price = 40000;
	  projector10.color = "red";
	  projector10.toDisplayOnScreen();
	  System.out.println(projector10.brand + " " + projector10.warranty + " " + projector10.price + " " + projector10.color);
}
}