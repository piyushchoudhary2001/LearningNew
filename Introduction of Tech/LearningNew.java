import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LearningNew implements ActionListener {
    JFrame Accio;


    JButton button,button2;

    LearningNew()
    {
        Accio=new JFrame("Accio Session");
        Accio.setLayout(null);
        Accio.setVisible(true);
        Accio.setSize(500,500);
        Accio.setResizable(false);

        button=new JButton("Click");
        button.setSize(100,50);
        button.setLocation(200,250);
        button.addActionListener(this);

        button2=new JButton("Click me 2");
        button2.setSize(150,50);
        button2.setLocation(100,200);
        button2.addActionListener(this);

        Accio.add(button2);

        Accio.add(button);



    }



    public static void main(String[] args) {
        LearningNew obj=new LearningNew();
        LearningNew obj2=new LearningNew();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s=e.getActionCommand();
        if(s.equals("Click"))
          Accio.getContentPane().setBackground(Color.pink);

        if(s.equals("Click me 2"))
        {
            Accio.getContentPane().setBackground(Color.yellow);
        }
    }
}
