package personal.map.editor;

import personal.map.editor.extras.Directions;
import personal.map.editor.extras.KeyboardController;
import personal.map.editor.grid.Grid;
import personal.map.editor.grid.Pointer;

public class Game {

    private Grid grid;
    private Pointer pointer;
    private KeyboardController keyboardController;

    public Game(int xAxis, int yAxis) {
        grid = new Grid(xAxis, yAxis);
        pointer = new Pointer();
        KeyboardController keyboardController = new KeyboardController(pointer);
        keyboardController.setGame(this);
        keyboardController.keyboardInit();
    }

    public void movePointer(Directions directions) {
        switch (directions) {
            case UP:
                pointer.moveUp();
                break;
            case DOWN:
                pointer.moveDown();
                break;
            case RIGHT:
                pointer.moveRight();
                break;
            case LEFT:
                pointer.moveLeft();
                break;

        }
    }

}
