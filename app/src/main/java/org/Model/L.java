package org.Model;
public class L extends TetroBro
{
    private static final int[][][] SHAPES = {
        {{2, 0}, {0, 1}, {1, 1}, {2, 1}}, // 0
        {{0, 0}, {0, 1}, {0, 2}, {1, 2}}, // 90
        {{0, 0}, {1, 0}, {2, 0}, {0, 1}}, // 180
        {{0, 0}, {1, 0}, {1, 1}, {1, 2}} // 270
    };




    public L(int x, int y)
    {
        super(Type.L, SHAPES, x, y);
    }
}
