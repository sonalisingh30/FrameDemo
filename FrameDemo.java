//to create frame using JFrame class object
import javax.swing.*;

class FrameDeme
{
   public static void main(string args[])
   {
       JFrame ob=new JFrame();
       
       ob.setSize(250,300);
       ob.setVisible(true);
       
       ob.getDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       }
}