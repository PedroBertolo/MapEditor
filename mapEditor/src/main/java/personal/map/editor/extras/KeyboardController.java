package personal.map.editor.extras;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import personal.map.editor.grid.Pointer;

public class KeyboardController implements KeyboardHandler {

    private Pointer pointer;

    public KeyboardController(Pointer pointer) {
        this.pointer = pointer;
    }

    public void keyboardInit() {

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
                pointer.moveUp();
                break;
            case KeyboardEvent.KEY_DOWN:
                pointer.moveDown();
                break;
            case KeyboardEvent.KEY_RIGHT:
                pointer.moveRight();
                break;
            case KeyboardEvent.KEY_LEFT:
                pointer.moveLeft();
                break;
        }

    }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
