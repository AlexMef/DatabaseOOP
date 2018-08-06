public class User {
    private int ID;
    private String login;
    private String password;
    private String fullName;

    public User(int ID, String login, String password, String fullName) {
        this.ID = ID;
        this.login = login;
        this.password = password;
        this.fullName = fullName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
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

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
