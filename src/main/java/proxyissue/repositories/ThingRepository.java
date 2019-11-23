package proxyissue.repositories;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import proxyissue.domain.Thing;

@Repository
public interface ThingRepository extends CrudRepository<Thing, Long> {

}
