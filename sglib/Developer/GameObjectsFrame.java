package sglib.Developer;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import sglib.GameObjects;
import sglib.Util.*;

public class GameObjectsFrame extends JFrame implements DeveloperConsole{
    JTable table = new JTable();
    String[][] rows;

    public GameObjectsFrame(){
        this.setTitle("GameObjects Console");
        this.setBounds(10, 10, 500, 600);
        this.setLayout(new FlowLayout());
        //GameObjects.getInstance().getObjects().toArray()
        rows = new String[GameObjects.getInstance().getObjects().size()][3];
        for(int i = 0; i < GameObjects.getInstance().getObjects().size(); i++){
            rows[i][0] = GameObjects.getInstance().getObjects().get(i).getName();
            rows[i][1] = String.valueOf(GameObjects.getInstance().getObjects().get(i).position.getX());
            rows[i][2] = String.valueOf(GameObjects.getInstance().getObjects().get(i).position.getY());
        }
        table = new JTable(rows, new String[]{"Name", "X Position", "Y Position"});
        JScrollPane sp = new JScrollPane(table);

        this.add(sp);
    }

    @Override
    public void update() {
        for(int i = 0; i < GameObjects.getInstance().getObjects().size(); i++){
            table.setValueAt(GameObjects.getInstance().getObjects().get(i).getName(), i, 0);
            table.setValueAt(String.valueOf(GameObjects.getInstance().getObjects().get(i).position.getX()), i, 1);
            table.setValueAt(String.valueOf(GameObjects.getInstance().getObjects().get(i).position.getY()), i, 2);
            table.putClientProperty(rootPane, accessibleContext);
        }
    }
}