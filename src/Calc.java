import javax.swing.*;
import java.awt.*;

public class Calc {
    public static void main(String[] args) {
        //Add new panel with main components
        JPanel windowContent = new JPanel();
        //Placement Manager
        /*
        FlowLayout – найпростіший із менеджерів розташування, який застосовують по замовчуванню у деяких контейнерах, зокрема в JPanel.
        Він розміщує елементи один за одним справа на ліво і зверху вниз. Подібно до того як текстовому редакторі розміщуються слова в тексті.
        Менеджер також дозволяє здійснювати вирівнювання вмісту контейнера по ліву та праву сторону і по центру (LEFT, RIGHT, CENTER).
        Недоліком його є непередбачуваність інтерфейсу програми.
         */
        FlowLayout f1 = new FlowLayout();
        windowContent.setLayout(f1);
        //add components
        JLabel label1 = new JLabel("Number 1");
        JTextField text1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2");
        JTextField text2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum");
        JTextField sum = new JTextField(10);
        JButton go = new JButton("Add");
        //add components to panel
        windowContent.add(label1);
        windowContent.add(text1);
        windowContent.add(label2);
        windowContent.add(text2);
        windowContent.add(label3);
        windowContent.add(sum);
        windowContent.add(go);
        // create new frame and add panel
        JFrame frame = new JFrame("My First Calc");
        frame.setContentPane(windowContent);
        //add size adn visibility
        frame.setSize(400,100);
        frame.setVisible(true);
    }
}