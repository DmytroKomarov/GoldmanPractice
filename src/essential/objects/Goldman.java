package essential.objects;

import essential.Map;
import essetial_new_structure.objects.enums.Direction;

import javax.swing.*;

/**
 * Created by Asus on 10.09.2020.
 */
public class Goldman extends AbstractMovableObject {

    public Goldman(Map map) {
        super(map);
        setImage(new ImageIcon(getClass().getResource("/images/goldman_up.png")));
    }

    @Override
    public void move(Direction2 direction) throws Exception {

        int x = getX();
        int y = getY();

        Ground ground = new Ground(getMap());

        switch (direction) {
            case UP:
                y--;
                break;
            case DOWN:
                y++;
                break;
            case LEFT:
                x--;
                break;
            case RIGHT:
                x++;
                break;
        }

        if (getMap().getObjectsByCoordinate(y,x) !=null && getMap().getObjectsByCoordinate(y,x).getClass() == Ground.class) {
            getMap().setObjectByCoordinate(getY(), getX(), ground);
            getMap().setObjectByCoordinate(y, x, this);
            getMap().drawTable();
            Thread.sleep(300);
        }
    }

}
