import org.junit.Assert;
import org.junit.Test;

public class UserRegistration {
    @Test
    public void whenGivenFirstName_capitalize_shouldReturnValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String firstName = validateUserRegistration.analyzeFirstName("Aniket");
        Assert.assertEquals("Valid", firstName);
    }

    @Test
    public void whenGivenFirstName_lowerCase_shouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String firstName = validateUserRegistration.analyzeFirstName("aniket");
        Assert.assertEquals("Not valid", firstName);
    }

    @Test
    public void whenGivenFirstName_upperCase_shouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String firstName = validateUserRegistration.analyzeFirstName("ANIKET");
        Assert.assertEquals("Not valid", firstName);
    }

    @Test
    public void whenGivenFirstName_withNumeric_shouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String firstName = validateUserRegistration.analyzeFirstName("Aniket123");
        Assert.assertEquals("Not valid", firstName);
    }

    @Test
    public void whenGivenFirstName_withTwoLetters_shouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String firstName = validateUserRegistration.analyzeFirstName("An");
        Assert.assertEquals("Not valid", firstName);
    }

    @Test
    public void whenGivenLastName_capitalize_shouldReturnValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String lastName = validateUserRegistration.analyzeLastName("Chahare");
        Assert.assertEquals("Valid", lastName);
    }

    @Test
    public void whenGivenLastName_lowerCase_shouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String lastName = validateUserRegistration.analyzeLastName("chahare");
        Assert.assertEquals("Not valid", lastName);
    }

    @Test
    public void whenGivenLastName_upperCase_shouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String lastName = validateUserRegistration.analyzeLastName("CHAHARE");
        Assert.assertEquals("Not valid", lastName);
    }

    @Test
    public void whenGivenLastName_withNumeric_shouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String lastName = validateUserRegistration.analyzeLastName("Chahare123");
        Assert.assertEquals("Not valid", lastName);
    }

    @Test
    public void whenGivenLastName_withTwoLetters_shouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String lastName = validateUserRegistration.analyzeLastName("Ch");
        Assert.assertEquals("Not valid", lastName);
    }

    @Test
    public void whenGivenValidEmail_shouldReturnValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String email = validateUserRegistration.analyzeEmail("abc@yahoo.com");
        Assert.assertEquals("Valid", email);
    }

    @Test
    public void whenGivenValidEmail_containsDash_inAddressField_shouldReturnValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String email = validateUserRegistration.analyzeEmail("abc-100@yahoo.com");
        Assert.assertEquals("Valid", email);
    }

    @Test
    public void whenGivenEmail_containsDot_withSubDomain_shouldReturnValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String email = validateUserRegistration.analyzeEmail("abc111@abc.com");
        Assert.assertEquals("Valid", email);
    }

    @Test
    public void whenGivenEmail_containsDot_inAddressField_withSubDomain_shouldReturnValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String email = validateUserRegistration.analyzeEmail("abc.100@abc.com.au");
        Assert.assertEquals("Valid", email);
    }

    @Test
    public void whenGivenEmail_containsDash_inAddressField_withSubDomain_shouldReturnValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String email = validateUserRegistration.analyzeEmail("abc-100@abc.net");
        Assert.assertEquals("Valid", email);
    }

    @Test
    public void whenGivenEmail_containsDot_inAddressField_shouldReturnValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String email = validateUserRegistration.analyzeEmail("abc.100@yahoo.com");
        Assert.assertEquals("Valid", email);
    }

    @Test
    public void whenGivenInvalidEmail_shouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String email = validateUserRegistration.analyzeEmail("abc@.com.my");
        Assert.assertEquals("Not valid", email);
    }

    @Test
    public void whenGivenEmail_containsDot_inAddressFieldTwice_shouldReturnValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String email = validateUserRegistration.analyzeEmail("abc.xyz.pqr@bl.co.in");
        Assert.assertEquals("Not valid", email);
    }

    @Test
    public void whenGivenEmail_containsSpecialChar_withSubDomain_shouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String email = validateUserRegistration.analyzeEmail("abc.xyz$bl.co.in");
        Assert.assertEquals("Not valid", email);
    }

    @Test
    public void whenGivenEmail_containsSpecialChar_inAddressField_shouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String email = validateUserRegistration.analyzeEmail("abc^xyz@bl.co.in");
        Assert.assertEquals("Not valid", email);
    }

    @Test
    public void whenGivenCountryCode_mobileNumber_shouldReturnValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String mobileNumber = validateUserRegistration.analyzeMobileNumber("91 8806633936");
        Assert.assertEquals("Valid", mobileNumber);
    }

    @Test
    public void whenGivenCountryCode_mobileNumber_followedWithoutSpace_shouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String mobileNumber = validateUserRegistration.analyzeMobileNumber("918898633456");
        Assert.assertEquals("Not valid", mobileNumber);
    }

    @Test
    public void whenGivenCountryCode_mobileNumber_withMoreThanLengthTen_shouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String mobileNumber = validateUserRegistration.analyzeMobileNumber("91880223335634");
        Assert.assertEquals("Not valid", mobileNumber);
    }

    @Test
    public void whenGivenCountryCode_mobileNumber_withLessThanLengthTen_shouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String mobileNumber = validateUserRegistration.analyzeMobileNumber("918802936");
        Assert.assertEquals("Not valid", mobileNumber);
    }

    @Test
    public void whenGivenCountryCode_mobileNumber_includingChar_shouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String mobileNumber = validateUserRegistration.analyzeMobileNumber("91 8802936awd");
        Assert.assertEquals("Not valid", mobileNumber);
    }

    @Test
    public void whenGivenCountryCode_mobileNumber_includingSpecialChar_shouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String mobileNumber = validateUserRegistration.analyzeMobileNumber("91 880*3^6234");
        Assert.assertEquals("Not valid", mobileNumber);
    }

    @Test
    public void whenGivenCountryCode_mobileNumber_includingSpaces_shouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String mobileNumber = validateUserRegistration.analyzeMobileNumber("91 880 2326 234");
        Assert.assertEquals("Not valid", mobileNumber);
    }

    @Test
    public void whenGivenPassword_withMinimumLengthEight_shouldReturnValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String password = validateUserRegistration.analyzePassword("12aBc678");
        Assert.assertEquals("Valid", password);
    }

    @Test
    public void whenGivenPassword_withLessThanLengthEight_shouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String password = validateUserRegistration.analyzePassword("12sb567");
        Assert.assertEquals("Not valid", password);
    }

    @Test
    public void whenGivenPassword_withAtLeastOneUpperCase_shouldReturnValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String password = validateUserRegistration.analyzePassword("Aniket123");
        Assert.assertEquals("Valid", password);
    }
}
