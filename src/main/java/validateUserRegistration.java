public class validateUserRegistration {
    String regexName = "^[A-Z]{1}[a-z]{2,}$";
    String regexEmail = "(^[a-zA-Z0-9_]+[.-]?[a-zA-Z0-9]+@[a-zA-Z0-9]{0}+[.-]?[a-zA-Z0-9]{2,4}+.+[a-zA-z0-9]{2,4}$)";
    String regexMobileNumber = "(^+[0-9]{1,3}[ ][0-9]{10}$)";
    String regexPassword = "^[a-zA-Z0-9]{8,}$";

    public String analyzeFirstName(String firstName) {
        if(firstName.matches(regexName))
        {
            return "Valid";
        }
        else
        {
            return "Not valid";
        }
    }

    public String analyzeLastName(String lastName) {
        if(lastName.matches(regexName))
        {
            return "Valid";
        }
        else
        {
            return "Not valid";
        }
    }

    public String analyzeEmail(String email) {
        if(email.matches(regexEmail))
        {
            return "Valid";
        }
        else
        {
            return "Not valid";
        }
    }

    public String analyzeMobileNumber(String mobileNumber){
        if(mobileNumber.matches(regexMobileNumber))
        {
            return "Valid";
        }
        else
        {
            return "Not valid";
        }
    }

    public String analyzePassword(String password){
        if(password.matches(regexPassword))
        {
            return "Valid";
        }
        else
        {
            return "Not valid";
        }
    }
}
