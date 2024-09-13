
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class MyCode extends JFrame implements ActionListener
{
JButton b;

JLabel lbl;

MyCode()
{

Container c =getContentPane();

c.setLayout(new FlowLayout());

ImageIcon il=new ImageIcon("C:\\Users\\sonal\\OneDrive\\Desktop\\PayE.png");


b=new JButton("QR CODE", il);

b.setBackground (Color.gray);

b.setForeground(Color.yellow);

b.setFont(new Font ("Arial", Font. BOLD, 28));
Border bl =BorderFactory.createCompoundBorder();

b.setBorder(bl);

c.add(b);

b.addActionListener(this);

lbl= new JLabel();

c.add(lbl);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}


public void actionPerformed(ActionEvent e)
{
ImageIcon il=new ImageIcon("C:\\\\Users\\\\sonal\\\\OneDrive\\\\Desktop\\\\qrcode.jpg");

lbl.setIcon(il);

}
}
public class QrC{

public static void main(String[] args)

{

MyCode f= new  MyCode();

f.setTitle("Button Example");

f.setSize(500, 400);

f.setVisible(true);
}
}