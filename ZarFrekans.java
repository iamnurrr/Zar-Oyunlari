import java.util.*;
public class ZarFrekans {
    public static void main(String[] args) {

        //10 kere zar atıyoruz, hangi sayıdan kaç adet geldiğini ekranda görmek istiyorum.
        //Nelere ihtiyacım var?
        //Zar atma -> rasgele sayı üretimi (1-6)
        //Her sayıdan kaç tane geldiğini tutacak değişken => Dizi
        //Dizinin uzunluğu kaç olmalı ???
        //Her gelen rakam için doğru indeksi artırmam lazım
        Random r = new Random();
        int[] frekans = {0, 0, 0, 0, 0, 0};
        for (int i = 0; i < 10; i++) {
            int a = ZarAt();
            System.out.println("Gelen zar:"+a);
            switch (a) {
                case 1:
                    frekans[0]++;
                    break;
                case 2:
                    frekans[1]++;
                    break;
                case 3:
                    frekans[2]++;
                    break;
                case 4:
                    frekans[3]++;
                    break;
                case 5:
                    frekans[4]++;
                    break;
                case 6:
                    frekans[5]++;
                    break;
            }

        }


        System.out.println("Gelen zarların frekansları:");
        for (int i = 0; i < frekans.length; i++) {

            System.out.println(i + 1 + " Gelen Zar " + frekans[i] + " Tane");
        }
    }

    public static int ZarAt() {
    Random r=new Random();
    int a=1+r.nextInt(6);
    return a;

    }

}
