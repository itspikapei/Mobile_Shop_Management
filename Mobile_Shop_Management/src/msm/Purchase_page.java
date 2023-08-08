package msm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Purchase_page extends JPanel implements ItemListener , ActionListener{
    JLabel BG_img,brand,model,current_qty,add_new_stock;
    JComboBox brandNameCMB, brandModelCMB;
    JButton btnAddToStock;
    JTextField currentQTY;
    SpinnerModel value = new SpinnerNumberModel(0,0,20,1);
    JSpinner spinner;
    String[] strBrandNames = {"Select", "Apple", "Samsung", "Oneplus", "Google", "Motorola"};
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
            {"Select",
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

    public Purchase_page() {

        brand = new JLabel("Brand");
        brand.setBounds(80,100,100,25);
        brand.setForeground(Color.WHITE);
        add(brand);

        model = new JLabel("Model");
        model.setBounds(80,140,100,25);
        model.setForeground(Color.WHITE);
        add(model);

        current_qty = new JLabel("Current Quantity");
        current_qty.setBounds(80,180,100,25);
        current_qty.setForeground(Color.WHITE);
        add(current_qty);

        add_new_stock = new JLabel("Add new stock");
        add_new_stock.setBounds(80,220,100,25);
        add_new_stock.setForeground(Color.WHITE);
        add(add_new_stock);

        //Combobox for Brand Name
        brandNameCMB = new JComboBox<>(strBrandNames);
        brandNameCMB.setBounds(185, 100, 120, 20);
        add(brandNameCMB);
        brandNameCMB.addItemListener(this::itemStateChanged);

        //Combobox for Model Name
        brandModelCMB = new JComboBox<>();
        brandModelCMB.setBounds(185, 140, 120, 20);
        add(brandModelCMB);
        brandModelCMB.addItemListener(this::itemStateChanged2);

        //Text Field for Current Quantity
        currentQTY = new JTextField();
        currentQTY.setBounds(185,180,70,20);
        add(currentQTY);

        // Spinner to add to the Quantity
        spinner = new JSpinner(value);
        spinner.setBounds(185,220,70,20);
        add(spinner);

        // Button to add the quantity to the Stock from Spinner
        btnAddToStock = new JButton("Add to Inventory");
        btnAddToStock.setBounds(80,300,220,20);
        add(btnAddToStock);
        btnAddToStock.addActionListener(this);


        setLayout(null);
        setVisible(false);
        setSize(375, 400);
        setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));

    }

    public void itemStateChanged(ItemEvent Itevt) {
        if (Itevt.getItem() == "Apple") {
            brandModelCMB.removeAllItems();
            currentQTY.setText("");
            for (int i = 0; i < AppleModels.length; i++) {
                brandModelCMB.addItem(AppleModels[i]);

            }

        } else if (Itevt.getItem() == "Samsung") {
            brandModelCMB.removeAllItems();
            currentQTY.setText("");
            for (int i = 0; i < SamsungModels.length; i++) {
                brandModelCMB.addItem(SamsungModels[i]);

            }

        } else if (Itevt.getItem() == "Oneplus") {
            brandModelCMB.removeAllItems();
            currentQTY.setText("");
            for (int i = 0; i < OneplusModels.length; i++) {
                brandModelCMB.addItem(OneplusModels[i]);

            }
        } else if (Itevt.getItem() == "Google") {
            brandModelCMB.removeAllItems();
            currentQTY.setText("");
            for (int i = 0; i < GoogleModels.length; i++) {
                brandModelCMB.addItem(GoogleModels[i]);

            }
        } else if (Itevt.getItem() == "Motorola") {
            brandModelCMB.removeAllItems();
            currentQTY.setText("");
            for (int i = 0; i < MotorolaModels.length; i++) {
                brandModelCMB.addItem(MotorolaModels[i]);

            }

        }

    }
    public void itemStateChanged2(ItemEvent itemEvt2) {

        if (brandModelCMB.getSelectedItem() != "Select")
            try {
                String query = "select * from stock where Phone_Model = '" + brandModelCMB.getSelectedItem() + "'";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, Uname, pass);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);
                rs.next();
                int qty = rs.getInt("Quantity");
                currentQTY.setText(String.valueOf(qty));
                rs.close();
                st.close();
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }


    }
    public void actionPerformed(ActionEvent evt)
    {
        if (evt.getSource()==btnAddToStock)
        {
           int loadedValue = (int) spinner.getValue();
            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, Uname, pass);
                String query1 ="UPDATE stock SET Quantity = Quantity + ? WHERE Phone_Model = ?";
                PreparedStatement pst = con.prepareStatement(query1);
                pst.setInt(1,loadedValue);
                pst.setString(2,String.valueOf(brandModelCMB.getSelectedItem()));
                pst.executeUpdate();
            }
            catch(Exception ex)
            {
                System.out.println(ex);
            }
            currentQTY.setText("");
            spinner.setValue(0);
            try {
                String query = "select * from stock where Phone_Model = '" + brandModelCMB.getSelectedItem() + "'";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, Uname, pass);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);
                rs.next();
                int qty = rs.getInt("Quantity");
                currentQTY.setText(String.valueOf(qty));
                rs.close();
                st.close();
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }


    public static void main(String[] args) {
        new Purchase_page();
    }
}
