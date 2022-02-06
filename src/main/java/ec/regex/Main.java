package ec.regex;


import java.util.List;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[aeiouy].*[aeiouy]", Pattern.CASE_INSENSITIVE);

        List.of("apa", "cykel", "boll", "bil", "EngAgErA", "svamp", "al", "moln", "nio", "tio")
                .stream()
                .filter(word -> pattern.matcher(word).find())
                .forEach(System.out::println);

    }

}
