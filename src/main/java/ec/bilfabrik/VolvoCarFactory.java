package ec.bilfabrik;

public class VolvoCarFactory implements CarFactory{
    @Override
    public Car createCar(String carType) {

        if("s70".equalsIgnoreCase(carType)) {
            return new S70();
        }

        if("v40".equalsIgnoreCase(carType)) {
            return new V40();
        }

        if("amazon".equalsIgnoreCase(carType)) {
            return new Amazon();
        }

        return null;

    }
}
