import java.util.ArrayList;
import java.util.Arrays;
public class AnotherRunner {
    public static void main(String[] args) {

        Car Turtle = new Car("a", 1);
        Car Cat = new Car("b", 2);
        Car Dog = new Car("c", 3);

        Car[] cars = {Turtle, Cat, Dog};
        ArrayList<Car> cars2 = new ArrayList<Car>(Arrays.asList(cars));
        System.out.println(cars2);

    }
}
