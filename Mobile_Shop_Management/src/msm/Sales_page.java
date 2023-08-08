package msm;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.*;

public class Sales_page extends JPanel{

    public Sales_page(){
        JTable table = new JTable();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_shop_management","root","@Tiger123");
            Statement st = con.createStatement();
            String query = "select * from sales";
            ResultSet rs = st.executeQuery(query);
            ResultSetMetaData rsmd  = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            int cols = rsmd.getColumnCount();
            String[] colName = {"BILL ID","DATE","BRAND","MODEL","SOLD TO","MOBILE NO.","PRICE"};
            model.setColumnIdentifiers(colName);
            String bill_id,bill_date,brand,modelName,custName,mobNumber,price;
            while(rs.next()){
                bill_id = rs.getString(1);
                bill_date=rs.getString(2);
                brand= rs.getString(3);
                modelName=rs.getString(4);
                custName= rs.getString(5);
                mobNumber = rs.getString(6);
                price = rs.getString(7);
                String[] row = {bill_id,bill_date,brand,modelName,custName,mobNumber,price};
                model.addRow(row);
            }

            st.close();
            con.close();
            rs.close();
        }catch(ClassNotFoundException|SQLException e1)
        {
            e1.printStackTrace();
        }
        table.setPreferredScrollableViewportSize(new Dimension(800,600));
        table.setFillsViewportHeight(true);
        JScrollPane js=new JScrollPane(table);
        js.setVisible(true);
        add(js);

        setVisible(false);
        setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));
    }

}
