package keamsa.domain;

import keamsa.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "worlds", path = "worlds")
public interface WorldRepository
    extends PagingAndSortingRepository<World, Long> {}
