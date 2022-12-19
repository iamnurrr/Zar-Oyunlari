import java.util.*;
public class ZarFrekans2 {

    public static void main(String[] args) {
// iki zar rastgele olarak atılacak.Eğer ikisi de aynı çift sayı ise oyun biter.
        //Değilse zar atılmaya devam eder ve atılan zarların toplamının frekansı tutulur.oyun bittiğinde
        //frekanslar ekrana yazdırılır.

        int zar1;
        int zar2;
        int[] frekans=new int[11];

        while (true) {
            zar1 = zarAt();
            zar2 = zarAt();
            int zarToplam = zar2 + zar1;

            if (zar1 % 2 == 0 && zar2 == zar1) {
                System.out.println("Oyun bitti !!\n Gelen zarlar : 1.zar: " + zar1 + "; 2.zar: " + zar2);
                break;

            }
            else {

                System.out.println("Oyun devam ediyor");
                System.out.println("Gelen zarlar: \n zar1: "+zar1+" zar2: "+zar2);
            }
            frekans[zar2+zar1-2]++;
        }

        for (int i=0;i< frekans.length;i++){
            System.out.println("Frekans: "+(i+2)+":"+frekans[i]);
        }
    }

    public static int zarAt(){
        Random r=new Random();
        return 1+r.nextInt(6);

    }
}
