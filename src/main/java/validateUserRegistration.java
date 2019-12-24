public class validateUserRegistration {
    public String analyzeFirstName(String firstName) {
        String valid="^[A-Z]{1}[a-z]{2,}$";
        if(firstName.matches(valid))
        {
            return "Valid";
        }
        else
        {
            return "Not valid";
        }
    }
}
