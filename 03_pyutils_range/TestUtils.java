import java.util.List;

public class TestUtils {

    public static void testRange(){
        assert PyUtils.range(5).equals(List.of(0,1,2,3,4)) : "Helyes";
        assert PyUtils.range(1,9).equals(List.of(1,2,3,4,5,6,7,8)) : "Helyes";
        assert PyUtils.range(0,20,2).equals(List.of(0,2,4,6,8,10,12,14,16,18)) : "Helyes";
        System.out.println("Teszt lefutott");
    }
}
