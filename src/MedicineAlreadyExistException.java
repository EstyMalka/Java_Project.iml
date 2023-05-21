public class MedicineAlreadyExistException extends Exception {
    public MedicineAlreadyExistException(String MedicineName2){
        System.out.println("Error: The medicine "+ MedicineName2+" " +"is already in list, can't be added.");
    }
}
