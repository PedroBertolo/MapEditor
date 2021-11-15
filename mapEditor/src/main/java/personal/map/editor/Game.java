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
        KeyboardController keyboardController = new KeyboardController();
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
                if (checkBorders(Directions.RIGHT)) {
                    pointer.moveRight();
                }
                break;
            case LEFT:
                if (checkBorders(Directions.LEFT)) {
                    pointer.moveLeft();
                    break;
                }
        }
    }

    public boolean checkBorders(Directions direction) {
        if (pointer.getX() == 0 && direction == Directions.LEFT) {
            return false;
        } else if (pointer.getX() == grid.getXAxis() - 1 && direction == Directions.RIGHT) {
            return false;
        }
        return true;
    }

}
