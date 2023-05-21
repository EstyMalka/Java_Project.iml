import java.lang.reflect.Type;

public abstract class Medicine {

    private String medicineName;
    private String companyName;
    private String companyEmail;
    private double price;
    private int quantity;
    private String expirationYear;
    private  TypeOfMedicine myType;


    enum  TypeOfMedicine {
        PILLS,
        SYRUP,
        INHALER,
    }

    //constructors
    public Medicine() {


    }

    public Medicine(String medicineName, String companyName, String companyEmail, double price, int quantity, String expirationYear,TypeOfMedicine myType) throws InvalidEmailAddressException {
        setMedicineName(medicineName);
        setCompanyName(companyName);
        setCompanyEmail(companyEmail);
        setPrice(price);
        setQuantity(quantity);
        setExpirationYear(expirationYear);
        setMyType(myType);

    }

    //functions
    public String toString(){
       return"\nMedicine Name:"+medicineName+" "+"\nCompany Name:"+companyName+" "+"\nCompany e-mail:"+companyEmail+" "
            +"\nPrice:"+price+" "+"\nNumber of Boxes:"+quantity+" "+"\nExpiration Year:"+expirationYear+"\nType of medicine:"+ myType;

}
    public abstract double totalInventory();

    public boolean inStock() {
        if (quantity>0)
        return true;
        else
           return false;
    }

    // Setters


    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
        String Name=medicineName;
        String Name1=Name.toUpperCase();
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;

    }

    public void setCompanyEmail(String companyEmail)throws InvalidEmailAddressException {
        if (companyEmail.startsWith("@"))
            throw new InvalidEmailAddressException(companyEmail,"you are providing incorrect email ,can't start with @");
        if (companyEmail.endsWith("@"))
            throw new InvalidEmailAddressException(companyEmail,"you are providing incorrect email,can't end with @");
        if (!companyEmail.contains("@"))
            throw new InvalidEmailAddressException(companyEmail,"you are providing incorrect email,the email should contain @ ");
        if (companyEmail.lastIndexOf(".") < companyEmail.lastIndexOf("@"))
            throw new InvalidEmailAddressException(companyEmail,"you are providing incorrect email ,must have period after the @");
        this. companyEmail = companyEmail;


    }

    public void setPrice(double price) {
        this.price = price;
        if (price<=0)
            System.out.println("Incorrect price");

    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setExpirationYear(String expirationYear) {
        this.expirationYear = expirationYear;
    }

    public void setMyType(TypeOfMedicine myType) {
        this.myType = myType;
    }

    //Getters

    public String getMedicineName() {
        return medicineName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getExpirationYear() {
        return expirationYear;
    }

    public  TypeOfMedicine getMyType() {
        return myType;
    }
}
