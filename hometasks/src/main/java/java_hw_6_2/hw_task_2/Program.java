package java_hw_6_2.hw_task_2;

public class Program {
    public static void main(String[] args) {
        String someStringForExample = " Some. string for example. how works this. methods ";

        TextProcessor upperCaseExample = new UpperCaseProcessor();
        System.out.println(upperCaseExample.removeDigits(someStringForExample));
        System.out.println(upperCaseExample.process(someStringForExample));

        TextProcessor reverseExample = new ReverseProcessor();
        System.out.println(reverseExample.removeDigits(someStringForExample));
        System.out.println(reverseExample.process(someStringForExample));

        TextProcessor trimExample = new TrimProcessor();
        System.out.println(trimExample.removeDigits(someStringForExample));
        System.out.println(trimExample.process(someStringForExample));
    }
}
