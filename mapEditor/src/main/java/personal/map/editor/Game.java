package personal.map.editor;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import personal.map.editor.extras.Directions;
import personal.map.editor.extras.KeyboardController;
import personal.map.editor.grid.Cell;
import personal.map.editor.grid.Grid;
import personal.map.editor.grid.Pointer;

public class Game {

    private Grid grid;
    private Pointer pointer;

    public Game(int xAxis, int yAxis) {
        grid = new Grid(xAxis, yAxis);
        pointer = new Pointer();
        KeyboardController keyboardController = new KeyboardController();
        keyboardController.setGame(this);
        keyboardController.keyboardInit();
    }

    public void movePointer(Directions directions) {

        if (pointerIsOnBorder(directions)) {
            return;
        }

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

    public boolean pointerIsOnBorder(Directions direction) {
        if (pointer.getY() == 0 && direction == Directions.UP) {
            return true;
        } else if (pointer.getY() == grid.getYAxis() - 1 && direction == Directions.DOWN) {
            return true;
        } else if (pointer.getX() == grid.getXAxis() - 1 && direction == Directions.RIGHT) {
            return true;
        } else if (pointer.getX() == 0 && direction == Directions.LEFT) {
            return true;
        } else {
            return false;
        }

    }

    public void clearGrid() {
        grid.deleteAll();
    }

    public void paint() {
        Cell cell = grid.getMatrixOfCells()[pointer.getX()][pointer.getY()];
        if (cell.isPainted()) {
            cell.delete();
        } else {
            cell.paintCell();
        }
    }

}
