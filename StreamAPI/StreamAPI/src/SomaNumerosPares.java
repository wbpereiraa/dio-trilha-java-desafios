import java.util.stream.Stream;

public class SomaNumerosPares {
   
    public static void main(String[] args) throws Exception {
        Stream<Integer> numeros = Stream.of(1,2,3,4,5,6,7,8,9,10,5,4,3);
        System.out.println(numeros.filter(n -> n % 2 == 0).reduce(0, (a, b) -> a + b));
    }
}
