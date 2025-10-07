import java.io.IOException;

public class Exercise5 {
    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()
        // Subscribe to a flux using the error and completion hooks

        ReactiveSources.intNumberMono().subscribe(
                num->System.out.println(num),
                err->System.out.println(err.getMessage()),
                ()->System.out.println("Done")
        );

        ReactiveSources.userMono().subscribe(
                user->System.out.print(user),
                error->System.out.print(error.getMessage()),
                ()->System.out.println("Done")
        );

        ReactiveSources.intNumbersFlux().subscribe(
                num -> System.out.println(num),
                err -> System.out.println(err.getMessage()),
                () -> System.out.print("Completed")
        );

        ReactiveSources.userFlux().subscribe(
                System.out::print,
                err -> System.out.print(err.getMessage()),
                () -> System.out.print("Completed")
        );

        // Subscribe to a flux using an implementation of BaseSubscriber
        // TODO: Write code here
        ReactiveSources.userFlux().subscribe(user->System.out.print(user));
        System.out.println("Press a key to end");
        System.in.read();
    }
}
