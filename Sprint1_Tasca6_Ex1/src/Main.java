public class Main {
    public static void main(String[] args) {

        NoGenericMethods A = new NoGenericMethods(1, 2, 3);
        System.out.println(A.getElement1());
        System.out.println(A.getElement2());
        System.out.println(A.getElement3());

        NoGenericMethods B = new NoGenericMethods(3, 2, 1);
        System.out.println(B.getElement1());
        System.out.println(B.getElement2());
        System.out.println(B.getElement3());

        NoGenericMethods C = new NoGenericMethods(2, 3, 1);
        System.out.println(C.getElement1());
        System.out.println(C.getElement2());
        System.out.println(C.getElement3());
    }
}