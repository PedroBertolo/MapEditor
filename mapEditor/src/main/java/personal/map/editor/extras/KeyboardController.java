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
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

}
