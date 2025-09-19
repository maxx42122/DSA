import java.util.*;

class Spreadsheet {
    private Map<String, Integer> cells;
    private int rows;

    public Spreadsheet(int rows) {
        this.rows = rows;
        this.cells = new HashMap<>();
    }

    public void setCell(String cell, int value) {
        cells.put(cell, value);
    }

    public void resetCell(String cell) {
        cells.remove(cell);
    }

    public int getValue(String formula) {
        // formula format: "=X+Y"
        String body = formula.substring(1); // remove '='
        String[] parts = body.split("\\+");

        return eval(parts[0]) + eval(parts[1]);
    }

    private int eval(String token) {
        token = token.trim();
        // If starts with A–Z, treat as cell reference
        if (!token.isEmpty() && Character.isLetter(token.charAt(0))) {
            return cells.getOrDefault(token, 0);
        }
        // Otherwise numeric literal
        return Integer.parseInt(token);
    }
}
