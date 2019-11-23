package proxyissue;

import io.micronaut.context.ApplicationContext;
import io.micronaut.scheduling.annotation.Scheduled;
import proxyissue.tasks.Task;
import proxyissue.tasks.TaskA;
import proxyissue.tasks.TaskB;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Singleton
public class Runner {
	private Executor executor = Executors.newFixedThreadPool(2);
	private Class[] taskClasses = new Class[] {TaskA.class, TaskB.class};

	@Inject
	ApplicationContext applicationContext;

	@Scheduled(initialDelay = "1s", fixedDelay = "1s")
	void run() {
		for(Class clazz: taskClasses) {
			Task task = (Task) applicationContext.getBean(clazz);
			executor.execute(task);
		}
	}
}
