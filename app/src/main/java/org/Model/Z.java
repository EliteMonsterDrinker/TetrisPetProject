package org.Model;
public class Z extends TetroBro
{
    private static final int[][][] SHAPES = {
        {{0, 0}, {1, 0}, {1, 1}, {2, 1}}, // 0
        {{1, 0}, {0, 1}, {1, 1}, {0, 2}}, // 90
        {{0, 0}, {1, 0}, {1, 1}, {2, 1}}, // 180
        {{1, 0}, {0, 1}, {1, 1}, {0, 2}}  // 270
    };



    public Z(int x, int y)
    {
        super(Type.Z, SHAPES, x, y);
    }
}
