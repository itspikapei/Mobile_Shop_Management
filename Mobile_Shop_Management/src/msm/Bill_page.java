package msm;

import datechooser.beans.DateChooserCombo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.*;
// import these classes
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bill_page extends JPanel implements ActionListener, ItemListener {
    JButton appleButton,samsungButton,oneplusButton,googleButton,motorolaButton,createBill,btnPrint;
    JLabel model,date,customerName,customerMobNo,price,RAM,ROM;
    JTextField priceTextField,specRAM,specROM;
    KTextField custNameTextField,custMobNoTextField;
    JComboBox brandModelCMB;
    JTextArea billArea;
    String brandNameREF;
    DateChooserCombo dateChooser ;
    int currentAutoIncrementValue;
    String[] AppleModels =
            {"Select",
                    "XR",
                    "X",
                    "XS",
                    "XS Max",
                    "11",
                    "11 Pro",
                    "11 Pro Max",
                    "12 Mini",
                    "12",
                    "12 Pro",
                    "12 Pro Max",
                    "13 Mini",
                    "13",
                    "13 Pro",
                    "13 Pro Max",
                    "14",
                    "14 Plus",
                    "14 Pro",
                    "14 Pro Max"};
    String[] SamsungModels =
            {"Select",
                    "Galaxy A32",
                    "Galaxy A72",
                    "Galaxy A71",
                    "Galaxy A50s",
                    "Galaxy A31",
                    "Galaxy A70",
                    "Galaxy A10s",
                    "Galaxy S5",
                    "Galaxy S6",
                    "Galaxy S7",
                    "Galaxy S8",
                    "Galaxy S9",
                    "Galaxy S10",
                    "Galaxy S20",
                    "Galaxy S21",
                    "Galaxy S21 Ultra",
                    "Galaxy S22",
                    "Galaxy Fold",
                    "Galaxy Z Flip",
                    "Galaxy Z Fold 2",
                    "Galaxy Z Fold 3",
                    "Galaxy Z Flip 3",
                    "Galaxy Z Fold 4"
            };
    String[] OneplusModels =
            {   "Select",
                    "5",
                    "5T",
                    "6",
                    "6T",
                    "7",
                    "7 Pro",
                    "7T",
                    "7T Pro",
                    "8",
                    "8 Pro",
                    "8T",
                    "9",
                    "9 Pro",
                    "10 Pro",
                    "10 T",
                    "Ace Pro",
                    "11",
                    "Nord N10 5G",
                    "Nord N100",
                    "Nord CE 5G",
                    "Nord N200",
                    "Nord 2 5G"
            };
    String[] GoogleModels =
            {"Select",
                    "Pixel 2",
                    "Pixel 2 XL",
                    "Pixel 3",
                    "Pixel 3 XL",
                    "Pixel 3a",
                    "Pixel 3a XL",
                    "Pixel 4",
                    "Pixel 4 XL",
                    "Pixel 4a",
                    "Pixel 4a 5G",
                    "Pixel 5",
                    "Pixel 5a",
                    "Pixel 6",
                    "Pixel 6 Pro",
                    "Pixel 6a",
                    "Pixel 7",
                    "Pixel 7 Pro"
            };
    String[] MotorolaModels =
            {"Select",
                    "Moto E32",
                    "Edge",
                    "Edge S30 ",
                    "Edge X30",
                    "Edge+",
                    "Edge 30",
                    "Edge 30 Pro",
                    "Moto G Power",
                    "Moto G 5G",
                    "Moto G Stylus",
                    "Moto G Stylus 5G",
                    "Moto G31",
                    "Moto G41",
                    "Moto G51 5G",
                    "Moto G71 5G",
                    "Moto G200 5G",
                    "Moto G22",
                    "Moto G52",
                    "Moto G82",
                    "Moto G62",
                    "Moto G32",
                    "Moto G72",
                    "One 5G Ace"
            };
    String url = "jdbc:mysql://localhost:3306/mobile_shop_management";
    String Uname = "root";
    String pass = "@Tiger123";
public Bill_page()
    {

        //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ImageIcon appleLogo = new ImageIcon(getClass().getResource("/img_icn/apple_logo.png"));
        ImageIcon samsungLogo = new ImageIcon(getClass().getResource("/img_icn/samsung_logo.png"));
        ImageIcon oneplusLogo = new ImageIcon(getClass().getResource("/img_icn/oneplus_logo.png"));
        ImageIcon pixelLogo = new ImageIcon(getClass().getResource("/img_icn/pixel_logo.png"));
        ImageIcon motorolaLogo = new ImageIcon(getClass().getResource("/img_icn/motorola_logo.png"));

        //Date Label
        date = new JLabel("Date");
        date.setBounds(210,110,50,20);
        date.setForeground(Color.WHITE);
        add(date);

        //Date Chooser
        dateChooser = new DateChooserCombo();
        dateChooser.setBounds(280,110,135,20);
        add(dateChooser);

        //APPLE BUTTON
        appleButton = new JButton(appleLogo);
        appleButton.setBounds(20,20,75,75   );
        add(appleButton);
        appleButton.setFocusPainted(false);
        appleButton.addActionListener(this);

        //SAMSUNG BUTTON
        samsungButton = new JButton(samsungLogo);
        samsungButton.setBounds(100,20,75,75  );
        add(samsungButton);
        samsungButton.setFocusPainted(false);
        samsungButton.addActionListener(this);

        //ONEPLUS BUTTON
        oneplusButton = new JButton(oneplusLogo);
        oneplusButton.setBounds(180,20,75,75  );
        add(oneplusButton);
        oneplusButton.setFocusPainted(false);
        oneplusButton.addActionListener(this);

        //GOOGLE BUTTON
        googleButton = new JButton(pixelLogo);
        googleButton.setBounds(260,20,75,75  );
        add(googleButton);
        googleButton.setFocusPainted(false);
        googleButton.addActionListener(this);

        //MOTOROLA BUTTON
        motorolaButton = new JButton(motorolaLogo);
        motorolaButton.setBounds(340,20,75,75  );
        add(motorolaButton);
        motorolaButton.setFocusPainted(false);
        motorolaButton.addActionListener(this);

        //Combobox for Phone Models
        brandModelCMB = new JComboBox<>();
        brandModelCMB.setBounds(75,110,120,20);
        add(brandModelCMB);
        brandModelCMB.addItemListener(this);

        //Label for Phone Model Combobox
        model = new JLabel("Model");
        model.setBounds(20,107,80,30 );
        model.setForeground(Color.WHITE);
        add(model);

        //Label for RAM
        RAM = new JLabel("RAM");
        RAM.setBounds(20,138,50,25 );
        RAM.setForeground(Color.WHITE);
        add(RAM);

        //Label for ROM
        ROM = new JLabel("Storage");
        ROM.setBounds(19,165,70,25 );
        ROM.setForeground(Color.WHITE);
        add(ROM);


        //Label for Name of the customer
        customerName = new JLabel("Name");
        customerName.setBounds(210,135,100,30 );
        customerName.setForeground(Color.WHITE);
        add(customerName);

        //Label for Mobile number of customer
        customerMobNo = new JLabel("Mobile No.");
        customerMobNo.setBounds(210,165,100,30);
        customerMobNo.setForeground(Color.WHITE);
        add(customerMobNo);

        //Label for Mobile price
        price = new JLabel("Price");
        price.setBounds(20,193,80,25  );
        price.setForeground(Color.WHITE);
        add(price);

        //Text Field for RAM
        specRAM = new JTextField();
        specRAM.setBounds(75,140,100,20 );
        add(specRAM);

        //Text Field for ROM
        specROM = new JTextField();
        specROM.setBounds(75,167,100,20 );
        add(specROM);

        //Text Field for Price
        priceTextField = new JTextField();
        priceTextField.setBounds(75,195,100,20 );
        add(priceTextField);

        //Text Field for Customer Name
        custNameTextField = new KTextField(20);
        custNameTextField.setBounds(280,140,135,20 );
        add(custNameTextField);

        //Text Field for Customer Mobile Number
        custMobNoTextField = new KTextField(10);
        custMobNoTextField.setBounds(280,170,135,20);
        add(custMobNoTextField);

        //Print Button
        btnPrint = new JButton("Print");
        btnPrint.setBounds(315,550,100,30 );
        add(btnPrint);
        btnPrint.setFocusPainted(false);
        btnPrint.addActionListener(this);

        //Button to add all the details to Bill
        createBill = new JButton("Generate Bill");
        createBill.setBounds(20,230,395,20 );
        add(createBill);
        createBill.setFocusPainted(false);
        createBill.addActionListener(this);

        //Text area where all the details will be shown in a Bill format before printing
        billArea = new JTextArea();
        billArea.setBounds(20,260,395,280);
        add(billArea);

        setLayout(null);

        setVisible(false);
        setSize(440,600);
        setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));
    }
    public void itemStateChanged(ItemEvent Itmevt)
    {
        if (Itmevt.getItem()!="Select")
        {
            try {
                String url = "jdbc:mysql://localhost:3306/mobile_shop_management";
                String Uname = "root";
                String pass = "@Tiger123";

                String query = "select * from stock where Phone_Model = '" + brandModelCMB.getSelectedItem() + "'" ;
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, Uname, pass);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);
                rs.next();

                String price = rs.getString("Phone_Price");
                priceTextField.setText(price);
                String dbRAM = rs.getString("RAM");
                specRAM.setText(dbRAM);
                String dbROM = rs.getString("ROM");
                specROM.setText(dbROM);

                rs.close();
                st.close();
                con.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    public void actionPerformed(ActionEvent evt)
    {
        if (evt.getSource()==appleButton)
        {
            brandModelCMB.removeAllItems();
            specROM.setText("");
            specRAM.setText("");
            priceTextField.setText("");
            brandNameREF = "Apple";
            for (int i=0;i<AppleModels.length;i++)
            {
                brandModelCMB.addItem(AppleModels[i]);

            }
        }
        else
            if (evt.getSource()==samsungButton)
            {

                brandModelCMB.removeAllItems();
                specROM.setText("");
                specRAM.setText("");
                priceTextField.setText("");
                brandNameREF = "Samsung";
                for (int i=0;i<SamsungModels.length;i++)
                {
                    brandModelCMB.addItem(SamsungModels[i]);
                }

            }
            else
                if (evt.getSource()==oneplusButton)
                {
                    brandModelCMB.removeAllItems();
                    specROM.setText("");
                    specRAM.setText("");
                    priceTextField.setText("");
                    brandNameREF = "Oneplus";
                  for (int i=0;i<OneplusModels.length;i++)
                  {
                    brandModelCMB.addItem(OneplusModels[i]);
                  }

                }
                else
                    if (evt.getSource()==googleButton)
                     {
                         brandModelCMB.removeAllItems();
                         specROM.setText("");
                         specRAM.setText("");
                         priceTextField.setText("");
                         brandNameREF = "Google";
                         for (int i=0;i<GoogleModels.length;i++)
                         {
                             brandModelCMB.addItem(GoogleModels[i]);
                         }

                     }
                    else
                        if (evt.getSource()==motorolaButton)
                        {
                            brandModelCMB.removeAllItems();
                            specROM.setText("");
                            specRAM.setText("");
                            priceTextField.setText("");
                            brandNameREF = "Motorola";
                            for (int i=0;i<MotorolaModels.length;i++)
                            {
                                brandModelCMB.addItem(MotorolaModels[i]);
                            }

                        }
                        else if (evt.getSource()==createBill)
                        {
                            generateBill();
                        }
                        else if (evt.getSource()==btnPrint)
                        {
                            try {
                                billArea.print();
                            } catch(PrinterException ex)
                            {
                                Logger.getLogger(Bill_page.class.getName()).log(Level.SEVERE,null,ex);
                            }
                        }
    }

    String s1,s2,s3,s4,s5;
    private void generateBill() {
        s1 = specRAM.getText();
        s2 = specROM.getText();
        s3 = priceTextField.getText();
        s4 = custNameTextField.getText();
        s5 = custMobNoTextField.getText();
        if(s1.isEmpty()||s2.isEmpty()||s3.isEmpty()||s4.isEmpty()||s5.isEmpty())
        {
            JOptionPane.showMessageDialog(this,
                    "Please enter all fields!",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        //To fetch the current Auto Increment value in table 'sales'
        try {
            String query = "SELECT `AUTO_INCREMENT` FROM  INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'mobile_shop_management' AND   TABLE_NAME   = 'sales'" ;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, Uname, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            currentAutoIncrementValue = rs.getInt("AUTO_INCREMENT");
            rs.close();
            st.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        billArea.setText(null);
        String shopName = "                                          THE MOBILE GALLERY";
        String line =     "\n========================================================";
        String date =     "\n\nDate: "+ dateChooser.getText();
        String billId =   "                                          Bill Id:  " + currentAutoIncrementValue;
        String soldTo =   "\n\nName:   " + custNameTextField.getText();
        String MobNo =    "\n\nMobile No. :  " + custMobNoTextField.getText();
        String s1 =       "\n\nBrand:  "+brandNameREF;
        String s2 =       "                                          Model:  " + (String) brandModelCMB.getSelectedItem();
        String s3 =       "\n\nRAM:  " + (String) specRAM.getText();
        String s4 =       "      ROM:  " + (String) specROM.getText() + "\n";
        String s6 =       "\n\nPrice:  "+ priceTextField.getText();
        billArea.append(shopName + line + date + billId + soldTo + MobNo + s1 + s2 + s3 + s4 + line + s6);
        //To store all the data from bill page to sales table in database
        try {
            String query = "insert into sales(bill_date ,brand ,model ,customer_name ,mobile_number ,price )values(?,?,?,?,?,?)";

            Connection con = DriverManager.getConnection(url, Uname, pass);
            PreparedStatement st = con.prepareStatement(query);

            st.setString(1,dateChooser.getText());
            st.setString(2,brandNameREF);
            st.setString(3,(String)brandModelCMB.getSelectedItem());
            st.setString(4,custNameTextField.getText());
            st.setLong  (5,Long.parseLong(custMobNoTextField.getText()));
            st.setString(6,priceTextField.getText());
            st.executeUpdate();
            st.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        try {
            String query = "UPDATE stock SET Quantity = Quantity - 1 WHERE Phone_Model = ?";

            Connection con = DriverManager.getConnection(url, Uname, pass);
            PreparedStatement st = con.prepareStatement(query);

            st.setString(1,(String)brandModelCMB.getSelectedItem());
            st.executeUpdate();
            st.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args){
        new Bill_page();
    }
}
