public class Runner {

    public static void main(String[] args) {



        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton1.getData());

        singleton1.setData("I think that I know that I think");

        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton2.getData());

    }
}
