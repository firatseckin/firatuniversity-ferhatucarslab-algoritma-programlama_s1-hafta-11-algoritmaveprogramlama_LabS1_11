public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();
        Java'da bu hata vermez. Metot çalışır, hesaplamayı yapar, değeri döndürür ancak bu değer hiçbir değişkene atanmadığı için kaybolur (garbage collected).
        // 2) void metodu ifade icinde kullanin -> ne oluyor?
            Derleme hatası (Compiler Error) alırsınız. Hata mesajı genellikle "operator + cannot be applied to void and int" (operatör + void ve int tiplerine uygulanamaz) şeklindedir. Çünkü void metotlar bir değer üretmez, dolayısıyla matematiksel bir işleme giremezler.
        // System.out.println(sayHello() + 7);

        // Cevaplarinizi yorum olarak ekleyin.
    }
}
