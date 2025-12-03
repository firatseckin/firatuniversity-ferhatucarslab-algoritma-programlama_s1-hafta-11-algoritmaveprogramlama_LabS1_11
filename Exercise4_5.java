public class Exercise4_5 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("just for", bizz);
        clink(2 * buzz);
    }

    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast ", fork);
    }

    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }
}


Program Çıktısı:

main başlar: bizz=5, buzz=2.

zoop("just for", 5) çağrılır.

print(fred) -> "just for" (ve alt satıra geçer).

bob (5) == 5 olduğundan ping("not") çağrılır.

ping: " any not more " (ve alt satıra geçer).

main devam eder: clink(2 * 2) yani clink(4) çağrılır.

clink(4):

print("It's ") -> "It's " (satır sonu yok).

zoop("breakfast", 4) çağrılır.

zoop: print("breakfast") -> "breakfast" (ve alt satıra geçer).

bob (4) == 5 yanlış. else çalışır.

print("!") -> "!" (ve alt satıra geçer).


Tam çıktı:
just for
 any not more 
It's breakfast
!

    
