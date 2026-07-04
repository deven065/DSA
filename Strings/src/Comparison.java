public class Comparison {
    static void main() {
//        String a = "Kunal";
//        String b = "Kunal";

//        System.out.println(a == b);   // o/p :- True because both variables are accessing same object from String Pool in the heap memory

        String a = new String("Kunal");
        String b = new String("Kunal");

        System.out.println(a == b); //  o/p :- false because we are creating objects seperately
        System.out.println(a.equals(b));    //  This will only check the values
        System.out.println(a.charAt(0));
    }
}
