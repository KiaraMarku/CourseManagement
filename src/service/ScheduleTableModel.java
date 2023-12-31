/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.time.LocalTime;
import javax.swing.table.AbstractTableModel;
import java.util.List;
import java.util.ArrayList;

public class ScheduleTableModel extends AbstractTableModel {
    private List<String[]> data;
    private String[] columnNames = {"Time", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

    public ScheduleTableModel() {
        data = new ArrayList<>();
        for (int i = 9; i < 18; i++) {
            String[] row = new String[8];
            row[0] = i + ":00"; // Time slot
            for (int j = 1; j < 8; j++) {
                row[j] = ""; // Course name
            }
            data.add(row);
        }
    }

   public void addCourse(String courseName, String day, LocalTime startTime) {
    int dayIndex = -1;
    for (int i = 0; i < columnNames.length; i++) {
        if (columnNames[i].equalsIgnoreCase(day)) {
            dayIndex = i;
            break;
        }
    }
    if (dayIndex != -1) {
        int timeIndex = startTime.getHour()-9;
        data.get(timeIndex)[dayIndex] = courseName;
    }
    
}
    

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getValueAt(int rowIndex, int columnIndex) {
        return data.get(rowIndex)[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}
