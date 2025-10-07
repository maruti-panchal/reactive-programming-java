
import java.io.IOException;
public class Exercise4 {
    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()
        System.out.println("Hello World o");
        // Print the value from intNumberMono when it emits
        ReactiveSources.intNumberMono().subscribe(System.out::println);
        System.out.println("Hello World");
        // Get the value from the Mono into an integer variable
        // TODO: Write code here
        Integer num=ReactiveSources.intNumberMono().block();
        System.out.println(num);
        System.out.println("Press a key to end");
        System.out.println("Hello World 2 after key");
//        System.in.read();
        System.out.println("Hello World 3 after read");
    }
}
