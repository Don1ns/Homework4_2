package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    public static final String DEFAULT_LOGIN = "login";
    public static final String DEFAULT_EMAIL = "email@mail.ru";
    public static final String CORRECT_LOGIN = "Shrek23";
    public static final String CORRECT_EMAIL = "shrek23@yandex.ru";
    public static final String WRONG_EMAIL = "email@mailru";

    @Test
    public void testUserConstructor() {
        User user = new User(CORRECT_LOGIN, CORRECT_EMAIL);
        assertEquals(CORRECT_LOGIN, user.getLogin());
        assertEquals(CORRECT_EMAIL, user.getEmail());
    }

    @Test
    public void testUserConstructorWithOutParameters() {
        User user = new User();
        assertEquals(DEFAULT_LOGIN, user.getLogin());
        assertEquals(DEFAULT_EMAIL, user.getEmail());
    }

    @Test
    public void testCorrectEmail() {
        User user = new User(CORRECT_LOGIN, CORRECT_EMAIL);
        assertThrows(RuntimeException.class, () -> user.setEmail(WRONG_EMAIL));
    }

    @Test
    public void shouldReturnNonEqualsLoginAndEmail() {
        User user = new User(CORRECT_LOGIN, CORRECT_EMAIL);
        assertThrows(RuntimeException.class, () -> user.setLogin(CORRECT_EMAIL));
    }
}