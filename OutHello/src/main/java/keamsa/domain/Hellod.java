package keamsa.domain;

import java.util.*;
import keamsa.domain.*;
import keamsa.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class Hellod extends AbstractEvent {

    private Long id;
    private String hello;
}
