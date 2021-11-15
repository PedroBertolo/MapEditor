package personal.map.editor.grid;


import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    public static final int CELL_SIZE = 60;
    private Rectangle rectangle;

    public Cell(int x, int y) {
        rectangle = new Rectangle(CELL_SIZE * x + Grid.PADDING, CELL_SIZE * y + Grid.PADDING, CELL_SIZE, CELL_SIZE);
        rectangle.draw();
    }


}
