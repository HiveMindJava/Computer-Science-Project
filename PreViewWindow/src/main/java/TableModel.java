
import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel {

    private String[][] data = {{"Cell 1,1", "Cell 1,2"}, {"Cell 2,1", "Cell 2,2"}};
    private String[] columnNames = {"Column 1", "Column 2"};

//    public TableModel(String[][] data, String[] columnNames) {
//        this.data = data;
//        this.columnNames = columnNames;
//    }
    
        public TableModel() {
        this.data = data;
        this.columnNames = columnNames;
    }

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        return data[row][column];
    }

    @Override
    public void setValueAt(Object value, int row, int column) {
        data[row][column] = (String) value;
        fireTableCellUpdated(row, column);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return true;
    }

    public void addRow() {
        String[] newRow = {"", ""};
        data = concat(data, new String[][]{newRow});
    }

    public void deleteRow(int row) {
        data = remove(data, row);
    }

    private String[][] concat(String[][] a, String[][] b) {
        int aLen = a.length;
        int bLen = b.length;
        String[][] result = new String[aLen + bLen][];
        System.arraycopy(a, 0, result, 0, aLen);
        System.arraycopy(b, 0, result, aLen, bLen);
        return result;
    }

    private String[][] remove(String[][] a, int index) {
        String[][] result = new String[a.length - 1][];
        System.arraycopy(a, 0, result, 0, index);
        System.arraycopy(a, index + 1, result, index, a.length - index - 1);
        return result;
    }

    public void printData() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("NACHOSOJFOSJ" + data[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
