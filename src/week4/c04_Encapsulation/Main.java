package week4.c04_Encapsulation;

public class Main {

    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter",-5);
        Book lordOfRings = new Book("Lord of Rings",500);

        System.out.println(harryPotter.getName());

        harryPotter.setName("Felsefe Taşı");
        System.out.println(harryPotter.getName());

        System.out.println(harryPotter.getPageNumber());

        harryPotter.setPageNumber(186);
        System.out.println(harryPotter.getPageNumber());

        System.out.println(lordOfRings.getName());
        System.out.println(lordOfRings.getPageNumber());
    }
}
