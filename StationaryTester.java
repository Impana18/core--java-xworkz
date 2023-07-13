class StationaryTester{
public static void main(String tester[]){
Stationary.addStationaryItems("Books");
Stationary.addStationaryItems("Pencil");
Stationary.addStationaryItems("Pen");
Stationary.addStationaryItems("Eraser");
Stationary.addStationaryItems("Sketch pen");
Stationary.addStationaryItems("Ink pen");
Stationary.addStationaryItems("Geometry box");
Stationary.addStationaryItems("calculator");
//Read ,get,fetch 
Stationary.getAllStationaryItems();
//update, edit
Stationary.editStationaryItemName("cardBoard sheets", "Eraser");
Stationary.getAllStationaryItems();
int newLength=Stationary.deletestationaryItemsName("Pen");
System.out.println("calling getAllStationaryItemsPostDeletion");
Stationary.getAllStationaryItemsPostDeletion(newLength);



}

}                               