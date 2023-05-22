package keamsa.domain;

import java.util.*;
import keamsa.domain.*;
import keamsa.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class Worlded extends AbstractEvent {

    private Long id;
    private String world;
    private Integer counter;

    public Worlded(World aggregate) {
        super(aggregate);
    }

    public Worlded() {
        super();
    }
}
