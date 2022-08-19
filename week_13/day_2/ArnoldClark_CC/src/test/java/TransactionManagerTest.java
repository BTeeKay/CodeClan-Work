import Parts.CombustionEngine;
import Parts.Gearbox;
import People.Customer;
import People.Dealership;
import Vehicle.Car;
import Vehicle.ElectricCar;
import behaviours.IVehicle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TransactionManagerTest {

    Customer customer1;
    Dealership dealership1;
    ArrayList<IVehicle> bobCars;
    ArrayList<IVehicle> motorgCars;
    Car car1;
    Car car2;
    Car car3;
    ElectricCar car4;
    CombustionEngine engine1;
    Gearbox gearbox1;


    @Before
    public void before() {
        engine1 = new CombustionEngine(1.8, "Petrol");
        gearbox1 = new Gearbox(6, "Sequential");
        bobCars = new ArrayList<>();
        motorgCars = new ArrayList<>();
        customer1 = new Customer("Bob", 1000, bobCars);
        dealership1 = new Dealership("motorG", 100000, motorgCars);
        car1 = new Car(4, 5, "Red", 1000, engine1, gearbox1);
        car2 = new Car(4, 3, "White", 2000, engine1, gearbox1);
        car3 = new Car(4, 5, "Blue", 5000, engine1, gearbox1);
        car4 = new ElectricCar(4, 5, "Grey", 20000);
        motorgCars.add(car1);
        motorgCars.add(car2);
        motorgCars.add(car3);
        motorgCars.add(car4);
    }

    @Test
    public void dealershipSellingCarAddsToTill() {
        assertEquals(101000, dealership1.sellCar());
    }
}
