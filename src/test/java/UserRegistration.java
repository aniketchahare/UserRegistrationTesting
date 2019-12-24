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

    @Test
    public void whenGivenLastNameCapitalize_ShouldReturnValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String lastName = validateUserRegistration.analyzeLastName("Chahare");
        Assert.assertEquals("Valid", lastName);
    }

    @Test
    public void whenGivenLastNameLowerCase_ShouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String lastName = validateUserRegistration.analyzeLastName("chahare");
        Assert.assertEquals("Not valid", lastName);
    }

    @Test
    public void whenGivenLastNameUpperCase_ShouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String lastName = validateUserRegistration.analyzeLastName("CHAHARE");
        Assert.assertEquals("Not valid", lastName);
    }

    @Test
    public void whenGivenLastNameWithNumeric_ShouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String lastName = validateUserRegistration.analyzeLastName("Chahare123");
        Assert.assertEquals("Not valid", lastName);
    }

    @Test
    public void whenGivenLastNameWithTwoLetters_ShouldReturnNotValid() {
        validateUserRegistration validateUserRegistration = new validateUserRegistration();
        String lastName = validateUserRegistration.analyzeLastName("Ch");
        Assert.assertEquals("Not valid", lastName);
    }
}
