package essential.objects;

import essential.Map;
import essetial_new_structure.objects.enums.Direction;

public abstract class AbstractMovableObject extends AbstractGameObject {

    public AbstractMovableObject(Map map) {
        super(map);
    }

    public abstract void move(Direction2 direction) throws Exception;

}
