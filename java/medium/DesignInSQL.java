// task №2408

class SQL {

    private Map<String, table> tables;

    public SQL(List<String> names, List<Integer> columns) {
        tables = new HashMap<>();

        for (int i = 0; i < names.size(); i++) {
            tables.put(names.get(i), new table(columns.get(i)));
        }

    }
    
    public void insertRow(String name, List<String> row) {
        tables.get(name).insert(row);
    }
    
    public void deleteRow(String name, int rowId) {
    }
    
    public String selectCell(String name, int rowId, int columnId) {
        return tables.get(name).getCell(rowId, columnId);
    }

    private class table {

        private int id = 0;
        
        private Map<Integer, List<String>> rows;

        public table(int columns) {
            rows = new HashMap<>();
        }

        public void insert(List<String> row) {
            rows.put(++id, row);
        }

        public void delete(int rowId) {
            rows.remove(rowId);
        }

        public String getCell(int rowId, int columnId) {
            return rows.get(rowId).get(columnId-1);
        }
    }
}
