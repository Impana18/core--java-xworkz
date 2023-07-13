class IceCreamTester{
public static void main(String ice[]){
IceCream.saveFlavors("venilla");
IceCream.saveFlavors("chocolate");
IceCream.saveFlavors("straberry");
IceCream.saveFlavors("butterscotch");
IceCream.saveFlavors("Teaberry");
IceCream.saveFlavors("Butter pecan");
IceCream.saveFlavors("eggno");
IceCream.fetchFlavors();


int newLength=IceCream.deleteFlavour("venilla");
System.out.println("getAllFlavorsPostDeletion");
IceCream.getAllFlavorsPostDeletion(newLength);


}




}