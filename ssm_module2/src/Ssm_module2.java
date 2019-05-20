/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Guru
 */
import newpackage.connectivity;
import java.io.File;

//import javax.swing.JOptionPane;
public class Ssm_module2 {

/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        welcome w=new welcome(); 
        w.setTitle("Welcome"); 
        connectivity c=new connectivity();
       
                 w.setVisible(true);
                 w.setSize(450, 320);
                 w.setLocation(c.getx(w.getWidth()), c.gety(w.getHeight()));        //set location
                 c.wait(2000);
                 w.dispose();
        File f=new File("port.txt");
        if(!f.exists()){                        //if file not exists
        
        port p=new port(); 
        p.setTitle("Setup the connection");
//input frame for dbms de w`tails
        p.setVisible(true);
        p.setLocation(c.getx(p.getWidth()),c.gety(p.getHeight()));
        }
        else
        {   frame1 n=new frame1(true);
        n.setSize(438,315);
            n.setTitle("Login");
            connectivity co=new connectivity();
        
        n.setLocation(co.getx(n.getWidth()),co.gety(n.getHeight()) );
        n.setVisible(true);
        
        
        }
        
        
    }
    
}
