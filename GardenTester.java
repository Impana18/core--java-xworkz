class GardenTester{
public static void main(String garden[]){
Garden.addFlower("Rose");
Garden.addFlower("Iris");
Garden.addFlower("Lotus");
Garden.addFlower("Jasmine");
Garden.fetchflowerNames();
boolean isUpdate=Garden.updateFlowerName("Jasmine", "jasmine sambac");
System.out.println("Is flower name updated" + isUpdate);
Garden.fetchflowerNames();


int newlength = Garden.deleteFlowerName("Lotus");
System.out.println("calling getAllflowerNamesPostDeletion");
Garden.getAllflowerNamesPostDeletion(newlength);
}



}