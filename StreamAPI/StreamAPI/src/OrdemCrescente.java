import java.util.stream.Stream;

public class OrdemCrescente {
    
    public static void main(String[] args) throws Exception {
        Stream<Integer> numeros = Stream.of(1,2,3,4,5,6,7,8,9,10,5,4,3);
        numeros.sorted().forEach(System.out::println);
    }
}
