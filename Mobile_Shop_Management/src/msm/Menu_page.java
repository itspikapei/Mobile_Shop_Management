package msm;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Menu_page extends JFrame implements ActionListener
{
    ButtonGradient btnPurchase,btnSales,btnStock,btnBill,btnExit;
    JLabel BG_img;
    Bill_page bill_page;
    Sales_page sales;
    Stocks_page stock;

    Purchase_page purchase;
    public Menu_page()
    {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        purchase = new Purchase_page();
        purchase.setLocation(890,330);
        add(purchase);

        sales = new Sales_page();
        sales.setBounds(680,220,820,640);
        add(sales);

        stock = new Stocks_page();
        stock.setBounds(680, 220, 845, 635);
        add(stock);

        bill_page = new Bill_page();
        bill_page.setLocation(880,245);
        add(bill_page);

        ImageIcon purchaseIconImage = new ImageIcon(getClass().getResource("/img_icn/purchase_icn.png"));
        ImageIcon exitIconImage = new ImageIcon(getClass().getResource("/img_icn/2.png"));
        ImageIcon billIconImage = new ImageIcon(getClass().getResource("/img_icn/bill_icn.png"));
        ImageIcon stockIconImage = new ImageIcon(getClass().getResource("/img_icn/stock_icn.png"));
        ImageIcon salesIconImage = new ImageIcon(getClass().getResource("/img_icn/sales_icn.png"));

        BG_img = new JLabel("image");
        BG_img.setIcon(new ImageIcon(getClass().getResource("/img_icn/bg_img_id_new.png")));

        btnPurchase = new ButtonGradient();
        btnSales = new ButtonGradient();
        btnStock = new ButtonGradient ();
        btnBill = new ButtonGradient ();
        btnExit = new ButtonGradient();

        btnPurchase.setIcon(purchaseIconImage);
        btnBill.setIcon(billIconImage);
        btnStock.setIcon(stockIconImage);
        btnSales.setIcon(salesIconImage);
        btnExit.setIcon(exitIconImage);

        btnPurchase.setFocusPainted(false);
        btnSales.setFocusPainted(false);
        btnStock.setFocusPainted(false);
        btnBill.setFocusPainted(false);
        btnExit.setFocusPainted(false);

        setLayout(new BorderLayout());

        btnPurchase.setBounds(60,200,100,100);
        btnSales.setBounds  (60, 320,100,100 );
        btnStock.setBounds (60, 440,100,100 );
        btnBill.setBounds   (60, 560,100,100 );
        btnExit.setBounds   (60,680,100,100);

        BG_img.setBounds    (0,0,500,500);

        btnPurchase.addActionListener(this);
        btnSales.addActionListener(this);
        btnStock.addActionListener(this);
        btnBill.addActionListener(this);
        btnExit.addActionListener(this);

        add(btnPurchase);
        add(btnSales);
        add(btnStock);
        add(btnBill);
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
        if (evt.getSource()==btnPurchase)
        {
            bill_page.setVisible(false);
            stock.setVisible(false);
            sales.setVisible(false);
            purchase.setVisible(true);
        }
        else if(evt.getSource()==btnSales)
        {
            purchase.setVisible(false);
            bill_page.setVisible(false);
            stock.setVisible(false);
            sales.setVisible(true);

        }
        else if (evt.getSource()==btnStock)
        {
            purchase.setVisible(false);
            bill_page.setVisible(false);
            sales.setVisible(false);
            stock.setVisible(true);
        }
        else if (evt.getSource()==btnBill)
        {
            purchase.setVisible(false);
            stock.setVisible(false);
            sales.setVisible(false);
            bill_page.setVisible(true);
        }
        else if (evt.getSource()==btnExit)
        {
            this.dispose();
            new Main_page();
        }
    }

    public static void main(String[] args) {
        new Menu_page();
    }

}//Main Page Class

