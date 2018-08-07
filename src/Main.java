import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Database database = new Database();
        Scanner in = new Scanner(System.in);
////        User user1 = new User(1, "alex", "123465", "Александр Карасиков");
////        User user2 = new User(2, "crunchy", "1258902", "Василий Зайцев");
////        User user3 = new User(3, "roll", "lkjfasd324", "Евгений Зверев");
////        User user4 = new User(2, "barrel", "asd234jk3", "Григорий Креведко");
//
//
//
//        database.addUser(new User(1400, "alex", "123465", "Александр Карасиков"));
//        database.addUser(new User(228, "crunchy", "1258902", "Василий Зайцев"));
//        database.addUser(new User(322, "roll", "lkjfasd324", "Евгений Зверев"));
//        database.addUser(new User(1488, "barrel", "asd234jk3", "Григорий Креведко"));
////        System.out.println(database.toString());
////        System.out.println(database.getUser(2));
//        database.getAllUsers();
//        System.out.println();
//        database.removeUser(1);
//        database.getAllUsers();
//        System.out.println();
//        database.addUser(1, new User(1, "alex", "123465", "Александр Карасиков"));
//        database.removeUserByID(322);
//        database.getAllUsers();
//
//        // TODO: 06.08.2018 Написать оператор выбора (switch-case) для доступа к базе данных
        while (true) {
            System.out.println("1 - Добавление пользователя, 2 - Вывод всех пользователей, 3 - Удаление пользователя, 4 - Удаление всех пользователей, 5 - выход из программы");
            switch (in.nextInt()) {
                case 1:
                int ID = in.nextInt();
                for (User user : database.listOfUsers){
                    if (user.getID().equals(ID)){
                        // проверка ID. Он должен быть уникальным
                    }
                }
//                String login = in.next();
//                String password = in.next();
//                String firstName = in.next();
//                String surName = in.next();
//                String secondName = in.next();

//                database.addUser(new User(ID, login, password, firstName, surName, secondName));
                    database.addUser(new User(13, "adfasdf", "asdfasdfgge432", "lulu", "asdflkaj", "alshdfuh32423"));
                    break;
                case 2:
                    if (database.listOfUsers.isEmpty()) {
                        System.out.println("База данных пуста");
                        break;
                    }
                    database.getAllUsers();
                    break;
                case 3:
                    System.out.println("Введите ID");
                    database.removeUserByID(in.nextInt());
            }

        }
    }

}
