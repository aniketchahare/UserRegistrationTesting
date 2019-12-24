import org.junit.Assert;
import org.junit.Test;

public class UserRegistration {
    @Test
    public void whenGivenFirstNameCapitalize_ShouldReturnValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String firstName = validateUserRegistration.analyzeFirstName("Aniket");
        Assert.assertEquals("Valid", firstName);
    }

    @Test
    public void whenGivenFirstNameLowerCase_ShouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String firstName = validateUserRegistration.analyzeFirstName("aniket");
        Assert.assertEquals("Not valid", firstName);
    }

    @Test
    public void whenGivenFirstNameUpperCase_ShouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String firstName = validateUserRegistration.analyzeFirstName("ANIKET");
        Assert.assertEquals("Not valid", firstName);
    }

    @Test
    public void whenGivenFirstNameWithNumeric_ShouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String firstName = validateUserRegistration.analyzeFirstName("Aniket123");
        Assert.assertEquals("Not valid", firstName);
    }

    @Test
    public void whenGivenFirstNameWithTwoLetters_ShouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String firstName = validateUserRegistration.analyzeFirstName("An");
        Assert.assertEquals("Not valid", firstName);
    }
}
