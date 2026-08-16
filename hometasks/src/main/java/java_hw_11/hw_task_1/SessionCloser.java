package java_hw_11.hw_task_1;

import java.util.List;

@FunctionalInterface
public interface SessionCloser {
    void closeSession(List<CanBeClosed> entities);
}
