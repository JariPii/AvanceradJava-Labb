package ec.primtal;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {

        //<<<<UTAN MULTITHREAD
        Long start = System.currentTimeMillis();
        System.out.println("\nAntal prim nummer mellan 2 och 500000:\n" + antalPrimTal(2, 500000).stream().count());
        Long end = System.currentTimeMillis();
        System.out.println("Time " + (end - start));

        //<<<<MED MULTITHREAD (PARALLEL)
        Long start2 = System.currentTimeMillis();
        System.out.println("\nAntal prim nummer mellan 2 och 500000:\n" + antalPrimTalParallel(2, 500000).stream().count());
        Long end2 = System.currentTimeMillis();
        System.out.println("Time " + (end2-start2));

    }

    //<<<<UTAN MULTITHREAD
    public static List < Integer > antalPrimTal(int startingNumber, int endingNumber) {
        return IntStream
                .rangeClosed(startingNumber, endingNumber)
                .filter(x -> primTal(x)).boxed()
                .collect(Collectors.toList());
    }

    //<<<<MED MULTITHREAD (PARALLEL)
    public static List < Integer > antalPrimTalParallel(int startingNumber, int endingNumber) {
        return IntStream
                .rangeClosed(startingNumber, endingNumber)
                .parallel()
                .filter(x -> primTal(x)).boxed()
                .collect(Collectors.toList());
    }


    private static boolean primTal(int number) {
        return number > 1 && IntStream
                .range(2, number)
                .noneMatch(i -> number % i == 0);
    }



}
