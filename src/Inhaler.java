public class Inhaler extends Medicine{
    private int amountOfClick;

    //constructors
    public Inhaler(){

    }
    public Inhaler(String medicineName,String companyName,String companyEmail,double price,int quantity,String expirationYear,TypeOfMedicine myType,int amountOfClick) throws InvalidEmailAddressException {
        super(medicineName,companyName,companyEmail,price,quantity,expirationYear,TypeOfMedicine.INHALER);
        setAmountOfClick(amountOfClick);

    }
    //methods

    @Override
    public String toString() {
        return super.toString()+"\nAmount of clicks in the inhaler:"+amountOfClick;
    }

    @Override
    public double totalInventory() {
        int numOfClick=getAmountOfClick();
        double numOfInhaler=getQuantity();
        double retTotal=numOfClick*numOfInhaler;
        System.out.println("Total inventory of inhalers:"+retTotal);
        return retTotal;
    }
    //setter

    public void setAmountOfClick(int amountOfClick) {
        this.amountOfClick = amountOfClick;
    }


    //getter

    public int getAmountOfClick() {
        return amountOfClick;
    }


}
