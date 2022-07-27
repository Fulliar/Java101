package Giris;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select = 0;
        int price;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                while(select != 4){
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak Istediğiniz Tutar : ");
                            price = input.nextInt();
                            balance += price;
                            System.out.println("Güncel bakiyeniz: " + balance);
                            break;

                        case 2:
                            System.out.print("Çekmek Istediğiniz Tutar : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                                System.out.println("Güncel bakiyeniz: " + balance);
                            }

                        case 3:

                            System.out.println("Bakiyeniz : " + balance);
                            break;

                        case 4:
                            System.out.println("Tekrar görüşmek üzere");
                            break;

                        default:

                            System.out.println("Lütfen geçerli bir seçenek giriniz.");
                            break;
                    }
                }if (select == 4) {

                    break;
                }
            } else {
                right--;

                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                System.out.println("Kalan Hakkınız : " + right);
            if (right == 0) {
                System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
            }
            }
        }
    }
}