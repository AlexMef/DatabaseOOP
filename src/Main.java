public class Main {

    public static void main(String[] args) {
        Database database = new Database();
//        User user1 = new User(1, "alex", "123465", "Александр Карасиков");
//        User user2 = new User(2, "crunchy", "1258902", "Василий Зайцев");
//        User user3 = new User(3, "roll", "lkjfasd324", "Евгений Зверев");
//        User user4 = new User(2, "barrel", "asd234jk3", "Григорий Креведко");



        database.addUser(new User(1, "alex", "123465", "Александр Карасиков"));
        database.addUser(new User(2, "crunchy", "1258902", "Василий Зайцев"));
        database.addUser(new User(3, "roll", "lkjfasd324", "Евгений Зверев"));
        database.addUser(new User(4, "barrel", "asd234jk3", "Григорий Креведко"));
//        System.out.println(database.toString());
//        System.out.println(database.getUser(2));
        database.getAllUsers();
        System.out.println();
        database.removeUser(1);
        database.getAllUsers();
        System.out.println();
        database.addUser(1, new User(1, "alex", "123465", "Александр Карасиков"));
        database.getAllUsers();

        // TODO: 06.08.2018 Написать оператор выбора (switch-case) для доступа к базе данных

    }

}
