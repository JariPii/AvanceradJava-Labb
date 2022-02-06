package ec.bilfabrik;

public class Main {

    public static void main(String[] args) {

        CarFactory saabCarFactory = ProducingFactory.getCarFactory("saab");
        Car aero = saabCarFactory.createCar("aero");
        Car turbo = saabCarFactory.createCar("turbo");

        aero.build();
        turbo.build();

        CarFactory volvoCarFactory = ProducingFactory.getCarFactory("volvo");
        Car v40 = volvoCarFactory.createCar("v40");
        Car s70 = volvoCarFactory.createCar("s70");
        Car amazon = volvoCarFactory.createCar("amazon");

        v40.build();
        s70.build();
        amazon.build();

    }
}
