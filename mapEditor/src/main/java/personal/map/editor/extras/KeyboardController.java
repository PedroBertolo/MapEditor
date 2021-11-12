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
        KeyboardEvent[] keyboardEvents = new KeyboardEvent[4];

        for (int i = 0; i < keyboardEvents.length; i++) {
            keyboardEvents[i] = new KeyboardEvent();
        }

        keyboardEvents[0].setKey(KeyboardEvent.KEY_RIGHT);
        keyboardEvents[0].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboardEvents[1].setKey(KeyboardEvent.KEY_LEFT);
        keyboardEvents[1].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboardEvents[2].setKey(KeyboardEvent.KEY_UP);
        keyboardEvents[2].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboardEvents[3].setKey(KeyboardEvent.KEY_DOWN);
        keyboardEvents[3].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        for (int i = 0; i < keyboardEvents.length; i++) {
            keyboard.addEventListener(keyboardEvents[i]);

        }
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
