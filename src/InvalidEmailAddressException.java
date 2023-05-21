public class InvalidEmailAddressException extends Exception{
    public InvalidEmailAddressException(String companyEmail,String message){
        System.out.println("Error: The invalid email-"+" " +companyEmail+" ,"+message);
    }
}
