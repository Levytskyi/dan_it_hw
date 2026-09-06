package java_hw_2.hw_task_3;

public class Program {
    public static void main(String[] args) {
        String newString = "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method.";
        String[] arrayOfString = newString.split("");
        int amount = 0;

        for (int i = 0; i < arrayOfString.length; i++) {
            if (arrayOfString[i].toLowerCase().equals("a")) {
                amount++;
            }
        }
        System.out.println(amount);
    }
}
