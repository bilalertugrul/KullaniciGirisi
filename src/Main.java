import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String oldUsername="ertugrul", oldPassword="1234Be";
        String username, password, reset;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanici Adini Giriniz : ");
        username = input.nextLine();
        System.out.print("Sifre Giriniz : ");
        password = input.nextLine();

        if (username.equals(oldUsername) && password.equals(oldPassword)){
            System.out.println("Giris Yapildi:");
        }
        else{
            System.out.println("Yanlis Kullanici Adi ya da sifre");
            System.out.print("Sifre sifilama ister misin? Evet(1)/Hayır(2) : ");
            reset = input.nextLine();
            switch (reset){
                case "1" :
                    System.out.print("yeni sifre giriniz: ");
                    password = input.nextLine();
                    if(password.equals(oldPassword)){
                        System.out.print("eski sifreyle aynı olamaz...");
                    }
                    else{
                        System.out.print("yeni sifre basarıyla olusturuldu.");
                    }
                    break;
                case "2" :
                    System.out.print("Sifirlama iptal edildi...");
                    break;
                default:
                    System.out.print("gecersiz giris yapildi...");

            }
        }


    }
}