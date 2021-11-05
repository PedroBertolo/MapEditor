package personal.map.editor.grid;

import lombok.Data;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

@Data
public class Grid {

    public static final int PADDING = 10;
    private int xAxis;
    private int yAxis;
    private Square square;

    public Grid(int xAxis, int yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        buildGrid();
    }

    public void buildGrid() {
        Rectangle grid = new Rectangle(PADDING, PADDING, xAxis * Square.CELL_SIZE, yAxis * Square.CELL_SIZE);
        grid.setColor(Color.BLACK);
        grid.draw();
        buildMatrix();
    }

    public void buildMatrix() {

        for (int x = 0; x < xAxis * Square.CELL_SIZE; x++) {
            for (int j = 0; j < yAxis * Square.CELL_SIZE; j++) {

                Rectangle rec = new Rectangle(PADDING, PADDING, xAxis * Square.CELL_SIZE + x, xAxis * Square.CELL_SIZE + j);
                rec.draw();
            }
        }
    }

}



