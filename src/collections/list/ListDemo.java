package collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ListDemo {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("John.Smith", "John.Smith@gmail.com", "212-222-0001"));
        users.add(new User("Jane.Johnson", "Jane.Johnson@yahoo.com", "312-333-0002"));
        users.add(new User("Michael.Williams", "Michael.Williams@hotmail.com", "415-444-0003"));
        users.add(new User("Mary.Brown", "Mary.Brown@outlook.com", "510-555-0004"));
        users.add(new User("David.Jones", "David.Jones@icloud.com", "617-666-0005"));
        users.add(new User("Sarah.Miller", "Sarah.Miller@gmail.com", "703-777-0006"));
        users.add(new User("William.Davis", "William.Davis@yahoo.com", "818-888-0007"));
        users.add(new User("Barbara.Garcia", "Barbara.Garcia@hotmail.com", "901-999-0008"));
        users.add(new User("Richard.Rodriguez", "Richard.Rodriguez@outlook.com", "212-222-0009"));
        users.add(new User("Margaret.Lopez", "Margaret.Lopez@icloud.com", "312-333-0010"));
        users.add(new User("Thomas.Anderson", "Thomas.Anderson@gmail.com", "415-444-0011"));
        users.add(new User("Christopher.Evans", "Christopher.Evans@yahoo.com", "510-555-0012"));
        users.add(new User("Robert.Downey", "Robert.Downey@hotmail.com", "617-666-0013"));
        users.add(new User("Scarlett.Johansson", "Scarlett.Johansson@outlook.com", "703-777-0014"));
        users.add(new User("Mark.Ruffalo", "Mark.Ruffalo@icloud.com", "818-888-0015"));
        users.add(new User("Chris.Hemsworth", "Chris.Hemsworth@gmail.com", "901-999-0016"));
        users.add(new User("Elizabeth.Olsen", "Elizabeth.Olsen@yahoo.com", "212-222-0017"));
        users.add(new User("Anthony.Mackie", "Anthony.Mackie@hotmail.com", "312-333-0018"));
        users.add(new User("Paul.Rudd", "Paul.Rudd@outlook.com", "415-444-0019"));
        users.add(new User("Sebastian.Stan", "Sebastian.Stan@icloud.com", "510-555-0020"));

        var numbers = new int[5];


        List<Integer> numbers2 = new ArrayList<>();

        numbers2.addAll(List.of(1,2,4,5,6,7));


        numbers2.add(0);

        numbers2.add(2,5);

//        numbers2.addFirst(100);
//        numbers2.addLast(200);


        numbers2.add(0,100);
        numbers2.add(numbers2.size(),200);


        System.out.print("contains 40 ");
        System.out.println(numbers2.contains(0));

        System.out.print("contains all ");
        System.out.println(numbers2.containsAll(List.of(100,2,4)));

//        numbers2.forEach(System.out::println);



//        numbers2.forEach(integer -> {
//            System.out.println(integer);
//        });
//
//        System.out.println(numbers2);

        numbers2.sort(Comparator.naturalOrder());
        System.out.println(numbers2.subList(2,6));

//        numbers2.removeIf(Predicate.isEqual(5));


        System.out.println(numbers2);
        System.out.println(numbers2.stream().filter(e-> e >=5).toList());

        System.out.println(users
                .stream()
                .filter(user -> user.email()
                .contains("@gmail.com")).toList().size());

        System.out.println(users.stream().allMatch(user -> user.phoneNumber().contains("-")));

        System.out.println(users
                .stream()
                .filter(user ->
                        user.username().toLowerCase().charAt(0) == 'j' &&
                                user.username().toLowerCase().charAt(user.username().length() - 1) == 'h').toList());

    }

    record User(String username, String email, String phoneNumber){}

}
