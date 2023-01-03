package sglib.Developer;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import sglib.GameObjects;
import sglib.Util.Physics;

public class PhysicsFrame extends JFrame implements DeveloperConsole{
    JTable table = new JTable();
    DefaultTableModel model;

    //Added physics info panel
    public PhysicsFrame(){
        this.setTitle("Physics Console");
        this.setBounds(10, 220, 520, 220);
        this.setLayout(null);

        
        model = (DefaultTableModel)table.getModel();
        model.addColumn("Name");
        model.addColumn("X Velocity");
        model.addColumn("Y Velocity");
        model.addColumn("Mass");
        for (Physics item : GameObjects.getInstance().getPhysics()) {
            model.addRow(new String[]{item.getObject().getName(), String.valueOf(item.velocity.getX()), String.valueOf(item.velocity.getY()), String.valueOf(item.getMass())});
        }
        table.setModel(model);
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(0,0,520,185);

        this.add(sp);
    }

    //update printed physics values
    @Override
    public void update() {
        int counter = model.getRowCount();
        for (int i = 0; i < counter; i++) {
            model.removeRow(0);
        }
        for (Physics item : GameObjects.getInstance().getPhysics()) {
            model.addRow(new String[]{item.getObject().getName(), String.valueOf(item.velocity.getX()), String.valueOf(item.velocity.getY()), String.valueOf(item.getMass())});
        }
    }
}
