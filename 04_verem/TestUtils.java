import java.util.List;

public class TestUtils {


    public static void testVerrem(){
        Verem testV = new Verem();

        assert testV.isEmpty() : "Helyes";

        testV.append(1);
        testV.append(2);
        testV.append(3);
        testV.append(4);

        assert !testV.isEmpty() : "Helyes";

        assert testV.size() == 4 :"Helyes";

        assert testV.pop() == 4 : "Helyes";
        assert testV.pop() == 3 : "Helyes";

        assert testV.toString().equals("[1, 2") : "Helyes";

        System.out.println("Teszt lefutott");
    }
}
