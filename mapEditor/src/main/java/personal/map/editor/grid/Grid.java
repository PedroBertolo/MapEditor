package personal.map.editor.grid;

import lombok.Data;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

@Data
public class Grid {

    public static final int PADDING = 10;
    private int xAxis;
    private int yAxis;
    private Cell[][] matrixOfCells;

    public Grid(int xAxis, int yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        buildGrid();
    }

    public void buildGrid() {
        Rectangle grid = new Rectangle(PADDING, PADDING, xAxis * Cell.CELL_SIZE, yAxis * Cell.CELL_SIZE);
        grid.setColor(Color.BLACK);
        grid.draw();
        buildMatrix();
    }

    public void buildMatrix() {
        matrixOfCells = new Cell[getXAxis()][getYAxis()];

        for (int x = 0; x < xAxis; x++) {
            for (int y = 0; y < yAxis; y++) {

                matrixOfCells[x][y] = new Cell(x, y);
            }
        }
    }

}



