package kg.megacom.models;

public class Accounts {
    private Users id;
    private String login;
    private String password;
    private int active;

    public Users getId() {
        return id;
    }

    public void setId(Users id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
}
