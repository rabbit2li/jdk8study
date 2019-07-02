package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Car {

    public static void printName(Car car){
        System.out.println("打印car的名字...");
    }

    public String getName(){
        System.out.println("nianchen");
        return "获取car的名字...";
    }

    public static String flatName(Supplier<String> supplier){
        return "填充car的名字 " + supplier.get();
    }

    public static Car flatCar(Supplier<Car> supplier){
        Car car = supplier.get();
        System.out.println("填充car");
        return car;
    }

    public static void main(String[] args) {
        List<Car> list = Arrays.asList(new Car(),new Car());
        list.forEach(Car::printName);
    }


}
