public class TestUtils {

    public static void testDuplaz(){
        assert MyUtils.duplaz(2)  == 4: "Helyes";
        assert MyUtils.duplaz(4)  == 8: "Helyes";
        assert MyUtils.duplaz(7)  == 14: "Helyes";
        assert MyUtils.duplaz(0)  == 0: "Helyes";
        System.out.println("Teszt lefutott");
    }
    public static void testStrlen(){
        assert MyUtils.strlen("szoveg") == 6 : "Helyes";
        assert MyUtils.strlen("hello") == 5 : "Helyes";
        assert MyUtils.strlen("alma") == 4 : "Helyes";
        assert MyUtils.strlen("animal") == 6 : "Helyes";
        assert MyUtils.strlen("programming") == 11 : "Helyes";
        System.out.println("Teszt lefutott");
    }

    public static void testAbs(){
        assert Math.abs(-5) == 5 : "Helyes";
        assert Math.abs(-6) == 6 : "Helyes";
        assert Math.abs(12) == 12 : "Helyes";
        assert Math.abs(-56) == 56 : "Helyes";
        assert Math.abs(125) == 125 : "Helyes";
        System.out.println("Teszt lefutott");

    }
    public static void testMax(){

        assert Math.max(12,10) == 12 : "Helyes";
        assert Math.max(13,0) == 13 : "Helyes";
        assert Math.max(31,44) == 44 : "Helyes";
        assert Math.max(234,623) == 623 : "Helyes";
        assert Math.max(123,5) == 123 : "Helyes";
        System.out.println("Teszt lefutott");



    }

}
