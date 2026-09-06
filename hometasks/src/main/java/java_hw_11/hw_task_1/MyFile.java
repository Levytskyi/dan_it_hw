package java_hw_11.hw_task_1;

public class MyFile implements CanBeClosed {

    @Override
    public void close() {
        System.out.println("File closed");
    }
}
