/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileapplicationexample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Chew Teng
 */
public class FileApplicationExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*File file = new File("");
        if(file.exists()){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }*/
        
        JFrame frame= new JFrame();
        
        JButton btn1 = new JButton("Click");
        
        btn1.setBounds(130,100,100,40);
        
        JLabel lbl1 = new JLabel("Output here");
        lbl1.setBounds(130,140,400,40);
        
        frame.add(btn1);
        frame.setSize(400,500);//400 width and 500 height  
        frame.setLayout(null);//using no layout managers  
        frame.setVisible(true);//making the frame visible  
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         btn1.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                   JFileChooser chooser = new JFileChooser("C:/Users/Chew Teng/Desktop");
                   int status = chooser.showOpenDialog(null);
                    
                    /*if (status == JFileChooser.APPROVE_OPTION) {
                            JOptionPane.showMessageDialog(null, "Open is clicked");

                    } else { //== JFileChooser.CANCEL_OPTION
	JOptionPane.showMessageDialog(null, "Cancel is clicked");*/

             }
                 
         });
        
       
    }
    
}
