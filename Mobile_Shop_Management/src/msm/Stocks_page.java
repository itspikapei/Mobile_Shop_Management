package msm;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.*;

public class Stocks_page extends JPanel{

    public Stocks_page(){
        JTable table = new JTable();
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_shop_management","root","@Tiger123");
    Statement st = con.createStatement();
    String query = "select * from stock";
    ResultSet rs = st.executeQuery(query);
    ResultSetMetaData rsmd  = rs.getMetaData();
    DefaultTableModel model = (DefaultTableModel) table.getModel();

    int cols = rsmd.getColumnCount();
    String[] colName = {"BRAND","MODEL","RAM","ROM","PRICE","QTY"};
        model.setColumnIdentifiers(colName);
        String brand,modelName,RAM,ROM,price,QTY;
        while(rs.next()){
            brand = rs.getString(1);
            modelName=rs.getString(2);
            RAM = rs.getString(3);
            ROM=rs.getString(4);
            price = rs.getString(5);
            QTY = rs.getString(6);
            String[] row = {brand,modelName,RAM,ROM,price,QTY};
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