import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * ЗАДАНИEРеверс строки:
         * Напишите метод, который принимает строку и использует StringBuilder для её реверса. Метод должен
         * возвращать реверсированную строку.
         * public static String reverseString(String input) {
         *  // Ваш код здесь
         * }
         * Удаление дубликатов:
         * Напишите метод, который принимает строку и удаляет из неё все повторяющиеся символы, используя
         * StringBuilder. Метод должен возвращать строку без дубликатов.
         * Copy code
         * public static String removeDuplicates(String input) {
         *  // Ваш код здесь
         *
         */
        Scanner scanner = new Scanner(System.in);
          while(true) {
              System.out.println("""
                      Which one do you wanna select.
                      1.Reverse string
                      2.Remove duplicates""");
              int choice = scanner.nextInt();
              scanner.nextLine();
              switch (choice) {
                  case 1:
                      System.out.println("Enter words: ");
                      String reverse = scanner.nextLine();
                      System.out.println(Student.reverseString(reverse));
                      break;
                  case 2:
                      System.out.println("Enter words: ");
                      String remove = scanner.nextLine();
                      System.out.println(Student.removeDuplicates(remove));
                      break;

              }
          }
    }

}