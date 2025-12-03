1)Program main ile başlar.

2)zippo("rattle", 13) çağrılır.

3)zippo metoduna gidilir (flag=13).

4)if (flag < 0) kontrol edilir (13 < 0 yanlış).

5)else bloğuna girilir.

6)"ik" yazdırılır.

7)baffle çağrılır.

8)baffle metoduna gidilir.

9)blimp ("rattle") yazdırılır.

10)zippo("ping", -5) çağrılır.

11)zippo metoduna tekrar gidilir (flag=-5).

12)if (flag < 0) kontrol edilir (-5 < 0 doğru).

13)"ping zoop" yazdırılır.

14)İkinci zippo biter, geri dönülür.

15)baffle biter, geri dönülür.

16)İlk zippo içindeki else bloğundan devam edilir: "boo-wa-ha-ha" yazdırılır.



  
  public static void main(String[] args) {
    zippo("rattle", 13); // 1, 2
}

public static void baffle(String blimp) {
    System.out.println(blimp);      // 9
    zippo("ping", -5);              // 10
}

public static void zippo(String quince, int flag) {
    if (flag < 0) {                 // 4, 12
        System.out.println(quince + " zoop"); // 13
    } else {                        // 5
        System.out.println("ik");   // 6
        baffle(quince);             // 7
        System.out.println("boo-wa-ha-ha"); // 16
    }
}


program çıktısı:

ik
rattle
ping zoop
boo-wa-ha-ha

