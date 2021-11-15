package personal.map.editor.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class Pointer extends Cell {

    public Pointer() {
        super(0, 0);
        rectangle.setColor(Color.GREEN);
        rectangle.draw();
        rectangle.fill();
    }

    public void moveUp() {
        y--;
        rectangle.translate(0, -CELL_SIZE);
    }

    public void moveDown() {
        y++;
        rectangle.translate(0, CELL_SIZE);
    }

    public void moveRight() {
        x++;
        rectangle.translate(CELL_SIZE, 0);
    }

    public void moveLeft() {
        x--;
        rectangle.translate(-CELL_SIZE, 0);
    }


}






