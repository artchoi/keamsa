package keamsa.infra;

import java.util.List;
import keamsa.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "helloworlds",
    path = "helloworlds"
)
public interface HelloworldRepository
    extends PagingAndSortingRepository<Helloworld, Long> {
    List<Helloworld> findByHellodId(Long hellodId);
    List<Helloworld> findByWorldedId(Long worldedId);
}
