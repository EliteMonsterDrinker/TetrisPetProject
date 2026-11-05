package org.Model;
public class S extends TetroBro
{
    private static final int[][][] SHAPES = {
        {{1, 0}, {2, 0}, {0, 1}, {1, 1}}, // 0
        {{0, 0}, {0, 1}, {1, 1}, {1, 2}}, // 90
        {{1, 0}, {2, 0}, {0, 1}, {1, 1}}, // 180
        {{0, 0}, {0, 1}, {1, 1}, {1, 2}}  // 270
    };




    public S(int x, int y)
    {
        super(Type.S, SHAPES, x, y);
    }
}
