package personal.map.editor.extras;

import lombok.Setter;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import personal.map.editor.Game;

@Setter
public class KeyboardController implements KeyboardHandler {

    private Game game;

    public void keyboardInit() {

        Keyboard keyboard = new Keyboard(this);
        KeyboardEvent[] keyboardEvents = new KeyboardEvent[7];

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

        keyboardEvents[4].setKey(KeyboardEvent.KEY_C);
        keyboardEvents[4].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboardEvents[5].setKey(KeyboardEvent.KEY_SPACE);
        keyboardEvents[5].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboardEvents[6].setKey(KeyboardEvent.KEY_SPACE);
        keyboardEvents[6].setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        for (int i = 0; i < keyboardEvents.length; i++) {
            keyboard.addEventListener(keyboardEvents[i]);

        }
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_UP:
                game.movePointer(Directions.UP);
                break;
            case KeyboardEvent.KEY_DOWN:
                game.movePointer(Directions.DOWN);
                break;
            case KeyboardEvent.KEY_RIGHT:
                game.movePointer(Directions.RIGHT);
                break;
            case KeyboardEvent.KEY_LEFT:
                game.movePointer(Directions.LEFT);
                break;
            case KeyboardEvent.KEY_C:
                game.clearGrid();
                break;
            case KeyboardEvent.KEY_SPACE:
                game.setSpacePressed(true);
                game.paint();
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_SPACE:
                game.setSpacePressed(false);
                break;
        }
    }

}
