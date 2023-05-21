public class Syrup extends Medicine {
    private int bottleContent;

    //constructors

    public Syrup(){

    }
    public Syrup(String medicineName,String companyName,String companyEmail,double price,int quantity,String expirationYear,TypeOfMedicine myType,int bottleContent) throws InvalidEmailAddressException {
        super(medicineName,companyName,companyEmail,price,quantity,expirationYear,TypeOfMedicine.SYRUP);
        setBottleContent(bottleContent);

    }
    //methods

    @Override
    public String toString() {
    return super.toString() +"\nBottle Content:"+bottleContent;
    }

    @Override
    public double totalInventory() {
        int bottle=getBottleContent();
        double numOfBottle=getQuantity();
        double retTotal=bottle*numOfBottle;
        System.out.println("Total inventory of syrups:"+retTotal);
        return retTotal;
    }
    //setters

    public void setBottleContent(int bottleContent) {
        this.bottleContent = bottleContent;
    }


    //getters

    public int getBottleContent() {
        return bottleContent;
    }


}
