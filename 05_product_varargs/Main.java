public class Main
{
    public static void main(String[] args)
    {
        assert product(1,2,3,4,5) == 120 : "Helyes";
        assert product(2,4,10) == 80 : "Helyes";
        assert product(5,30,10) == 1500 : "Helyes";
        assert product(100,4,3) == 1200 : "Helyes";
        assert product() == 1 : "Helyes";

        System.out.println(product());                      // 1
        System.out.println(product(2));            // 2
        System.out.println(product(2, 5));         // 10
        System.out.println(product(2, 5, 10));     // 100
        System.out.println(product(2, 5, 10, 3));  // 300
    }

    private static int product(int... args)
    {
        int p = 1;
        for (int n : args) {
            p *= n;
        }
        return p;
    }
}
