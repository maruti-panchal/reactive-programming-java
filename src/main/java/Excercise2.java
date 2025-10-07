
import java.io.IOException;

public class Excercise2 {
    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // ************ Same Task Multiple ways *************
        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        ReactiveSources.intNumbersFlux().subscribe(System.out::println);
        ReactiveSources.intNumbersFlux().subscribe(num->System.out.println(num));

        // Print all users in the ReactiveSources.userFlux stream
        ReactiveSources.userFlux().subscribe(System.out::println);
        ReactiveSources.userFlux().subscribe(user->System.out.println(user));
        ReactiveSources.userFlux().subscribe(user->System.out.println(user.toString()));


        System.out.println("Press a key to end");
        System.in.read();
    }
}
