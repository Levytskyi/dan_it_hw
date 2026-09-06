package java_hw_3.hw_task_6;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your program please! IntelliJ IDEA, Git or Java");
        String prog = scanner.nextLine();
        System.out.println("Enter your OS please! Windows, Linux or Mac");
        String os = scanner.nextLine();

        System.out.println(program(prog, os));
    }

    public static String program(String prog, String os) {
        switch (prog) {
            case "IntelliJ IDEA":
                if (os.toLowerCase().equals("windows")) {
                    return "https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows";
                } else if (os.toLowerCase().equals("linux")) {
                    return "https://www.jetbrains.com/idea/download/download-thanks.html?platform=linux";
                } else if (os.toLowerCase().equals("mac")) {
                    return "https://www.jetbrains.com/idea/download/download-thanks.html?platform=mac";
                } else {
                    return "Your os version doesn't support!";
                }
            case "Git":
                if (os.toLowerCase().equals("windows")) {
                    return "https://git-scm.com/install/windows";
                } else if (os.toLowerCase().equals("linux")) {
                    return "https://git-scm.com/install/linux";
                } else if (os.toLowerCase().equals("mac")) {
                    return "https://git-scm.com/install/mac";
                } else {
                    return "Your os version doesn't support!";
                }
            case "Java":
                if (os.toLowerCase().equals("windows")) {
                    return "https://www.oracle.com/pl/java/technologies/downloads/#jdk26-windows";
                } else if (os.toLowerCase().equals("linux")) {
                    return "https://www.oracle.com/pl/java/technologies/downloads/#jdk26-linux";
                } else if (os.toLowerCase().equals("mac")) {
                    return "https://www.oracle.com/pl/java/technologies/downloads/#jdk26-mac";
                } else {
                    return "Your os version doesn't support!";
                }
            default:
                return "The entered program doesn't exist!";
        }
    }
}
