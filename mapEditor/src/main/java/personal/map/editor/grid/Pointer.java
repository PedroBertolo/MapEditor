package personal.map.editor.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import personal.map.editor.extras.KeyboardController;


public class Pointer extends Cell {

    private int x;
    private int y;
    private Rectangle rectangle;
    private KeyboardController keyboardController;

    public Pointer() {
        super(0, 0);
        rectangle = new Rectangle(Grid.PADDING, Grid.PADDING, CELL_SIZE, CELL_SIZE);
        rectangle.setColor(Color.GREEN);
        rectangle.draw();
        rectangle.fill();
       // keyboardInit();
    }

/*    public void keyboardInit() {
        KeyboardController keyboardController = new KeyboardController(this);
        keyboardController.keyboardInit();
    }*/

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






