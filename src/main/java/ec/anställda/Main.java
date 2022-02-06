package ec.anställda;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employees> employees = getEmployee();

        System.out.println("Genomsnittslön per kön "+employees
                .stream()
                .collect(Collectors.groupingBy(Employees::getGender,
                        Collectors.averagingDouble(Employees::getSalary)))
        );

        System.out.println();

        System.out.println("Högst lön har " + employees
                .stream()
                .max(Comparator.comparingDouble(Employees::getSalary))
                .get()
        );

        System.out.println();

        System.out.println("Lägst lön har " + employees
                .stream()
                .min(Comparator.comparingDouble(Employees::getSalary))
                .get()
        );

    }

    public static List<Employees> getEmployee() {
        return List.of(
                new Employees("Albin Albino", Gender.Male, 500),
                new Employees("Urban Stadslös", Gender.Male, 10),
                new Employees("Frida Fredag", Gender.Female, 70),
                new Employees("Stina Stång", Gender.Female, 1900),
                new Employees("Elin Elektriker", Gender.Female, 1600),
                new Employees("Allan O'Brallan", Gender.Male, 18800),
                new Employees("Agda Kask", Gender.Female, 10000),
                new Employees("Stina O'Brallan", Gender.Female, 1100),
                new Employees("Berit Beirut", Gender.Female, 10056),
                new Employees("Carlton Smith", Gender.Male, 10560)
        );
    }


}