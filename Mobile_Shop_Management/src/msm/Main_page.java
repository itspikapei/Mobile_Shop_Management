package msm;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class Main_page extends JFrame implements ActionListener
{
    ButtonGradient btnLogin,btnSignup,btnAbout,btnExit;
    JLabel BG_img;

    Login_page login;

    SignUp_page signUp;
    

    public Main_page()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        login = new Login_page();
        login.setLocation(940,350);
        add(login);

        signUp = new SignUp_page();
        signUp.setLocation(890,350);
        add(signUp);

        ImageIcon loginIconImage = new ImageIcon(getClass().getResource("/img_icn/3.png"));
        ImageIcon exitIconImage = new ImageIcon(getClass().getResource("/img_icn/2.png"));
        ImageIcon signUpImageIcon = new ImageIcon(getClass().getResource("/img_icn/1.png"));
        ImageIcon aboutImageIcon = new ImageIcon(getClass().getResource("/img_icn/4.png"));

        BG_img = new JLabel("image");
        BG_img.setIcon(new ImageIcon(getClass().getResource("/img_icn/main_pageBG2.png")));

        btnLogin = new ButtonGradient();
        btnSignup = new ButtonGradient();
        btnAbout = new ButtonGradient();
        btnExit = new ButtonGradient();

        btnLogin.setIcon(loginIconImage);
        btnSignup.setIcon(signUpImageIcon);
        btnAbout.setIcon(aboutImageIcon);
        btnExit.setIcon(exitIconImage);

        btnLogin.setFocusPainted(false);
        btnSignup.setFocusPainted(false);
        btnAbout.setFocusPainted(false);
        btnExit.setFocusPainted(false);

        setLayout(null);

        btnLogin.setBounds  (60, 510,100,100);
        btnSignup.setBounds (240, 510,100,100);
        btnAbout.setBounds  (420,510,100,100);
        btnExit.setBounds   (600, 510,100,100 );
        BG_img.setBounds    (0,0,1920,1080);

        btnLogin.addActionListener(this);
        btnSignup.addActionListener(this);
        btnAbout.addActionListener(this);
        btnExit.addActionListener(this);

        add(btnLogin);
        add(btnSignup);
        add(btnAbout);
        add(btnExit);
        add(BG_img);


        setSize(1920,1080);
        setTitle("Mobile Gallery");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);

    }//Constructor

    public void actionPerformed(ActionEvent evt){
        if(evt.getSource()==btnLogin)
        {
            signUp.setVisible(false);
            login.setVisible(true);
        }
        else if (evt.getSource()==btnSignup)
        {
             login.setVisible(false);
             signUp.setVisible(true);

        }else if (evt.getSource()==btnAbout)
        {
            JOptionPane.showMessageDialog(this,"This software is developed by Abhishek Goyal and Prince Saini" +
                    "\nIDE used : Intellij IDEA" +
                    "\nDATA BASE used : MySQL server" +
                    "\nOther reference resources : Java Complete Reference 8th Edition, gitHub, javaTpoint, StackOverflow, Youtube");
        }
        else if (evt.getSource()==btnExit)
        {
            System.exit(0);
        }
    }

    public static void main(String[] args) {

        new Main_page();
    }
}//Main Page Class

