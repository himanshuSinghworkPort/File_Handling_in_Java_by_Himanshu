import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Close extends JFrame implements ActionListener{
JButton btnClose;
JPanel p;

	public Close()
	{
	setSize(150,150);
	setLocation(100,100);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	p=new JPanel();
	btnClose=new JButton("close");
	btnClose.addActionListener(this);
	p.add(btnClose);
	add(p);
	show();
	}
	public void actionPerformed(ActionEvent ev)
	{
	if(ev.getSource()==btnClose)
	{
	System.exit(0);
	}

	}
  public static void main(String[] args)
{
Close cls=new Close();
}
}