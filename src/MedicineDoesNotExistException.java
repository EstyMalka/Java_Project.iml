public class MedicineDoesNotExistException extends Exception {
    public MedicineDoesNotExistException(String theMedicineName){
        System.out.println("Error: The medicine"+" "+theMedicineName+" not exist in the inventory.");
    }

}
