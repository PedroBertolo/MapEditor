package personal.map.editor.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Pointer extends Cell {

    private Rectangle rectangle;

    public Pointer() {
        super(0, 0);
        rectangle = new Rectangle(Grid.PADDING, Grid.PADDING, CELL_SIZE, CELL_SIZE);
        rectangle.setColor(Color.GREEN);
        rectangle.draw();
        rectangle.fill();
    }

    public void moveUp() {
        rectangle.translate(0, -CELL_SIZE);
    }

    public void moveDown() {
        rectangle.translate(0, CELL_SIZE);
    }

    public void moveRight() {
        rectangle.translate(CELL_SIZE, 0);
    }

    public void moveLeft() {
        rectangle.translate(-CELL_SIZE, 0);
    }


}






