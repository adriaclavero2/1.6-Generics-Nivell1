public class Main {
    public static void main(String[] args) {
        Person p1 = new Person ("Perico", "Palotes", 35);
        Person p2 = new Person ("Fulanito", "Santos", 29);
        Person p3 = new Person ("Menganita", "López", 41);

        GenericMethods.printElements(p1, p2, p3);
        GenericMethods.printElements("Angelito", 99, "Bonifacio");
        GenericMethods.printElements(21, "Hola", p3);
        GenericMethods.printElements("Hola", "Buenos", "Días");
        GenericMethods.printElements(3, 2, 1);
    }
}
