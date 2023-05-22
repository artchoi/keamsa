package keamsa.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Helloworld_table")
@Data
public class Helloworld {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Long hellodId;
    private Long worldedId;
    private String hello;
    private String world;
    private Integer count;
}
