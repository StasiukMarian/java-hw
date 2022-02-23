package hw3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car user1Car = new Car("toyota", 2021, 250);
        Car user2Car = new Car("audi", 2019, 230);
        Car user3Car = new Car("honda", 2020, 250);
        Car user4Car = new Car("mazda", 2018, 250);
        Car user5Car = new Car("hyundai", 2016, 250);
        Car user6Car = new Car("bmw", 2015, 250);
        Car user7Car = new Car("kia", 2009, 250);
        Car user8Car = new Car("lada", 2000, 250);
        Car user9Car = new Car("mitsubishi", 2010, 250);
        Car user10Car = new Car("lexus", 2014, 250);

        Skills skill1 = new Skills("java", 10);
        Skills skill2 = new Skills("js", 10);
        Skills skill3 = new Skills("c++", 10);
        Skills skill4 = new Skills("php", 10);
        Skills skill5 = new Skills("c", 10);
        Skills skill6 = new Skills("c#", 10);
        Skills skill7 = new Skills("ror", 10);
        Skills skill8 = new Skills("html,css", 10);
        List<Skills> user1Skills = new ArrayList<>();
        user1Skills.add(skill1);
        user1Skills.add(skill2);
        user1Skills.add(skill3);
        List<Skills> user2Skills = new ArrayList<>();
        user2Skills.add(skill2);
        user2Skills.add(skill8);
        List<Skills> user3Skills = new ArrayList<>();
        user3Skills.add(skill5);
        user3Skills.add(skill6);
        user3Skills.add(skill1);
        user3Skills.add(skill2);
        List<Skills> user4Skills = new ArrayList<>();
        user4Skills.add(skill4);
        List<Skills> user5Skills = new ArrayList<>();
        user5Skills.add(skill7);
        user5Skills.add(skill6);
        user5Skills.add(skill5);
        user5Skills.add(skill3);
        user5Skills.add(skill2);
        List<Skills> user6Skills = new ArrayList<>();
        user6Skills.add(skill8);
        user6Skills.add(skill1);
        user6Skills.add(skill5);
        user6Skills.add(skill3);
        user6Skills.add(skill2);
        user6Skills.add(skill1);
        user6Skills.add(skill7);

        User user1 = new User(1, "marian", "stasiuk", "lilmaryan2001@gmail.com", 20, Gender.MALE, user1Skills, user1Car);
        User user2 = new User(2, "iryna", "vasilyeva", "vasilyeva@gmail.com", 21, Gender.FEMALE, user2Skills, user2Car);
        User user3 = new User(3, "oleg", "antonov", "antonov@gmail.com", 40, Gender.MALE, user3Skills,user3Car);
        User user4 = new User(4, "andriy", "golovatiy", "golovatiy@gmail.com", 23, Gender.MALE, user4Skills, user4Car);
        User user5 = new User(5, "albert", "kariy", "kariy@gmail.com", 27, Gender.MALE, user5Skills, user5Car);
        User user6 = new User(6, "kostia", "vlasov", "vlasov@gmail.com", 28, Gender.MALE, user6Skills, user6Car);
//        User user7 = new User(7, "anna", "karenina", "karenina@gmail.com", 24, Gender.FEMALE, user2Skills, user7Car);
//        User user8 = new User(8, "valeriya", "artemova", "antonov@gmail.com", 19, Gender.MALE, user3Skills,user8Car);
//        User user9 = new User(9, "andriy", "luchkevich", "luchkevich@gmail.com", 25, Gender.MALE, user2Skills, user9Car);
//        User user10 = new User(10, "olha", "kuleba", "kuleba@gmail.com", 30, Gender.FEMALE, user1Skills, user10Car);
        Set<User> usersSet = new HashSet<>();
        usersSet.add(user1);
        usersSet.add(user2);
        usersSet.add(user3);
        usersSet.add(user4);
        usersSet.add(user5);
        usersSet.add(user6);
//        usersSet.add(user7);
//        usersSet.add(user8);
//        usersSet.add(user9);
//        usersSet.add(user10);

        Iterator<User> userIterator = usersSet.iterator();
        while (userIterator.hasNext()){
            User next = userIterator.next();
            if (next.getGender() == Gender.MALE){
                userIterator.remove();
            }
        }

        System.out.println(usersSet);

        TreeSet<User> userTreeSet = new TreeSet<>();
        userTreeSet.add(user1);
        userTreeSet.add(user2);
        userTreeSet.add(user3);
        userTreeSet.add(user4);
        userTreeSet.add(user5);
        userTreeSet.add(user6);
        System.out.println(userTreeSet.size());
        System.out.println(userTreeSet);
    }

}
