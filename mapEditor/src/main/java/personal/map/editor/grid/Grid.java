package personal.map.editor.grid;

import lombok.Data;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

import java.io.IOException;

@Data
public class Grid {

    public static final int PADDING = 10;
    private int xAxis;
    private int yAxis;
    private Cell[][] matrixOfCells;

    public Grid(int xAxis, int yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        buildGrid();
    }

    public void buildGrid() {
        Rectangle grid = new Rectangle(PADDING, PADDING, xAxis * Cell.CELL_SIZE, yAxis * Cell.CELL_SIZE);
        buildMatrix();
        grid.setColor(Color.RED);
        grid.draw();
    }

    public void buildMatrix() {
        matrixOfCells = new Cell[getXAxis()][getYAxis()];

        for (int x = 0; x < xAxis; x++) {
            for (int y = 0; y < yAxis; y++) {
                matrixOfCells[x][y] = new Cell(x, y);
            }
        }
        buildExtras();
    }

    public void deleteAll() {
        for (int x = 0; x < xAxis; x++) {
            for (int y = 0; y < yAxis; y++) {
                matrixOfCells[x][y].delete();
            }
        }
    }

    private void buildExtras() {

        Cell[][] matrixOfCells = new Cell[getXAxis() + 5][getYAxis()];
        Text[][] text = new Text[getXAxis() + 5][getYAxis()];

        for (int x = getXAxis() + 1; x < xAxis + 5; x++) {
            for (int y = 0; y < yAxis; y++) {
                matrixOfCells[x][y] = new Cell(x, y);
               text[x][y] = new Text(x,y,"1");
            }
        }

   /* matrixOfCells[xAxis][yAxis].

        Cell cell = grid.getMatrixOfCells()[pointer.getX()][pointer.getY()];*/
    }

}

/*
    private Rectangle toolWindow;
    private int tools = 8;
    private int toolPixelSize = 20;
    private Rectangle[] toolPixels = new Rectangle[tools];
    private Text[] toolPixelsText = new Text[tools];

    private int maxCols = 40;
    private int maxRows = 50;

    private Pixels[][] pixels = new Pixels[maxRows][maxCols];
    private Cursor cursor;

    private boolean spacePressed = false;
    private boolean ePressed = false;

    public Grid() throws IOException {


        Inputs.setInputScreen(this);
        grid = new Rectangle(PADDING, PADDING, maxCols * PIXEL_SIZE, maxRows * PIXEL_SIZE);
        grid.draw();
        pixelPlacement();
        tools();
        cursorInit();
        load();
    }

    private void tools() {
        toolWindow = new Rectangle(grid.getWidth() + PIXEL_SIZE, grid.getX(), toolPixelSize, toolPixelSize * tools);

        for (int i = 0; i < tools; i++) {
            toolPixels[i] = new Rectangle(toolWindow.getX(), toolWindow.getY() + (i * toolPixelSize), toolPixelSize, toolPixelSize);
            toolPixels[i].draw();
        }

        toolPixels[0].setColor(Color.BLACK);
        toolPixels[1].setColor(Color.BLUE);
        toolPixels[2].setColor(Color.RED);
        toolPixels[3].setColor(Color.GREEN);

        toolPixels[0].fill();
        toolPixels[1].fill();
        toolPixels[2].fill();
        toolPixels[3].fill();

        toolPixelsText[0] = new Text(toolPixels[0].getX() + (toolPixelSize / 3), toolPixels[0].getY() + (toolPixelSize / 10), "1");
        toolPixelsText[1] = new Text(toolPixels[1].getX() + (toolPixelSize / 3), toolPixels[1].getY() + (toolPixelSize / 10), "2");
        toolPixelsText[2] = new Text(toolPixels[2].getX() + (toolPixelSize / 3), toolPixels[2].getY() + (toolPixelSize / 10), "3");
        toolPixelsText[3] = new Text(toolPixels[3].getX() + (toolPixelSize / 3), toolPixels[3].getY() + (toolPixelSize / 10), "4");

        toolPixelsText[4] = new Text(toolPixels[4].getX() + (toolPixelSize / 3), toolPixels[4].getY() + (toolPixelSize / 10), "D");
        toolPixelsText[5] = new Text(toolPixels[5].getX() + (toolPixelSize / 3) + 1, toolPixels[5].getY() + (toolPixelSize / 10), "S");
        toolPixelsText[6] = new Text(toolPixels[6].getX() + (toolPixelSize / 3) + 1, toolPixels[6].getY() + (toolPixelSize / 10), "L");
        toolPixelsText[7] = new Text(toolPixels[7].getX() + (toolPixelSize / 3) + 1, toolPixels[7].getY() + (toolPixelSize / 10), "E"); //erase


        toolPixelsText[0].setColor(Color.WHITE);
        toolPixelsText[1].setColor(Color.WHITE);
        toolPixelsText[2].setColor(Color.WHITE);
        toolPixelsText[3].setColor(Color.BLACK);

        for (int i = 0; i < tools; i++) {
            toolPixelsText[i].draw();
        }

        toolWindow.draw();


    }*/




