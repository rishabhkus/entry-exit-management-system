/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.*;
import java.awt.*;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Scanner;
import newpackage.connectivity;
/**
 *
 * @author vibhumprakash
 */
public class logo extends javax.swing.JFrame implements Runnable{
public String id[]=new String[3];
    /**
     * Creates new form logo
     */
    public logo() {this.setIconImage(Toolkit.getDefaultToolkit().getImage("culogo.png"));
        this.setTitle("Creating Database Cononection");
        initComponents();      
        this.setSize(660,558);
      connectivity co=new connectivity();
      
      this.setLocation(co.getx(this.getWidth()),co.gety(this.getHeight()) );
     
                 
              
                        
        
    }
    public void run(){this.fun();}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(614, 502));
        getContentPane().setLayout(null);

        jProgressBar1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(20, 470, 590, 40);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("<html><body><center><h1><font color=\"BLACK\">A</font><font color=\"RED\">.V Corp</font></h1></center><body");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 20, 130, 50);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 390, 580, 40);

        jLabel1.setBackground(new java.awt.Color(255, 0, 51));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 380, 440, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(logo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
      logo g=new logo();g.setVisible(true);
      Thread t=new Thread(g);
      t.start();
       
       
                
        
       
    }
    public  void fun()
    {
        connectivity c=new connectivity();try{id=c.file();
        
        try{
       
      
       
           
                   
               {jLabel1.setText("Establishing Connection......");
                
               Thread.sleep(300);
               c.executeUp("drop database if exists ssm1;",id);
               jLabel1.setText("Checking database....."); 
               jProgressBar1.setValue(25);
                
               
              
               
               c.executeUp("create database if not exists ssm1;",id);
             
               jLabel1.setText("Creating Databases....."); Thread.sleep(300);
               jProgressBar1.setValue(50);  
               
               
             
               
               jLabel1.setText("Initializing tables.....");  Thread.sleep(300);
               jProgressBar1.setValue(75);  
               c.executeQU("create table author(usr varchar(10) primary key,pass varchar(10) not null,ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP,admin char(1));",id);
               c.executeQU("insert into author(usr,pass,admin) values('admin','admin','1');", id);
               c.executeQU("create table events(date date not null,name varchar(30) not null, venue varchar(20) not null,contact bigint not null);",id);
               c.executeQU("create table parti(id varchar(10) not null,name varchar(30) not null, id_proof varchar(20),vefified bit(1),phone bigint,email varchar(30),fname varchar(30),image blob,remarks varchar(50),status bit(1),vehicles bit(1),vehicle_type int(2),vehicle_no varchar(10));",id);
               c.executeQU("create table staff(id varchar(11) not null, name varchar(30) not null,phone bigint,vehicle varchar(10),hosteller bit(1),image longblob,email varchar(30),validity date,status bit(1),v_status bit(1),vehicl bit(1),vehicle_type int(2));",id);
               c.executeQU("create table student(id varchar(10) not null primary key,name varchar(30) not null,contact bigint,status bit(1),hosteller bit(1),hostel varchar(15),v_no varchar(10),image blob,fname varchar(30),mname varchar(30),email varchar(30),validity date,g_contact bigint,vehicle bit(1),vehicle_type int(2));",id);
               c.executeQU("create table vehicle(number varchar(10),r_user varchar(30),reg_no varchar(20),v_type int(2),verified bit(1),parking bit(1),status bit(1),remarks varchar(50),liscence_no varchar(20),fimage blob,rimage blob);",id);
               c.executeQU("create table visitor(id int primary key not null auto_increment,name varchar(50),id_card varchar(20),vefified bit(1),phone bigint,email varchar(30),purpose varchar(80),refer varchar(50),relation varchar(20),vehicle bit(1),v_type int(2),v_no varchar(10),status bit(1),image blob);",id);
               c.executeQU("create table worker(id varchar(10) primary key not null,name varchar(30),contact bigint,vehicle varchar(20),v_status bit(1),hosteller bit(1),status bit(1),image blob,validity date,vehicle_type int(2),vehicl bit(1));",id);
               c.executeQU("create table notify(id int primary key auto_increment,detail varchar(150),head varchar(100));",id);
               c.executeQU("create table in_out(id varchar(10),name varchar(50),time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,vehicle_no varchar(15),vehicle_type int(2),remarks varchar(150),status bit(1));",id);
               jLabel1.setText("Finishing up....."); Thread.sleep(300);
               jProgressBar1.setValue(100);
                   
               }
               
               
                    
        
        
        }
        catch(Exception e){//JOptionPane.showMessageDialog(null,"Error! "+e.getMessage());
        e.printStackTrace();
        }
        }
        
catch(Exception e)
        {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null,e.getMessage());}
        }
    
    
    
    frame1 fra=new frame1(false);
    fra.setTitle("Sign Up");
     fra.setLocation(connectivity.getx(fra.getWidth()),connectivity.gety(fra.getHeight()) );
    fra.setVisible(true);
    this.dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
