public class validateUserRegistration {
    String regex="^[A-Z]{1}[a-z]{2,}$";

    public String analyzeFirstName(String firstName) {
        if(firstName.matches(regex))
        {
            return "Valid";
        }
        else
        {
            return "Not valid";
        }
    }

    public String analyzeLastName(String lastName) {
        if(lastName.matches(regex))
        {
            return "Valid";
        }
        else
        {
            return "Not valid";
        }
    }
}
