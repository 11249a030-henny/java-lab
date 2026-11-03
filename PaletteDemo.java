import java.awt.*;
import java.awt.event.*;

public class PaletteDemo extends Frame implements ActionListener {

    Button b1, b2, b3, b4;

    PaletteDemo() {
        setTitle("Color Palette");
        setLayout(new FlowLayout());

        b1 = new Button("Red");
        b2 = new Button("Green");
        b3 = new Button("Blue");
        b4 = new Button("Yellow");

        b1.setBackground(Color.RED);
        b2.setBackground(Color.GREEN);
        b3.setBackground(Color.BLUE);
        b4.setBackground(Color.YELLOW);

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        setSize(400, 300);
        setBackground(Color.WHITE);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            setBackground(Color.RED);
        } else if (e.getSource() == b2) {
            setBackground(Color.GREEN);
        } else if (e.getSource() == b3) {
            setBackground(Color.BLUE);
        } else if (e.getSource() == b4) {
            setBackground(Color.YELLOW);
        }
    }

    public static void main(String[] args) {
        new PaletteDemo();
    }
}
