package sglib.Developer;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.TableModel;

import sglib.GameObjects;
import sglib.Util.*;

public class GameObjectsFrame extends JFrame {
    public GameObjectsFrame(){
        this.setTitle("GameObjects Console");
        this.setBounds(10, 10, 300, 600);
        this.setLayout(new FlowLayout());
        //GameObjects.getInstance().getObjects().toArray()
        String[][] rows = new String[GameObjects.getInstance().getObjects().size()][2];
        for(int i = 0; i < GameObjects.getInstance().getObjects().size(); i++){
            rows[i][0] = GameObjects.getInstance().getObjects().get(i).getName();
            rows[i][1] = GameObjects.getInstance().getObjects().get(i).position.getX() + ", " + GameObjects.getInstance().getObjects().get(i).position.getY();
        }
        
        JTable table = new JTable(rows, new String[]{"Name", "Position"});
        this.add(table);
    }
}
