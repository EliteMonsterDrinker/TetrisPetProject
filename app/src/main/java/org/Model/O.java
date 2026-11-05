package org.Model;
public class O extends TetroBro
{
    private static final int[][][] SHAPES = {
        {{0, 0}, {1, 0}, {0, 1}, {1,1}}, //0
        {{0, 0}, {1, 0}, {0, 1}, {1,1}}, // 90
        {{0, 0}, {1, 0}, {0, 1}, {1,1}}, // 180
        {{0, 0}, {1, 0}, {0, 1}, {1,1}} //270
    };




    public O(int x, int y)
    {
        super(Type.O, SHAPES, x, y);
    }
}
