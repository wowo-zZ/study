import java.io.Console;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.IOException;

public class InputOutput {
    public static void main (String[] args) {
        InputOutput io = new InputOutput();
        // io.testScanner();
        // io.testConsole();
        io.testFileReadAndWrite();
    }

    private void testFileReadAndWrite() {
        try {
            Scanner sc = new Scanner(Paths.get("./java/file/input.txt"));
            System.out.println(sc.nextLine());
            sc.close();

            PrintWriter pw = new PrintWriter("./java/file/output.txt");
            pw.println("this is a test output Line");
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void testConsole() {
        Console cs = System.console();
        String username = cs.readLine("please input your username: ");
        char[] pwd = cs.readPassword("please input your password: ");
        System.out.println(username);
        // how to trans an array of char to a string?
        System.out.println(pwd.toString());
    }


    private void testScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input you name:");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        System.out.println("how old are you ?");
        int age = sc.nextInt();
        System.out.println(String.format("Oh yeah, you are %d years old", age));
        System.out.println("Do you have any problem else?");
        if (!sc.hasNextInt()) {
            System.out.println("Goodbye ~");
        }
        sc.close();
    }
}
