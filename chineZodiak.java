import java.util.Scanner;

public class chineZodiak {
    public static void main(String[] args) {

        int date, birthday;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz :");
        date = input.nextInt();

        birthday = date % 12;


        switch (birthday) {
            case 0:
                System.out.print("Çin Zodyağı Burcunuz : monkey" );
                break;
            case 1:
                System.out.print("Çin Zodyağı Burcunuz : cockerel");
                break;
            case 2:
                System.out.print("Çin Zodyağı Burcunuz : dog");
                break;
            case 3:
                System.out.print("Çin Zodyağı Burcunuz : pig");
                break;
            case 4:
                System.out.print("Çin Zodyağı Burcunuz : mouse");
                break;
            case 5:
                System.out.print("Çin Zodyağı Burcunuz : cow");
                break;
            case 6:
                System.out.print("Çin Zodyağı Burcunuz : tiger");
                break;
            case 7:
                System.out.print("Çin Zodyağı Burcunuz : rabbit");
                break;
            case 8:
                System.out.print("Çin Zodyağı Burcunuz : dragon");
                break;
            case 9:
                System.out.print("Çin Zodyağı Burcunuz : snake");
                break;
            case 10:
                System.out.print("Çin Zodyağı Burcunuz : horse");
                break;
            case 11:
                System.out.print("Çin Zodyağı Burcunuz :  sheep");
                break;
        }


    }
}
