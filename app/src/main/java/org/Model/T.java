package org.Model;
public class T extends TetroBro
{
    private static final int[][][] SHAPES = {
        {{0, 0}, {1, 0}, {2, 0}, {1, 1}}, // 0
        {{1, 0}, {0, 1}, {1, 1}, {1, 2}}, // 90
        {{1, 0}, {0, 1}, {1, 1}, {2, 1}}, // 180
        {{0, 0}, {0, 1}, {1, 1}, {0, 2}}  // 270
    };




    public T(int x, int y)
    {
        super(Type.T, SHAPES, x, y);
    }
}
