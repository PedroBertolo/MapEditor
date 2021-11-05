package personal.map.editor.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Pointer extends Cell{

    private int x;
    private int y;
    private Rectangle rectangle;

    public Pointer(int x, int y) {
        super(x, y);
        rectangle = new Rectangle(CELL_SIZE + Grid.PADDING, CELL_SIZE  + Grid.PADDING, CELL_SIZE, CELL_SIZE);
        rectangle.setColor(Color.GREEN);
        rectangle.draw();
        rectangle.fill();

    }

}
