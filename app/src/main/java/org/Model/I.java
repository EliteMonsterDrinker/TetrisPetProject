package org.Model;
public class I extends TetroBro
{
    private static final int[][][] SHAPES = {
        {{0, 0}, {0, 1}, {0, 2}, {0,3}}, //0
        {{0,0}, {1, 0}, {2, 0}, {3, 0}}, // 90
        {{0, 0}, {0, 1}, {0, 2}, {0,3}}, // 180
        {{0,0}, {1,0}, {2,0}, {3,0}} //270
    };




    public I(int x, int y)
    {
        super(Type.I, SHAPES, x, y);
    }
}
