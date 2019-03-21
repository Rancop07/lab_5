//Іванов А.В. КН-2-1 Варіант 10
//Дано рядок зі слів, розділених пробілами. Вивести на екран всі слова-паліндроми.
import java.util.Scanner;
public class Polindrom {
    public static void Space_line(){
        System.out.println("________________________________________________________________________________________" +
                "_____________________________" + "\n");    }
    public static void main(String[] args) {
        Space_line();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть рядок слів: ");
        String word = scan.nextLine();
        Space_line();
        String[] slova = word.split(" ");
        for (int i = 0; i < slova.length; i++) {
            if(slova[i].equalsIgnoreCase(new StringBuffer(slova[i]).reverse().toString())){
                System.out.println("Слово поліндром: " + slova[i]);
            }
        }
    }
}
