import java.util.ArrayList;

public class Operators {
    static void main() {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + "b");
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1);
        //  this is same as after a few steps: "a" + "1"
        //  integer will converted to Integer that will call toString()

        System.out.println("Kunal" + new ArrayList<>());
    }
}
