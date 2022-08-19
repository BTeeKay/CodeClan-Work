import pets.Cat;
import pets.Dog;
import pets.Fish;

public class ExampleTryCatch{
    PetShop shop;

    public void run(){
        setup();
        try {
            shop.findPetByName(null);
        }
        catch(NullStringException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("I am going to clean up the mess");
        }
    }

    public void setup(){
        shop = new PetShop();
        shop.addPet(new Dog("RoveR"));
        shop.addPet(new Cat("meowintons"));
        shop.addPet(new Fish("FINlay"));
    }
}