package sglib.Container;

import sglib.GameObjects;
import sglib.Util.GameObject;

public abstract class GameObjectContainer extends Container<GameObject> {
    @Override
    protected void createAll() {
        GameObjects.getInstance().getObjects().addAll(this.objects);
    }
}
