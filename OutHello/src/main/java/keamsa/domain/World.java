package keamsa.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import keamsa.OutHelloApplication;
import keamsa.domain.Worlded;
import lombok.Data;

@Entity
@Table(name = "World_table")
@Data
public class World {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String world;

    private Integer count;

    @PostPersist
    public void onPostPersist() {
        Worlded worlded = new Worlded(this);
        worlded.publishAfterCommit();
    }

    public static WorldRepository repository() {
        WorldRepository worldRepository = OutHelloApplication.applicationContext.getBean(
            WorldRepository.class
        );
        return worldRepository;
    }
}
