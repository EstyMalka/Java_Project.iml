import java.util.ArrayList;

public class Inventory {
    //ArrayList the medicine
    private ArrayList <Medicine> myMedicineList=new ArrayList<Medicine>();

    // functions
    // add the new medicine to the inventory
    public Medicine addMedicine(Medicine medicineN)throws MedicineAlreadyExistException{
        for (Medicine medicineName2:myMedicineList) {
            if (medicineN.getMedicineName().equals (medicineName2.getMedicineName()))
                throw new MedicineAlreadyExistException(medicineN.getMedicineName());
        }
        myMedicineList.add(medicineN);
        return medicineN;
    }

    //function print for addMedicine function
    public void printAllMedicine(){
        System.out.println("All medicine in stock:");
        for (Medicine medicineName2:myMedicineList){
            System.out.println(medicineName2.toString());
            System.out.println("*******");
        }
    }

    // search medicine by name and print tha total inventory
    public Medicine searchMedicineByName(String theMedicineName)throws MedicineDoesNotExistException{
        Medicine foundMedicine=null;
        for (Medicine medicine:myMedicineList) {
            if (theMedicineName.equalsIgnoreCase(medicine.getMedicineName()))
            foundMedicine=medicine;
        }
        if (foundMedicine==null)
            throw new MedicineDoesNotExistException(theMedicineName);
        System.out.println("The medicine"+" "+theMedicineName+" " + "found in list:");
        return foundMedicine;

    }

    //return an array list of medicine by type
    public ArrayList<Medicine> searchMedicineByType(Medicine.TypeOfMedicine type){
        ArrayList<Medicine> myListType=new ArrayList<>();
        for (Medicine medicine:myMedicineList) {
            if (medicine.getMyType().equals(type) )
                myListType.add(medicine);
        }
        return myListType;

    }

      // return array list of all medicine in stock
    public ArrayList<Medicine> getMedicineInStock(){
        ArrayList<Medicine> myListInStock=new ArrayList<>();
        for (Medicine medicine :myMedicineList) {
            if (medicine.getQuantity()!=0){
                myListInStock.add(medicine);
            }
        }
        return myListInStock;
    }
}
