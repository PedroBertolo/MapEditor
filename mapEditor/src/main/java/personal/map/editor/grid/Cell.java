package personal.map.editor.grid;


import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Cell  {

    public static final int CELL_SIZE = 60;
    private int x;
    private int y;
    private Rectangle rectangle;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        rectangle = new Rectangle(CELL_SIZE * x + Grid.PADDING, CELL_SIZE * y + Grid.PADDING, CELL_SIZE, CELL_SIZE);
        rectangle.draw();

    }


}
