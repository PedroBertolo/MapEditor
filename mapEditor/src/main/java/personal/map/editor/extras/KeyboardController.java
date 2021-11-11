package personal.map.editor.extras;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeyboardController implements KeyboardHandler {

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

 /*   @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
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
    }*/

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
