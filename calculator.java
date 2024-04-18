import javax.swing.*;
import java.awt.*;

class calc{
    JFrame f1;
    Container c1;
     BorderLayout b1;
     calc(){
         f1 = new JFrame("CALCULATOR");
         c1 = f1.getContentPane();
         b1 = new BorderLayout();
         c1.setLayout(b1);

         JButton j1 = new JButton("SIMPLE CALCULATOR ");

         c1.add(j1,BorderLayout.SOUTH);

         JTextField t1 = new JTextField();
         t1.setPreferredSize(new Dimension(0, 50));
         c1.add(t1,BorderLayout.NORTH);

         JPanel p1 = new JPanel();
         p1.setLayout(new GridLayout(4,4 ,2,2 ) );


         JButton b1 = new JButton ("1");
         p1.add(b1);
         b1.setBackground(Color.yellow);
         b1.setForeground(Color.black);
         JButton b2 = new JButton ("2");
         p1.add(b2);
         b2.setBackground(Color.yellow);
         b2.setForeground(Color.black);
         JButton b3 = new JButton ("3");
         p1.add(b3);
         b3.setBackground(Color.yellow);
         b3.setForeground(Color.black);
         JButton plus = new JButton ("+");
         p1.add(plus);
         plus.setBackground(Color.yellow);
         plus.setForeground(Color.black);

         JButton b4 = new JButton ("4");
         p1.add(b4);
         b4.setBackground(Color.yellow);
         b4.setForeground(Color.black);
         JButton b5 = new JButton ("5");
         p1.add(b5);
         b5.setBackground(Color.yellow);
         b5.setForeground(Color.black);
         JButton b6 = new JButton ("6");
         p1.add(b6);
         b6.setBackground(Color.yellow);
         b6.setForeground(Color.black);
         JButton minus = new JButton ("-");
         p1.add(minus);
         minus.setBackground(Color.yellow);
         minus.setForeground(Color.black);
         JButton b7 = new JButton ("7");
         p1.add(b7);
         b7.setBackground(Color.yellow);
         b7.setForeground(Color.black);
         JButton b8 = new JButton ("8");
         p1.add(b8);
         b8.setBackground(Color.yellow);
         b8.setForeground(Color.black);
         JButton b9 = new JButton ("9");
         p1.add(b9);
         b9.setBackground(Color.yellow);
         b9.setForeground(Color.black);
         JButton multiply = new JButton ("x");
         p1.add(multiply);
         multiply.setBackground(Color.yellow);
         multiply.setForeground(Color.black);
         JButton devide = new JButton ("/");
         p1.add(devide);
         devide.setBackground(Color.yellow);
         devide.setForeground(Color.black);
         JButton b0 = new JButton ("0");
         p1.add(b0);
         b0.setBackground(Color.yellow);
         b0.setForeground(Color.black);
         JButton mod = new JButton ("%");
         p1.add(mod);
         mod.setBackground(Color.yellow);
         mod.setForeground(Color.black);
         JButton equal= new JButton ("=");
         p1.add(equal);
         equal.setBackground(Color.yellow);
         equal.setForeground(Color.black);



         c1.add(p1,BorderLayout.CENTER);

         f1.setSize(200,300 );
         f1.setVisible(true);
         f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }


}
public class calculator {
    public static void main(String args[]){
    calc c1 = new calc();
    }
}
