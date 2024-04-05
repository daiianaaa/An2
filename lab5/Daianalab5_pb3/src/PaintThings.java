class PaintThings implements Paint {
    static public float computePaint(float surface)
    {
        surface*=Paint.paintPerUnitSurface;
        return surface;
    }

}
