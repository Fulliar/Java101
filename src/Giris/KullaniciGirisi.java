package Giris;
import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args){
        String userName, password;

        Scanner inp = new Scanner(System.in);

        String passwordValue = "java123";
        String userNameValue = "patika";

        System.out.println("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.println("Şifreniz : ");
        password = inp.nextLine();

        if(userName.equals(userNameValue) && password.equals(passwordValue)){
            System.out.println("Giriş Yaptınız !");
        } else {
            System.out.println("Bilgileriniz Yanlış !");

            if(userName.equals(userNameValue)){

                System.out.println("Hatalı şifre girdiniz yeni şifre belirtmek isterseniz 1'e basınız, istemezseniz 2'ye basınız.");
                String PasswordSecim = inp.nextLine();

                if(PasswordSecim.equals("2")) {
                    System.out.println("Girişinz sonlandırıldı.");
                } else if (PasswordSecim.equals("1")) {
                    System.out.println("yeni şifrenizi yazınız");
                    String newPassword = inp.nextLine();
                    if (newPassword.equals(passwordValue)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        passwordValue = newPassword;
                        System.out.println("Şifreniz başarıyla değiştirilmiştir.");
                        System.out.println("Yeni şifreniz : " + passwordValue );
                    }
                }
            }
        }
    }
}

