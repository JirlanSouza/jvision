package com.jvision.tasks.imageInspection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Component;

@Component
public class ImageInpection {
    @Autowired
    private TaskExecutor taskExecutor;

    @EventListener(ApplicationReadyEvent.class)
    public void onStarted() {
        taskExecutor.execute(() -> {
            var count = 0;
            System.out.println("Started");

            while (true) {
                System.out.println("Runing with count: " + count);

                try {
                    Thread.sleep(1000, 0);
                } catch (Exception e) {
                    System.err.println(e);
                }
                count++;
            }
        });
    }
}
