package sglib.Developer;

import javax.swing.*;

import sglib.GameObjects;

public class PhysicsFrame extends JFrame implements DeveloperConsole{
    JTable table = new JTable();
    String[][] rows;

    //Added physics info panel
    public PhysicsFrame(){
        this.setTitle("Physics Console");
        this.setBounds(10, 220, 520, 220);
        this.setLayout(null);
        
        rows = new String[GameObjects.getInstance().getPhysics().size()][4];
        for(int i = 0; i < GameObjects.getInstance().getPhysics().size(); i++){
            rows[i][0] = GameObjects.getInstance().getPhysics().get(i).getObject().getName();
            rows[i][1] = String.valueOf(GameObjects.getInstance().getPhysics().get(i).velocity.getX());
            rows[i][2] = String.valueOf(GameObjects.getInstance().getPhysics().get(i).velocity.getY());
            rows[i][3] = String.valueOf(GameObjects.getInstance().getPhysics().get(i).getMass());
        }
        
        table = new JTable(rows, new String[]{"Name", "X Velocity", "Y Velocity", "Mass"});
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(0,0,520,185);

        this.add(sp);
    }

    //update printed physics values
    @Override
    public void update() {
        for(int i = 0; i < GameObjects.getInstance().getPhysics().size(); i++){
            table.setValueAt(GameObjects.getInstance().getPhysics().get(i).getObject().getName(), i, 0);
            table.setValueAt(String.valueOf(GameObjects.getInstance().getPhysics().get(i).velocity.getX()), i, 1);
            table.setValueAt(String.valueOf(GameObjects.getInstance().getPhysics().get(i).velocity.getY()), i, 2);
            table.setValueAt(String.valueOf(GameObjects.getInstance().getPhysics().get(i).getMass()), i, 3);
            table.putClientProperty(rootPane, accessibleContext);
        }
    }
}
