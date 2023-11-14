import java.util.Scanner;

public class Main {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
        System.out.println("----------------------------------------------------");
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç : " + result);
        System.out.println("----------------------------------------------------");
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 1)
                break;
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç : " + result);
        System.out.println("----------------------------------------------------");
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç : " + result);
        System.out.println("----------------------------------------------------");
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Sonuç : " + result);
        System.out.println("----------------------------------------------------");
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Sonuç : " + result);
        System.out.println("----------------------------------------------------");
    }
    static void mode()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Modu alınacak sayıyı giriniz:");
        int n = input.nextInt();
        System.out.println(n + " 'in modu kaça göre alınacak");
        int r = input.nextInt();
        int res;
        res = n % r;
        System.out.println( n +" sayısının " + r + " sayısına göre modu : " + res );
        System.out.println("----------------------------------------------------");
    }
    static void rectangle()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin kenar uzunluklarını giriniz :");
        int a = in.nextInt();
        int b = in.nextInt();
        int area, perimeter;
        perimeter = 2*(a+b);
        area = a *b;
        System.out.println("Dikdörtgenin çevresi : " + perimeter);
        System.out.println("Dikdörtgenin alanı : " + area);
        System.out.println("----------------------------------------------------");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = """
                1- Toplama İşlemi
                2- Çıkarma İşlemi
                3- Çarpma İşlemi
                4- Bölme işlemi
                5- Üslü Sayı Hesaplama
                6- Faktoriyel Hesaplama
                7- Mod Alma
                8- Dikdörtgen Alan ve Çevre Hesabı
                0- Çıkış Yap""";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1 -> plus();
                case 2 -> minus();
                case 3 -> times();
                case 4 -> divided();
                case 5 -> power();
                case 6 -> factorial();
                case 7 -> mode();
                case 8 -> rectangle();
                case 0 -> {
                }
                default -> System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}