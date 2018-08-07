public class User {
    private Integer ID;
    private String login;
    private String password;
    private String firstName;
    private String surName;
    private String secondName;

    public User(int ID, String login, String password, String firstName, String surName, String secondName) {
        this.ID = ID;
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.surName = surName;
        this.secondName = secondName;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
