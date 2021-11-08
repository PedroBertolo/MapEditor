package personal.map.editor.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;


public class Pointer extends Cell implements KeyboardHandler {

    private int x;
    private int y;
    private Rectangle rectangle;

    public Pointer(int x, int y) {
        super(0, 0);
        rectangle = new Rectangle(Grid.PADDING, Grid.PADDING, CELL_SIZE, CELL_SIZE);
        rectangle.setColor(Color.GREEN);
        rectangle.draw();
        rectangle.fill();
        keyboardInit();
    }

    private void keyboardInit() {

        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent rightPressed = new KeyboardEvent();
        rightPressed.setKey(KeyboardEvent.KEY_RIGHT);
        rightPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent leftPressed = new KeyboardEvent();
        leftPressed.setKey(KeyboardEvent.KEY_LEFT);
        leftPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent upPressed = new KeyboardEvent();
        upPressed.setKey(KeyboardEvent.KEY_UP);
        upPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent downPressed = new KeyboardEvent();
        downPressed.setKey(KeyboardEvent.KEY_DOWN);
        downPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(rightPressed);
        keyboard.addEventListener(leftPressed);
        keyboard.addEventListener(upPressed);
        keyboard.addEventListener(downPressed);

    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_UP:
                rectangle.translate(0, -CELL_SIZE);
                break;
            case KeyboardEvent.KEY_DOWN:
                rectangle.translate(0, CELL_SIZE);
                break;
            case KeyboardEvent.KEY_RIGHT:
                rectangle.translate(CELL_SIZE, 0);
                break;
            case KeyboardEvent.KEY_LEFT:
                rectangle.translate(-CELL_SIZE, 0);
                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
