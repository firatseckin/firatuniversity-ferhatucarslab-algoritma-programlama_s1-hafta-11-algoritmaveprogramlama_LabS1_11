public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        // TODO
        return 0.0;
    }

    public static double expSum(double x) {
        // TODO
        return 0.0;
    }

    public static void main(String[] args) {
        // TODO: test methods
    }
}


public class Multadd {

    public static void main(String[] args) {
        // Basit test
        System.out.println("1 * 2 + 3 = " + multadd(1.0, 2.0, 3.0));

        // Görev 4: sin(pi/4) + cos(pi/4)/2
        // a = sin(pi/4), b = 1 (etkisiz), c = cos(pi/4)/2 
        // VEYA a = cos(pi/4), b = 0.5, c = sin(pi/4) (Daha uygun format)
        double part1 = multadd(Math.cos(Math.PI / 4), 0.5, Math.sin(Math.PI / 4));
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + part1);

        // Görev 4: log(10) + log(20)
        // a = 1, b = log(10), c = log(20)
        double part2 = multadd(1.0, Math.log(10), Math.log(20));
        System.out.println("log(10) + log(20) = " + part2);

        // Görev 5: expSum testi
        // Örneğin x = 1 için test edelim
        System.out.println("expSum(1) = " + expSum(1.0));
    }

    // multadd metodu: a * b + c
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    // expSum metodu: x * e^-x + sqrt(1 - e^-x)
    public static double expSum(double x) {
        double eNegX = Math.exp(-x); // e^-x işlemini değişkene atadık
        double sqrtPart = Math.sqrt(1.0 - eNegX); // Karekök kısmı (c)
        
        // Formülü multadd'e uyduruyoruz:
        // a = x
        // b = e^-x
        // c = sqrt(1 - e^-x)
        return multadd(x, eNegX, sqrtPart);
    }
}
