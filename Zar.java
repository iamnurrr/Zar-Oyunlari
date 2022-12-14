import java.util.*;
public class Zar {
    private enum Durum {Devam, Kazan, Kaybet}

    public static void main(String[] args) {

        Random r = new Random();
        int puan = 0;
        Durum oyunDurumu;
        int zarToplami = Myclass.zarAt(r);
        System.out.println("Toplam=" + zarToplami);
        switch (zarToplami) {
            case 7:
            case 11:
                oyunDurumu = Durum.Kazan;
                System.out.println("Zar toplamınız ilk turda 7 veya 11 olduğundan; ");
            break;
            case 2:
            case 3:
            case 12:
                oyunDurumu=Durum.Kaybet;
                System.out.println("Zar toplamınız ilk turda 2-3-12 den biri olduğundan; ");
                break;
            default:oyunDurumu=Durum.Devam;
                System.out.println("Zar toplamınız puan olarak eklendi oyun devam ediyor...");
            puan=zarToplami;
                System.out.println("Puan:"+puan);
        }

        while (oyunDurumu==Durum.Devam){
            zarToplami=Myclass.zarAt(r);
            System.out.println("Yeni Toplam="+zarToplami);
            if(zarToplami==puan){
                oyunDurumu=oyunDurumu.Kazan;
                System.out.println("Tekrar atılan zar toplamınız puanınıza eşit olduğundan; ");
            }
                else if(zarToplami==7){
                    oyunDurumu=oyunDurumu.Kaybet;
                System.out.println("Tekrar atılan zar toplamınız 7'ye eşit olduğundan; ");
                }
                else {
                System.out.println("Oyun Devam ediyor...");
            }
            }
        if(oyunDurumu==oyunDurumu.Kaybet){
            System.out.println("KAYBETTİNİZ");}

            else System.out.println("KAZANDINIZ");


        }
    }
