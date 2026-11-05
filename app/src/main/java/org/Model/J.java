package org.Model;
public class J extends TetroBro
{
    private static final int[][][] SHAPES = {
        {{0, 0}, {0, 1}, {1, 1}, {2, 1}}, // 0
        {{0, 0}, {1, 0}, {0, 1}, {0, 2}}, // 90
        {{0, 0}, {1, 0}, {2, 0}, {2, 1}}, // 180
        {{1, 0}, {1, 1}, {0, 2}, {1, 2}}  // 270
    };




    public J(int x, int y)
    {
        super(Type.J, SHAPES, x, y);
    }
}
