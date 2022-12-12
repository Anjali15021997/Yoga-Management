package Yoga;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField tf;
    JPasswordField pf;
    JButton bt1,bt2;
    Font f,f1;
    
    Login()
    {
        super("login");
        setLocation(50,50);
        setSize(400,200);
        
        f=new Font("Arial",Font.BOLD,20);
        f1=new Font("Arial",Font.BOLD,15);
        
        l1=new JLabel("Welcome to Yoga Classes");
        l2=new JLabel("Username");
        l3=new JLabel("Password");
        
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(Color.RED);
        l2.setForeground(Color.BLUE);
        l3.setForeground(Color.BLUE);
        
        l1.setFont(f1);
        l2.setFont(f1);
        l3.setFont(f1);
        
        tf=new JTextField();
        pf=new JPasswordField();
        
        tf.setFont(f1);
        pf.setFont(f1);
        
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("C:\\Users\\Lenovo\\Desktop\\Flexmoney\\yoga\\home.png"));
        Image img2=img.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(ClassLoader.getSystemResource("img2"));
        l4=new JLabel(img3);
        
        bt1=new JButton("Login");
        bt2=new JButton("Cancle");
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        
        bt1.setBackground(Color.BLACK);
        bt2.setBackground(Color.BLACK);
        bt1.setBackground(Color.WHITE);
        bt1.setBackground(Color.WHITE);
        bt1.setFont(f1);
        bt2.setFont(f1);
        
        pl=new JPanel();
        pl.setLayout(new GridLayout(3,2,10,10));
        pl.add(l2);
        pl.add(tf);
        pl.add(l3);
        pl.add(pf);
        pl.add(bt1);
        pl.add(bt2);
        
        setLayout(new BorderLayout(30,30));
        add(l1,"North");
         add(l4,"East");
         add(p1,"Center");
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String name=tf.getText();
        String pass=pf.getText();
        if(e.getSource()==bt1)
        {
            try
            {
                Connection obj=new Connection();//connect from Connection.java
                String q="select * from yoga where="username='"+name+"' and password='"+pass+"'";
                Resultset rest=obj.stm.executeQuery(q);
                if(rest.next())
                {
                    new Home().setVisible(true);
                    this.setVisible(false);
                }
            else
            {
                JOptionPane.showMessageDialog(null,"Data not found:(");
                this.setVisible(false);
                    }
        }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
            }
    if(e.getSource()==bt2)
    {
        JOptionPane.showMessageDialog(null,"Are you sure to cancel?");
        this.setVisible(false);
    }
}
public static void main(String args[])
{
 new Login().setVisible(true);
    }
}
