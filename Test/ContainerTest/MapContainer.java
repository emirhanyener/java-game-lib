package Test.ContainerTest;

import sglib.Container.GameObjectContainer;
import sglib.Util.GameObject;
import sglib.Util.Position;
import sglib.Util.Size;

public class MapContainer extends GameObjectContainer{
    @Override
    public void container() {
        addContainer(new GameObject("o1", new Position(0, 0), new Size(500, 50)));
        addContainer(new GameObject("o2", new Position(0, 200), new Size(250, 50)));
        addContainer(new GameObject("o3", new Position(0, 300), new Size(125, 50)));
    }
}
