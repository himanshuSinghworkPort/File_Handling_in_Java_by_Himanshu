/*
java jfile chooser
JFILE CHOOSER IS A CLASS
INHERITED THE PROPERTY OF JCOMPONENT CLASS
CONSTRUCTUCTOR OF JFILECHOOSER()
*/
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.filechooser.*;
class fileselectgui
{
	public static void main(String[] args)
		{
		JFileChooser file=new JFileChooser();
		file.showSaveDialog(null);
		}
}