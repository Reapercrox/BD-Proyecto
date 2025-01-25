/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formatters;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author memis
 */
public class Table_configurator {
    
    public static <T> JTable setData(JTable table, String[] header, ArrayList<T> dataset){
         
        DefaultTableModel tableModel = new DefaultTableModel(0, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        tableModel.setColumnIdentifiers(header);
        table.setModel(tableModel);
        table.setRowHeight(20);
        if (dataset != null){
            setRows(tableModel, header.length, dataset);
        }
        return table;
    }
    
    /**
     * Este método crea las filas de la tabla y las coloca en la misma.
     * @param <T>
     * @param tableModel
     * @param columns cantidad de columnas de la tabla.
     * @param dataset datos a insertar en la tabla.
     */
    private static <T> void setRows(DefaultTableModel tableModel, int columns, ArrayList<T> dataset){
        
        int dataSize = dataset.size() - columns;
        //Adición de las filas con los datos en la tabla     
        for (int i = 0; i <= dataSize; i += columns){
            Vector<T> row = new Vector();  
            for (int j = 0; j < columns; j++){
                row.add(dataset.get(i+j));
            }
            tableModel.addRow(row);
        } 
    }
    
}
