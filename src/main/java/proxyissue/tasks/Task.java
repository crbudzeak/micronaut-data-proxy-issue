package proxyissue.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import proxyissue.repositories.ThingRepository;

import javax.inject.Inject;

public abstract class Task implements Runnable {

	static final Logger log = LoggerFactory.getLogger(Task.class);

	@Inject
	ThingRepository thingRepository;
}
