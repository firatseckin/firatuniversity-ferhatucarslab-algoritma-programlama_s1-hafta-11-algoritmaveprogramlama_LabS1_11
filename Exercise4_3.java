public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}



Çıktı Analizi:

main: print("No, I ") -> Ekranda: "No, I "

zoop() çağrılır.

baffle() -> print(" wug"), ping() -> println("."). Ekranda: " wug.\n"

print(" You wugga "). Ekranda: " You wugga "

baffle() -> print(" wug"), ping() -> println("."). Ekranda: " wug.\n"

main devam eder: print("I "). Ekranda: "I "

baffle() -> print(" wug"), ping() -> println("."). Ekranda: " wug.\n"


Tam çıktı:

No, I  wug.
 You wugga  wug.
I  wug.    
