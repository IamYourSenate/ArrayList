import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Poland");
        countries.add("Germany");
        countries.add("Spain");
        countries.add("France");

        System.out.println("______ex1________");

        countries.forEach(country -> System.out.println(country));

        System.out.println("______ex2________");
        countries.add(1,"<3");
        countries.forEach(country -> System.out.println(country));

        System.out.println("_______ex3__________");

        countries.remove(3);
        countries.forEach(country -> System.out.println(country));

        System.out.println("________ex4_________");
        Collections.sort(countries);
        System.out.println(countries);
        System.out.println("________ex4.1______");
        System.out.println(countries.get(0));
        System.out.println("________ex4.2_____");
        countries.clear();
        System.out.println(countries);
        System.out.println("_________ex5________");

        Collections.reverse(countries);
        System.out.println(countries);
        System.out.println("________ex6________");

        List<String> cities = new ArrayList<>();
        cities.add("Krakow");
        cities.add("Wroclaw");
        cities.add("Warsaw");
        cities.add("Poznan");


        System.out.println(countries.equals(cities));

        List<Double> digits = new ArrayList<>(100);

        for (int i = 0;i < 100; i++){
            digits.add(i,0+10*(Math.random()));


        }
        System.out.println(digits);

        public Object cloneArr(){
                ArrayList<?> v = new (ArrayList<?>);
                v.elementData = Arrays.copyOf(elementData, size);
                v.modCount = 0;
                return v;

        }


    }






}
