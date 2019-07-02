package lambda;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Task {

    @Schedule(dayOfWeek = 3, hour = 20)
    @Schedule(dayOfWeek = 4, hour = 21)
    public void run() {
        System.out.println("执行任务...");
    }

    public static void main(String[] args) {
        try {
            Method method = Task.class.getMethod("run");
            for (Annotation annotation : method.getAnnotations()) {
                System.out.println(annotation);
            }

            for (Schedule schedule : method.getAnnotationsByType(Schedule.class)) {
                System.out.println(schedule.dayOfWeek() + "|" + schedule.hour());
            }

        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }
}
