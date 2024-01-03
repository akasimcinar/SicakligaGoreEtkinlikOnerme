import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Derece : ");
        int sicaklik = scan.nextInt();
        String event = "";

        if (sicaklik < 5) {
            System.out.println("Kayak");
        }else if (sicaklik < 15) {
            System.out.println("Tiyatro");
        } else if (sicaklik < 25 ) {
            System.out.println("Mangal");
        }else{
            System.out.println("Yüzme");
    }
        System.out.println("Önerilen etkinlik :" + event);
    }

    }
