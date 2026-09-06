package java_hw_11.hw_task_1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        CanBeClosed browser = new MyBrowser();
        CanBeClosed file = new MyFile();

        List<CanBeClosed> canBeClosedList = new ArrayList<>();
        canBeClosedList.add(browser);
        canBeClosedList.add(file);

        SessionCloser sessionCloser = list -> list.forEach(n -> n.close());
        sessionCloser.closeSession(canBeClosedList);
    }
}