class ChairTester{

public static void main(String s[]){
//object creation in java
//ClassName referenceVariable=new ClassName();
Chair chair =new Chair();
chair.name= "Nirmala";
chair.type= "plastic";
chair.color= "Black";
chair.price= 350.00;
chair.toSit();
System.out.println(chair.name+ "  "+chair.type+ "    "+ chair.color+ "  "+ chair.price );

Chair chair1 =new Chair();
chair1.name= "Nirmala";
chair1.type= "Steel";
chair1.color= "white";
chair1.price= 900.00;
chair1.toSit();
System.out.println(chair1.name+ "  "+chair1.type+ "    "+ chair1.color+ "  "+ chair1.price );



}

}