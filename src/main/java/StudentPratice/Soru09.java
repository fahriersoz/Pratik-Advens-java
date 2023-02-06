package StudentPratice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru09 {

    /*
    1- Verilen sayinin Faktoryel degerini bulm(5! = 1*2*3*4*5;)
    2- Verilen sayi Kadar Fibonacci Yazdirma (1, 1, 2, 3, 5, 8, 13, 21, 34, 55)
    3- Mukemmel Sayi mi (Bir sayinin bolenlerinin toplami kendisine esitse mukemmel sayidir (1+2+3=6) 28, 496 vs)
    4- Verilen sayi asal sayi mi ? (1 ve kendisinden baska sayiya bolunmeyen sayilar)
    5- Verilen Sayinin Karakokunu bulma
    6- Verilen iki sayinin ortak bolenlerini listeleme
    0- Cikis icin 0`i secin
     */

    public static void main(String[] args) {

        System.out.println("Lutfen yapmak istediginis islemi seciniz \n"+"*".repeat(30)+"\n1=>\tFonksiyon Bulma \n2=>\tFibonacci Yazdirma " +
                "\n3=>\tMukemmel Sayi mi \n4=>\tAsal sayi mi \n5=>\tSayinin Karakokunu \n6=>\tiki sayinin ortak bolenleri \n0=>\tCikis icin 0");

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Yapmak istediginiz islemi giriniz");

            int islem = input.nextInt();
            if (islem == 0) {
                System.out.println("**!!!**Programdan cikiliyor...");
                break;
            }

            switch (islem){
                case 1:
                    System.out.println("Lutfen 20`de kucuk bir sayi giriniz");
                    int s = input.nextInt();
                    fonksiyonBul(s);
                    break;
                case 2:
                    System.out.println("Kac adet Fibonacci sayisi yazdirilsin");
                    int a = input.nextInt();
                    fibonacciBul(a);
                    break;
                case 3:
                    System.out.println("Lutfen Ogrenmek istediginiz mukemmel sayiyi giriniz");
                    int b = input.nextInt();
                    mukemmelSayi(b);
                    break;
                case 4:
                    System.out.println("Asal olup olmadigini ogrenmek icin bir sayi giriniz");
                    int c = input.nextInt();
                    asalSayiMi(c);
                    break;
                case 5:
                    System.out.println("Lutfen Kare kokunu bulmak istediginiz sayiyi bulunuz");
                    int d = input.nextInt();
                    karakokBulma(d);
                    break;
                case 6:
                    System.out.println("Lutfen Ortak bolenlerini bulmak istediginiz sayiyi bulunuz");
                    int e1 = input.nextInt();
                    int e2 = input.nextInt();
                    ortakBolen(e1, e2);
                    break;
                default:
                    System.out.println("Gecersiz islem");
            }
        }while (true);

    }
    //////////////////////////////////////
    public static void fonksiyonBul (int a){        // Fonksiyon verilen sayi kadar carpmak demektir =>(5!= 1*2*3*4*5;)
        int f = 1;                                  // carpanlari olusturmak icin etkisiz eleaman olusturuyoruz
        for (int i = 1; i <= a; i++) {              // kendisinide dahil etsin diye  i <= a  yaziyoruz
            f*=i;                                   // verilen butun sayilarla carpmis olacak
        }
        System.out.println(f);
    }

    public static void fibonacciBul (int a){      //fibonacci verilen sayilari (1, 1, 2, 3, 5, 8, 13, 21, 34, 55)=> 1+1=2, >1+2=3, >2+3=5, >3+5=8...
        int x = 1;
        int y = 1;
        int f = 0;
        System.out.println(x+" "+y+" ");
        for (int i = 0; i < a-1; i++) {
            f = x+y;
            System.out.println(f);
            x = y;
            y = f;
        }
    }

    public static void mukemmelSayi (int a){        // Bir sayinin bolenlerinin toplami kendisine esitse mukemmel sayidir (1+2+3=6) 28, 496 vs)
        int toplam = 0;
        for (int i = 1; i < a; i++) {
            if (a % i==0){
                toplam+= i;
            }
        }
        if (a==toplam){
            System.out.println("Bu bir mukemmel sayidir");
        }else System.out.println("Bu bir mukemmel sayi degildir ");
    }

    public static void asalSayiMi (int a){
        boolean asal = false;
        for (int i = 2; i <a ; i++) {                    // 2 en kucuk asal sayidir
            if (a % 2==0){                               // bu araliktaki sayilar 2`ye bolunuyorsa
                asal = true;
            }
        }
        if (asal){
            System.out.println("Bu sayi bir asal sayi degildir.");
        }else System.out.println("Bu bir asal sayidir.");
    }

    public static void karakokBulma (int a){
        double karaekok = Math.sqrt(a);                      // Math.sqrt() metodu karakok bulur
        System.out.println(karaekok);
    }

    public static void ortakBolen (int a, int b){
        List<Integer> bolenler = new ArrayList<>();
        int k = Math.min(a, b);
        for (int i = 1; i <k ; i++) {
            if (a % i==0){
                if (b % i==0)
                    bolenler.add(i);
            }
        }
        System.out.println(bolenler);
    }

}
