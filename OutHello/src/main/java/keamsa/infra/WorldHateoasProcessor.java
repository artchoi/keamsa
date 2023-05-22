package keamsa.infra;

import keamsa.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class WorldHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<World>> {

    @Override
    public EntityModel<World> process(EntityModel<World> model) {
        return model;
    }
}
