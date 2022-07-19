public class Runner {
    public static void main(String[] args) {
        Bear bear = new Bear("Balu");
        String name = bear.getName();
        System.out.println(name);
        bear.setName("Horse");
        name = bear.getName();
        System.out.println(name);

    }
}
