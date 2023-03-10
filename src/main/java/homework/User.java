package homework;

public class User {
    private String login;
    private String email;

    public User() {
        this("login", "email@mail.ru");
    }

    public User(String login, String email) {
        setLogin(login);
        setEmail(email);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if(!login.equals(this.email)){
            this.login = login;
        }
        else{
            throw new RuntimeException("Логин и почта не должны совпадать");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.equals(this.login)){
            throw new RuntimeException("Логин и почта не должны совпадать");
        }
        else if(email.contains("@") && email.contains(".")){
            this.email = email;
        }
        else{
            throw new RuntimeException("Некорректно введена почта. Электронная почта должна включать символы: '@' и '.'");
        }
    }

}
