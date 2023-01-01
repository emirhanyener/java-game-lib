package sglib.Developer;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import sglib.GameObjects;
import sglib.Util.GameObject;

public class GameObjectsFrame extends JFrame implements DeveloperConsole{
    JTable table = new JTable();
    String[][] rows;
    DefaultTableModel model;

    //Added gameobjects info panel
    public GameObjectsFrame(){
        this.setTitle("GameObjects Console");
        this.setBounds(10, 10, 520, 220);
        this.setLayout(null);
        model = (DefaultTableModel)table.getModel();
        model.addColumn("Name");
        for (GameObject item : GameObjects.getInstance().getObjects()) {
            model.addRow(new String[]{item.getName()});
        }
        table.setModel(model);

        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(0,0,520,185);

        this.add(sp);
    }

    //update printed gameobject values
    @Override
    public void update() {
        int counter = model.getRowCount();
        for (int i = 0; i < counter; i++) {
            model.removeRow(0);
        }
        for (GameObject item : GameObjects.getInstance().getObjects()) {
            model.addRow(new String[]{item.getName()});
        }
    }
}
