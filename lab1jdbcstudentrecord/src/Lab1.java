import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Lab1 extends JFrame implements ActionListener
{
    JLabel iblFirst,iblName,iblAdd;
    JTextField txtFirst,txtName,txtAdd;
    JButton btnSave;
    public Lab1()
    {
        JFrame fr=new JFrame("himanshu");
        JPanel p1;
        fr.setTitle("sv Infotech");
        fr.setLocation(400,300);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iblFirst=new JLabel("fIRST NAME");
        txtFirst=new JTextField(12);
        iblName=new JLabel("SURNAME");
        iblAdd=new JLabel("ADDRESS");
        txtAdd=new JTextField(12);
        btnSave=new JButton("SAVE RECORD");
        p1=new JPanel();

        btnSave.addActionListener(this);
        p1.setLayout(new GridLayout(4,2));
        p1.add(iblFirst);
        p1.add(txtFirst);
        p1.add(iblName);
        p1.add(txtName);
        p1.add(iblAdd);
        p1.add(txtAdd);
        p1.add(btnSave);
        fr.add(p1);

        fr.pack();
        fr.show();
    }

    public void actionPerformed(ActionEvent ev)
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/addressbook";
            Connection c=DriverManager.getConnection(url,"root","");
            PreparedStatement pstm=c.prepareStatement("INSERT INTO tbl_addressbook(First_Name,Surname,Address)VALUES(?,?,?)");
            pstm.setString(1,txtFirst.getText());
            pstm.setString(2,txtName.getText());
            pstm.setString(3,txtAdd.getText());
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null,"The new record has been saved");
            c.close();
        }
        catch(SQLException sqe)
        {
            System.out.println("sql error");
            JOptionPane.showMessageDialog(null,"data already existed");
        }
        catch(ClassNotFoundException cnf)
        {
            System.out.println("Class not found error");
        }

    }
    public static void main(String args[])
    {
        Lab1 lab=new Lab1();
    }

}
