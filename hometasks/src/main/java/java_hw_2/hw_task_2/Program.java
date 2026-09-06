package java_hw_2.hw_task_2;

public class Program {
    public static void main(String[] args) {
        String string = "Testing, is my favourite job";
        string = string.replace(",", "");
        int counter = 1;
        String[] words = string.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println("Word " + counter++ + " is : " + words[i].toUpperCase() + "; the length of this word is : " + words[i].length());
        }

        boolean isTrue = true;
        for (int i = 1; i < words.length; i++) {
            if (words[0].length() <= words[i].length()) {
                isTrue = !isTrue;
                break;
            }
        }
        System.out.println("The first word is longer than others - " + isTrue);
    }
}
