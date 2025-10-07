import java.sql.SQLOutput;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
public class Exercise1 {
    public static void main(String[] args) {


        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        Stream<Integer> numbersStream= StreamSources.intNumbersStream();
        System.out.println("Printing All Numbers");
        List<Integer> numbers = numbersStream.collect(Collectors.toList());
        System.out.println(numbers);

        // Print numbers from intNumbersStream that are less than 5
        Stream<Integer> numbersStream2 = StreamSources.intNumbersStream();
        System.out.println("Numbers that are less than 5");
        numbersStream2.filter(number->number<5).forEach(System.out::println);

        // Print the second and third numbers in intNumbersStream that's greater than 5
        Stream<Integer> numbersStream3 = StreamSources.intNumbersStream();
        System.out.println("second and third numbers");
        numbersStream3.filter(number->number>5).limit(3).skip(1).forEach(System.out::println);

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1

        Stream<Integer> numbersStream4=StreamSources.intNumbersStream();
        System.out.println("Print the first number in intNumbersStream that's greater than 5");
        numbersStream4.filter(number->number>20).limit(1).forEach(System.out::println);

        // Print first names of all users in userStream
        System.out.println("Print first names of all users in userStream");
        Stream<User> users=StreamSources.userStream();
        users.forEach(user -> System.out.println(user.getFirstName()));

        // Print first names in userStream for users that have IDs from number stream
        Stream<Integer> numbersStream5 = StreamSources.intNumbersStream();
        Set<Integer> numbersSet = numbersStream5.collect(Collectors.toSet());
        Stream<User> usersStream1 = StreamSources.userStream();
        System.out.println("Print first names in userStream for users that have IDs from number stream");
        usersStream1.filter(user->numbersSet.contains(user.getId())).forEach(System.out::println);
    }
}
