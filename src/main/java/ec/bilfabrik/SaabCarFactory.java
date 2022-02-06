package ec.bilfabrik;

public class SaabCarFactory implements CarFactory{
    @Override
    public Car createCar(String carType) {

        if("aero".equalsIgnoreCase(carType)) {
            return new Aero();
        }

        if("turbo".equalsIgnoreCase(carType)) {
            return new Turbo95();
        }

        return null;
    }
}