package sglib.Developer;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import sglib.GameObjects;

public class DeveloperFrame extends JFrame{
    private static DeveloperFrame frame = null;
    public GameObjectsFrame gameObjectsFrame = null;
    public PhysicsFrame physicsFrame = null;

    private DeveloperFrame(){
        this.setTitle("Developer Console");
        this.setBounds(10, 10, 300, 600);
        this.setLayout(new FlowLayout());
        gameObjectsFrame = new GameObjectsFrame();
        physicsFrame = new PhysicsFrame();
        gameObjectsFrame.setVisible(false);
        physicsFrame.setVisible(false);

        JButton shutdownBtn = new JButton("shutdown");
        shutdownBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.add(shutdownBtn);

        JButton gameObjectsBtn = new JButton("GameObjects");
        gameObjectsBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                gameObjectsFrame.setVisible(true);
            }
        });
        this.add(gameObjectsBtn);

        GameObjects.getInstance().addConsole(gameObjectsFrame);

        JButton physicsBtn = new JButton("Physics");
        physicsBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                physicsFrame.setVisible(true);
            }
        });
        this.add(physicsBtn);

        GameObjects.getInstance().addConsole(physicsFrame);
    }

    public static DeveloperFrame getInstance(){
        if(frame == null){
            frame = new DeveloperFrame();
        }
        return frame;
    }
}
