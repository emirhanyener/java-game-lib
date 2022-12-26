package sglib.Developer;

import javax.swing.*;

import sglib.GameObjects;

public class GameObjectsFrame extends JFrame implements DeveloperConsole{
    JTable table = new JTable();
    String[][] rows;

    //Added gameobjects info panel
    public GameObjectsFrame(){
        this.setTitle("GameObjects Console");
        this.setBounds(10, 10, 520, 220);
        this.setLayout(null);
        
        rows = new String[GameObjects.getInstance().getObjects().size()][3];
        for(int i = 0; i < GameObjects.getInstance().getObjects().size(); i++){
            rows[i][0] = GameObjects.getInstance().getObjects().get(i).getName();
            rows[i][1] = String.valueOf(GameObjects.getInstance().getObjects().get(i).position.getX());
            rows[i][2] = String.valueOf(GameObjects.getInstance().getObjects().get(i).position.getY());
        }

        table = new JTable(rows, new String[]{"Name", "X Position", "Y Position"});
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(0,0,520,185);

        this.add(sp);
    }

    //update printed gameobject values
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
