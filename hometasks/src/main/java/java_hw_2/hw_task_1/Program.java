package java_hw_2.hw_task_1;

public class Program {
    public static void main(String[] args) {
        String string1 = "This line that i want to cut, cause it is too long";
        String string2 = string1.substring(0, 35);
        String string3 = string2.concat(" it is perfect");

        System.out.println("The first value is : " + string1 + "; length : " + string1.length());
        System.out.println("The second value is : " + string2 + "; length : " + string2.length());
        System.out.println("The third value is  : " + string3 + "; length : " + string3.length());
    }
}
