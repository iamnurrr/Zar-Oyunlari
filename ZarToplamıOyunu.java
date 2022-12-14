import java.util.*;
    public class ZarToplamıOyunu {
        public static void main(String[] args) {
            //Kullanıcıdan kaç adet zar atılacağı bilgisi girilsin.Rastgele atılan zarların toplamı alınsın.Toplam çift ise
            //bir daha zar atılsın .toplam tek olana kadar devam etsin.Tek olduğunda Toplam tektir denilsin ve şuana kadar gelen zarlar ekrana
            //yazdırılsın.Zar atma işlemi ZarAt metodu adı altında random parametre ile yapılsın.
            Scanner inp=new Scanner(System.in);
            Random r=new Random();
            boolean x;
            System.out.println("Hoşgeldiniz!!Zarların toplamı çift geldiğinde kazanırsınız!");
            System.out.println("Kaç adet zar atılacağını giriniz: ");

            int sayi=inp.nextInt();
            int [] zar=new int[sayi];
            int  dizi[]=new int[15];
            int toplam=0;
            for (int i=0;i<sayi;i++){

                zar[i]=ZarAt(r);
            }
            System.out.println("Gelen Zarlar: ");
            for (int i=0;i<sayi;i++){
                System.out.println(zar[i]);
                dizi[i]=zar[i];
                toplam=toplam+zar[i];
            }
            System.out.println("Gelen sayıların toplamı:"+toplam);
        if (toplam%2==0){
            System.out.println("Gelen zarların toplamı çifttir oyun bitti");
            x=false;
        }
            else {
            System.out.println("Gelen zarların toplamı tektir oyun devam ediyor");
            x=true;
        }
            while (x==true) {
                int a = SayiAt();
                dizi[sayi ] = a;
                if (a % 2 != 0) {
                    for (int i = 0; i < sayi+1; i++) {

                    }
                    toplam = toplam +a;
                    System.out.println("Tekrar zar atıldı gelen sayı : "+a);
                    System.out.println("Tüm Gelen zarların toplamı:" + toplam);
                    System.out.println("Tüm Gelen zarların toplamı çifttir oyun bitti");
                    System.out.println("Oluşan dizi: ");
                    for (int i = 0; i < dizi.length; i++) {
                        System.out.println(dizi[i]);

                    }
                    break;
                }
                else {
                    toplam=toplam+a;
                    System.out.println("Tekrar zar atıldı gelen sayı : "+a);
                    System.out.println("Toplam:"+toplam +"\n-Toplam tekrardan tek oldu Oyun Devam Ediyor");
                    x=true;
                }
            }

        }
        public static int ZarAt(Random r){
             int gelenzar=1+r.nextInt(6);
            return  gelenzar;

        }
        public static int SayiAt(){
            Random r=new Random();
            int a=1+r.nextInt(6);
            return a;
        }
}
