//Іванов А.В. КН-2-1 Варіант 10
//Дано рядок зі слів, розділених пробілом. Замінити всі пробіли на «_».
import java.util.Scanner;

public class main {
    public static void Space_line(){
        System.out.println("________________________________________________________________________________________" +
                "_____________________________" + "\n");    }

    public static void main(String[] args) {
        Space_line();
        System.out.println("Введіть рядок слів (через пробіл): ");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String replStr1 = word.replace(' ', '_');
        Space_line();
        System.out.println(replStr1);
        Space_line();

    }
}
