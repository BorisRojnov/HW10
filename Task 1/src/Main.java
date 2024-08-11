import java.util.Scanner;

public class Main {
    static String booksInfo = "";


    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            int rubCount = inputRubCount();
            //todo использовать новый метод тут
            addBook(name, pageCount, rubCount);
            printInfo();
        }
    }

    public static String inputBookName() {
        System.out.println("Введите название книги:");
        return new Scanner(System.in).nextLine();
    }

    public static int inputPageCount() {
        System.out.println("Введите кол-во страниц:");
        return new Scanner(System.in).nextInt();
    }

    public static int inputRubCount() {
        System.out.println("Введите цену книги в рублях:");
        return new Scanner(System.in).nextInt();
    }


    public static void addBook(String bookName, int pageCount, int rubCount) {
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") + " стр." +
               " - " + (rubCount ==  0 ? "не установлено" : rubCount + " руб. ") + "\n";
    }



    public static void printInfo() {
        System.out.println(booksInfo);
    }

}
