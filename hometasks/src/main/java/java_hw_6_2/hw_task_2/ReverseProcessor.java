package java_hw_6_2.hw_task_2;

public class ReverseProcessor implements TextProcessor {

    @Override
    public String process(String text) {
        StringBuilder someString = new StringBuilder(text);
        someString.reverse();
        text = someString.toString();
        return text;
    }
}
