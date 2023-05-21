import java.lang.reflect.Type;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InvalidEmailAddressException {
        Inventory myInventory = new Inventory();
        ArrayList<Medicine> myListType = new ArrayList<>();
        ArrayList<Medicine> medicineInStock = new ArrayList<>();

        //Task 1
        //creating instances of the medicine

       //Pills
        Pills a=null ;
        try {
             a = new Pills("Akamol", "Teva", "es12@gmail.com", 30.5, 3, "2022", Medicine.TypeOfMedicine.PILLS, 50);
        } catch (InvalidEmailAddressException ieae) {
            ieae.printStackTrace();

        }

        Pills a1=null;
        try {
             a1 = new Pills("Adexs", "Solgar", "l123@gmail.com", 25.6, 6, "2024", Medicine.TypeOfMedicine.PILLS, 40);
        } catch (InvalidEmailAddressException ieae) {
            ieae.printStackTrace();

        }
        Pills a2=null;
        try {
             a2 = new Pills("Decsamol", "Teva", "md456@gmail.com", 48.9, 10, "2023", Medicine.TypeOfMedicine.PILLS, 70);
        } catch (InvalidEmailAddressException ieae) {
            ieae.printStackTrace();

        }

        //Syrup

        Syrup b=null;
        try {
             b = new Syrup("Optalgin", "superub", "df4@gmail.com", 20.7, 4, "2025", Medicine.TypeOfMedicine.SYRUP, 100);
        } catch (InvalidEmailAddressException ieae) {
            ieae.printStackTrace();
        }

        Syrup b1=null;
        try {
            b1 = new Syrup("Akamoly", "forever", "dk412@gmail.com", 84.3, 8, "1997", Medicine.TypeOfMedicine.SYRUP, 50);
        } catch (InvalidEmailAddressException ieae) {
            ieae.printStackTrace();
        }

        Syrup b2=null;
        try {
            b2 = new Syrup("Vitamin D", "Supherb", "m7878@gmail.com", 55.5, 2, "2010", Medicine.TypeOfMedicine.SYRUP, 60);
        } catch (InvalidEmailAddressException ieae) {
            ieae.printStackTrace();
        }

        //Inhaler

        Inhaler c=null;
        try {

         c = new Inhaler("Inelazia", "solgar", "rr12@teve.com", 78.9, 5, "2008", Medicine.TypeOfMedicine.INHALER, 50);
        } catch (InvalidEmailAddressException ieae) {
            ieae.printStackTrace();
        }

         Inhaler c1=null;
        try {
            c1 = new Inhaler("Vitamin", "Florid", "ty458@teve.com", 45.5, 5, "2030", Medicine.TypeOfMedicine.INHALER, 50);
        } catch (InvalidEmailAddressException ieae) {
            ieae.printStackTrace();
        }

        Inhaler c2=null;
        try {
             c2 = new Inhaler("Bordetion", "Teva", "esty12@teve.com", 56.3, 5, "2028", Medicine.TypeOfMedicine.INHALER, 50);
    } catch (InvalidEmailAddressException ieae) {
            ieae.printStackTrace();
        }

        //Task 2
        // adding a new medicine to the inventory

            System.out.println("Task 2");
        try {
            myInventory.addMedicine(a);
            myInventory.addMedicine(a1);
            myInventory.addMedicine(a2);
            myInventory.addMedicine(b);
            myInventory.addMedicine(b1);
            myInventory.addMedicine(b2);
            myInventory.addMedicine(c);
            myInventory.addMedicine(c1);
            myInventory.addMedicine(c2);
        } catch (MedicineAlreadyExistException maee) {
            maee.printStackTrace();
        }
            myInventory.printAllMedicine();

        //Task 3
        // search for a specific by name

        System.out.println();
        System.out.println("Task 3");
         Medicine foundMedicine= null;
        try {
            foundMedicine = myInventory.searchMedicineByName("Adexs");
        } catch (MedicineDoesNotExistException e) {
           e.printStackTrace();

        }
        System.out.println(foundMedicine.toString());

        //Task 4
        // search for all medicine by type

        System.out.println();
        System.out.println("Task 4");
        myListType=myInventory.searchMedicineByType(Medicine.TypeOfMedicine.PILLS);
        System.out.println("All medicine of the same type:");
        for (Medicine medicine:myListType) {
             System.out.println(medicine.toString());
        }

        //Task 5
        // print all medicine in stock

        System.out.println();
        System.out.println("Task 5");
        medicineInStock = myInventory.getMedicineInStock();
        System.out.println("All medicine in stock:");
        for (Medicine medicine : medicineInStock) {
            System.out.println(medicine.toString());
        }
            if (myInventory.getMedicineInStock() == null) {
            System.out.println("No medicine in stock");
        }


        //Task 6
        //adding an existing medicine to inventory

        System.out.println();
        System.out.println("Task 6");
         try {
            Medicine addMedicineExist= myInventory.addMedicine(a);
        } catch (MedicineAlreadyExistException maee) {
            maee.printStackTrace();
        }


        //Task 7
        // search for a medicine that doesn't exist

        System.out.println();
        System.out.println("Task 7");
        try {
            Medicine searchMedicine= myInventory.searchMedicineByName("All");
        } catch (MedicineDoesNotExistException e) {
            e.printStackTrace();
        }

        //Task 8
        //adding a medicine whit invalid email

        System.out.println();
        System.out.println("Task 8");
        Syrup b3=null;
        try {
            b3 = new Syrup("vitamin D", "Solgar", "df4.@gmailcom", 58.3, 2, "2010", Medicine.TypeOfMedicine.SYRUP, 60);
        } catch (InvalidEmailAddressException ieae) {
            ieae.printStackTrace();
        }

    }
}
