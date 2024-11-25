import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyAndMouseEventDemo extends JFrame implements KeyListener, MouseListener {

    private JLabel label;

    public KeyAndMouseEventDemo() {
        setTitle("Key and Mouse Event Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        label = new JLabel("Press any key or click the mouse", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 16));
        add(label);
        addKeyListener(this);
        addMouseListener(this);
        this.setFocusable(true);
        this.requestFocusInWindow();
        setVisible(true);
    }
    @Override
    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
        label.repaint();
    }
    @Override
    public void keyReleased(KeyEvent e) {
        label.setText("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
        label.repaint();
    }
    @Override
    public void keyTyped(KeyEvent e) {
        label.setText("Key Typed: " + e.getKeyChar());
        label.repaint();
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
        label.repaint();
    }
    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
        label.repaint();
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
        label.repaint();
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered the window");
        label.repaint();
    }
    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited the window");
        label.repaint();
    }

    public static void main(String[] args) {
        new KeyAndMouseEventDemo();
    }
}
