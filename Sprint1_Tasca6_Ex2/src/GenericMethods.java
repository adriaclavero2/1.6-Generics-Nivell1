 public class GenericMethods {

    public static <T, U, V> void printElements(T E1, U E2, V E3) {
        System.out.println(E1);
        System.out.println(E2);
        System.out.println(E3);
    }
}