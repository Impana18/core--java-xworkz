 class ToysTester {
    
	public static void main(String[] args) {
        Toys toy1 = new Toys();
        toy1.name = "Action Figure";
        toy1.type = "Action Figure";
        toy1.price = 29;
        toy1.color = "Red";
		toy1.safe = "yes";
        System.out.println(toy1.name + ", "+ toy1.type + ", "+ toy1.price + ", "+ toy1.color + ", "+ toy1.safe);
		toy1.play();

        Toys toy2 = new Toys();
        toy2.name = "LEGO Set";
        toy2.type = "Building Blocks";
        toy2.price = 49;
        toy2.color = "Multi-color";
		toy2.safe = "yes";
		System.out.println(toy2.name + ", "+ toy2.type + ", "+ toy2.price + ", "+ toy2.color + ", "+ toy2.safe);
        toy2.play();

        Toys toy3 = new Toys();
        toy3.name = "Doll";
        toy3.type = "Fashion Doll";
        toy3.price = 19;
        toy3.color = "Pink";
        
        toy3.play();

        Toys toy4 = new Toys();
        toy4.name = "Board Game";
        toy4.type = "Strategy Game";
        toy4.price = 24;
        toy4.color = "Multi-color";
		toy4.safe = "yes";
		System.out.println(toy4.name + ", "+ toy4.type + ", "+ toy4.price + ", "+ toy4.color + ", "+ toy4.safe);
        toy4.play();

        Toys toy5 = new Toys();
        toy5.name = "Remote Control Car";
        toy5.type = "RC Car";
        toy5.price = 39;
        toy5.color = "Blue";
        toy5.safe = "yes";
		System.out.println(toy5.name + ", "+ toy5.type + ", "+ toy5.price + ", "+ toy5.color + ", "+ toy5.safe);
        toy5.play();

        Toys toy6 = new Toys();
        toy6.name = "Puzzle";
        toy6.type = "Jigsaw Puzzle";
        toy6.price = 14;
        toy6.color = "Multi-color";
		toy6.safe = "yes";
		System.out.println(toy6.name + ", "+ toy6.type + ", "+ toy6.price + ", "+ toy6.color + ", "+ toy6.safe);
        toy6.play();

        Toys toy7 = new Toys();
        toy7.name = "Stuffed Animal";
        toy7.type = "Plush Toy";
        toy7.price = 9;
        toy7.color = "Brown";
        toy7.safe = "yes";
		System.out.println(toy7.name + ", "+ toy7.type + ", "+ toy7.price + ", "+ toy7.color + ", "+ toy7.safe);
        toy7.play();

        Toys toy8 = new Toys();
        toy8.name = "Art Set";
        toy8.type = "Drawing Kit";
        toy8.price = 19;
        toy8.color = "Multi-color";
		toy8.safe = "yes";
		System.out.println(toy8.name + ", "+ toy8.type + ", "+ toy8.price + ", "+ toy8.color + ", "+ toy8.safe);
        toy8.play();

        Toys toy9 = new Toys();
        toy9.name = "RC Drone";
        toy9.type = "Quadcopter";
        toy9.price = 79;
        toy9.color = "Black";
		toy9.safe = "yes";
		System.out.println(toy9.name + ", "+ toy9.type + ", "+ toy9.price + ", "+ toy9.color + ", "+ toy9.safe);
        toy9.play();

        Toys toy10 = new Toys();
        toy10.name = "Building Set";
        toy10.type = "Construction Toy";
        toy10.price = 34;
        toy10.color = "Yellow";
        toy10.safe = "yes";
		System.out.println(toy10.name + ", "+ toy10.type + ", "+ toy10.price + ", "+ toy10.color + ", "+ toy10.safe);
        toy10.play();
    }
}