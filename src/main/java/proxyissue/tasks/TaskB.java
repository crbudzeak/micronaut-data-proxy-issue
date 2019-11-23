package proxyissue.tasks;

import io.micronaut.context.annotation.Prototype;
import proxyissue.domain.Thing;

@Prototype
public class TaskB extends Task {

	@Override
	public void run() {
		Thing thing = new Thing(String.format("TaskB %d", System.currentTimeMillis()));
		log.info(thingRepository.save(thing).toString());
	}
}
