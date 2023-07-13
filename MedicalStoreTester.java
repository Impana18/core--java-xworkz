class MedicalStoreTester{
public static void main(String medicine[]){

   MedicalStore.saveMedicine("Ivermerctin");
   MedicalStore.saveMedicine("Cefuroxime");
   MedicalStore.saveMedicine("Amikacin");
   MedicalStore.saveMedicine("Bedaquiline");
   MedicalStore.saveMedicine("Delamanid");
   MedicalStore.saveMedicine("Itraaconazole");
   MedicalStore.saveMedicine("Mupirocine");
   MedicalStore.saveMedicine("Terbinafine");
   MedicalStore.saveMedicine("Daclatasvir");
   
   MedicalStore.getAllMedicine();
   
    boolean isUpdated = MedicalStore.updateMedicineName("Cefuroxime","Dolo-650");
   System.out.println("Is Medicine name updated "+ isUpdated);
   
    MedicalStore.getAllMedicine();
	
	int newLength = MedicalStore.deleteMedicineName("Bedaquiline");
   System.out.println("Calling getAllMedicineNamesPostDeletion");
   MedicalStore.getAllMedicineNamesPostDeletion(newLength);
}
}