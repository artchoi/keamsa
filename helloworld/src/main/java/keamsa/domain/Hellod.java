package keamsa.domain;

import java.util.*;
import keamsa.infra.AbstractEvent;
import lombok.Data;

@Data
public class Hellod extends AbstractEvent {

    private Long id;
    private String hello;
}
