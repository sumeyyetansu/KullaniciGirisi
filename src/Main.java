import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName1, password1 , passwordReset , passwordNew , passwordNew1 , evet;
        String userName = "patika";
        String password = "java123";


        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Kullanıcı adınız : ");
            userName1 = scanner.nextLine();

            System.out.print("Şifreniz : ");
            password1 = scanner.nextLine();

            if (userName.equals(userName1) && password.equals(password1)) {
                System.out.println("Giriş yaptınız");
                break;

            } else if (userName.equals(userName1) && !password.equals(password1)) {
                System.out.print("Girdiğiniz şifre yanlış! \nŞifrenizi sıfırlamak ister misiniz? (evet yada hayır) şeklinde cevaplayın: ");
                passwordReset= scanner.nextLine();

                if (passwordReset.equals("evet")){


                while (true) {
                    System.out.print("Belirlediğiniz yeni şifrenizi giriniz : ");
                    passwordNew = scanner.nextLine();

                    System.out.print("Belirlediğiniz yeni şifreyi tekrar giriniz : ");
                    passwordNew1 = scanner.nextLine();


                    if (!passwordNew.equals(passwordNew1)) {
                        System.out.println("Şifre oluşturulamadı. Girdiğiniz şifreler uyuşmamaktadır. Lütfen tekrar deneyiniz !");

                    } else if ((passwordNew.equals(password)) && (passwordNew1.equals(password))) {

                        System.out.println("Şifre oluşturulamadı.Girdiğiniz şifre eski şifrenizle aynı olmamalıdır.");

                   } else {
                        System.out.println("Şifre oluşturuldu.");
                        password = passwordNew1;
                        break;
                        }

                    }
                }
                if (passwordReset.equals("hayır")){
                    System.out.println("Lütfen tekrar deneyiniz.");
                }
                else {
                    System.out.println("Lütfen gerçerli bir seçenek giriniz.");
                }

           } else if (!userName.equals(userName1) && password.equals(password1)) {

                System.out.println("Kullanıcı adınız yanlış.Tekrar deneyiniz!");

            }
            else {
                System.out.println("Bilgileriniz yanlış.Lütfen kontrol ediniz.");
            }
        }

    }
}