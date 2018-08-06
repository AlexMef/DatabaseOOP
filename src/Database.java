import java.util.ArrayList;

public class Database {
    ArrayList<User> listOfUsers = new ArrayList<>();

    public Database() {
        System.out.println("Database created");
    }

    public void addUser(User user) {
        listOfUsers.add(user);
    }

    public void addUser(int index, User user) {
        index--;
        listOfUsers.add(index, user);
    }


    public User getUser(int index) {
        index--;
        return listOfUsers.get(index);
    }

    public void getAllUsers() {
        for (User user : listOfUsers) {
            System.out.println(user.getID() + "\t" + user.getFullName() + "\t\t\t" + user.getLogin() + "\t\t\t" + user.getPassword());
        }
    }

    // TODO: 06.08.2018 Добавить возможность удалить пользователя по ID
    public void removeUser(int index) {
        index--;
        listOfUsers.remove(index);
    }
}
