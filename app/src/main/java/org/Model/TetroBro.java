package org.Model;

import java.awt.Point;
import java.util.List;
import java.util.ArrayList;




public abstract class TetroBro
{
    public enum Type
    {
        I,
        J,
        L,
        O,
        S,
        T,
        Z;
    }

    public enum Rotation // 0-0, 1-90, 2-180, 3-270
    {
        ZERO(0),
        CW_90(1),
        CW_180(2),
        CW_270(3);
        final int index;
        Rotation(int i) {this.index = i;}
        public Rotation next()
        {
            int n = values().length;
            return values()[(index + 1) % values().length];
        }
    }

    protected final Type type;
    protected final int[][][] cells; //[rotation][block][x,y]
    protected int x,y;
    protected Rotation rotation = Rotation.ZERO; //default = zero




    protected TetroBro(Type type, int[][][] cells, int x, int y)
    {
        this.type = type;
        this.cells = cells;
        this.x = x;
        this.y = y;
    }

    public Type getType() {return type;}
    public int getX() {return x;}
    public int getY() {return y;}
    public Rotation getRotation() {return rotation;}

    public List<Point> occupiedCells()
    {
        return occupiedCells(x,y, rotation); // calls the method for our current x,y, rotation
    }

    public List<Point> occupiedCells(int posX, int posY, Rotation rotation) //calculates occupied cells for ANY x, y, rotation
    {
        int[][] blocks = cells[rotation.index];
        List<Point> output = new ArrayList<>(blocks.length);
        for(int[] c : blocks) {output.add(new Point(posX + c[0], posY + c[1]));}
        return output;
    }



    public void move(int delta_x, int delta_y)
    {
        x += delta_x;
        y += delta_y;
    }
    public void rotate()
    {
        rotation = rotation.next();
    }
}


