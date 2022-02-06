package ec.bilfabrik;

public class ProducingFactory {

    public static CarFactory getCarFactory(String factoryType) {

        if("saab".equalsIgnoreCase(factoryType)) {
            return new SaabCarFactory();
        }else

        if("volvo".equalsIgnoreCase(factoryType)) {
            return new VolvoCarFactory();
        }

        return null;

    }

}