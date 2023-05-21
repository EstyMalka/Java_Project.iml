import java.lang.reflect.Type;

public class Pills extends Medicine{
    private int numOfPillsInBox;


    //constructors
    public Pills(){

    }

    public Pills(String medicineName, String companyName, String companyEmail, double price, int quantity, String expirationYear,TypeOfMedicine myType ,int numOfPillsInBox) throws InvalidEmailAddressException {
        super(medicineName,companyName,companyEmail,price,quantity,expirationYear,TypeOfMedicine.PILLS);
        setNumOfPillsInBox(numOfPillsInBox);



    }
    //method
    @Override
    public String toString() {
        return super.toString()+ "\nNumber of pills in box:"+ numOfPillsInBox;
    }

    @Override
    public double totalInventory() {
        double numOfPills=getNumOfPillsInBox();
        double numOfBox=getQuantity();
        double retTotal=numOfPills*numOfBox;
        System.out.println("Total inventory of pills:"+retTotal);
        return retTotal;

    }



    //setters

    public void setNumOfPillsInBox(int numOfPillsInBox) {
        this.numOfPillsInBox = numOfPillsInBox;
    }


    //getters

    public double getNumOfPillsInBox() {
        return numOfPillsInBox;
    }

}
