import java.util.List;
public class Exercise3 {
    public static void main(String[] args) {

        // Use ReactiveSources.intNumbersFlux()

        // Get all numbers in the ReactiveSources.intNumbersFlux stream
        // into a List and print the list and its size

        List<Integer> listnumbers=ReactiveSources.intNumbersFlux().toStream().toList();
        System.out.println(listnumbers);
        System.out.println(listnumbers.size());

//        Below stament is not required because now prin(listnumbers) is depend uponn listnumber so it wont exceute untli all list came.
//        Straem is garunteed that all element present in listnumber then only next statment execute.
//        It Block the code.
//        System.out.println("Press a key to end");
//        System.in.read();
    }
}
