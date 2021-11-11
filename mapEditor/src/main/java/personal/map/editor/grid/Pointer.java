package personal.map.editor.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import personal.map.editor.extras.KeyboardController;


public class Pointer extends Cell {

    private int x;
    private int y;
    private Rectangle rectangle;
    private KeyboardController keyboardController;

    public Pointer(int x, int y) {
        super(0, 0);
        rectangle = new Rectangle(Grid.PADDING, Grid.PADDING, CELL_SIZE, CELL_SIZE);
        rectangle.setColor(Color.GREEN);
        rectangle.draw();
        rectangle.fill();
        keyboardInit();
    }

    private void keyboardInit() {
        KeyboardController keyboardController = new KeyboardController();

        
    }


}






