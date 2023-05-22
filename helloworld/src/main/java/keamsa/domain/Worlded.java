package keamsa.domain;

import java.util.*;
import keamsa.infra.AbstractEvent;
import lombok.Data;

@Data
public class Worlded extends AbstractEvent {

    private Long id;
    private String world;
    private Integer count;
}
