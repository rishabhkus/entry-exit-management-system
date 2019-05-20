/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;



import java.sql.*;
//import java.io.BufferedWriter;
import java.awt.Toolkit;
import java.io.File;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Guru
 */
public class connectivity{
  
   
    
    
   static public void wait(int t){
    try {
    Thread.sleep(t);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}}
   
   public static int getx(int a){
   Toolkit tk=Toolkit.getDefaultToolkit();                  //to get screeen size       
        int x=(int)tk.getScreenSize().getWidth();
    return (x-a)/2;
        }
   
   public static int gety(int b){
   Toolkit tk=Toolkit.getDefaultToolkit(); 
    int y=(int)tk.getScreenSize().getHeight();
    return (y-b)/2;
    
   }
 

static public void executeQ(String str,String ...a){
 Connection con=null;
 Statement stmt=null;
 String uid=a[1],pass=a[2];
                    String url="jdbc:mysql://localhost:"+a[0];
                    try{
                con=DriverManager.getConnection(url,uid,pass);
               stmt=con.createStatement();
                    stmt.executeQuery(str);}
                    catch(Exception e){JOptionPane.showMessageDialog(null,e.getMessage());}
                    
                     finally{
                        if(stmt!=null)
                            try{stmt.close();}
                        catch(Exception e){JOptionPane.showMessageDialog(null,e.getMessage());}
                        
                         if(con!=null)
                            try{con.close();}
                        catch(Exception e){JOptionPane.showMessageDialog(null,e.getMessage());}
                    }
}
static public boolean executeQU(String str,String ...a){
 Connection con=null;
 Statement stmt=null;
 String uid=a[1],pass=a[2];boolean local=false;
                    String url="jdbc:mysql://localhost:"+a[0];try{
                con=DriverManager.getConnection(url,uid,pass);
               stmt=con.createStatement();
                    stmt.executeQuery("use ssm1;");
                    stmt.executeUpdate(str);
                    local=true;
                    }
                    catch(Exception e){JOptionPane.showMessageDialog(null,e.getMessage()+"hello");}
                    if(local ==true)return true;
                    else
                        return false;
                   
}


static public void executeUp(String str,String ...a){
 Connection con=null;
 Statement stmt=null;
 String uid=a[1],pass=a[2];
                    String url="jdbc:mysql://localhost:"+a[0];try{
                con=DriverManager.getConnection(url,uid,pass);
               stmt=con.createStatement();
                    stmt.executeUpdate(str);}
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null,e.getMessage());}
                    
                    
}

static public String[] file(){
    String id[]=new String[3];
try{
File x=new File("port.txt");
                Scanner opnScanner = new Scanner(x);
                int i=0;
                
while(opnScanner.hasNext()) {
        id[i]=opnScanner.nextLine();i++;}
}
catch(Exception e){JOptionPane.showMessageDialog(null,e.getMessage());}
return id;
}


}


