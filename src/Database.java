import java.util.ArrayList;
import java.util.Iterator;

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
            System.out.printf("%d" +  "%10s" + "%10s" + "%15s" + "%15s" + "%15s\n", user.getID(), user.getLogin(), user.getPassword(), user.getFirstName(), user.getSurName(), user.getSecondName());
        }
    }

    // TODO: 06.08.2018 Добавить возможность удалить пользователя по ID
    public void removeUser(int index) {
        index--;
        listOfUsers.remove(index);
    }

    public void removeUserByID(Integer ID) {
                        Iterator i = listOfUsers.iterator();
                        while (i.hasNext()) {
                            User user = (User)i.next();
                            System.out.println(user.getID());
                            if (user.getID().equals(ID)) {
                                System.out.println("remove");
                                i.remove();
                }
            }
        }
    }
