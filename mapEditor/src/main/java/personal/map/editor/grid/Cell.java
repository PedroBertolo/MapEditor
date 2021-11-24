package personal.map.editor.grid;

import lombok.Data;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

@Data
public class Cell {

    public static final int CELL_SIZE = 60;
    int x;
    int y;
    Rectangle rectangle;
    private boolean isPainted;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        rectangle = new Rectangle(CELL_SIZE * x + Grid.PADDING, CELL_SIZE * y + Grid.PADDING, CELL_SIZE, CELL_SIZE);
        rectangle.draw();

    }

    public void delete() {
        isPainted = false;
        rectangle.draw();
    }

    public void paintCell() {
        isPainted = true;
        rectangle.fill();
    }
}
