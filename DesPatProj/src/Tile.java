public abstract class Tile {

    // TODO add x and y values, so the object knows where it is
    
    private char glyph;
    private int coordinate_x, coordinate_y;
    
    public Tile(char glyph) {
        
        this.glyph = glyph;
        
    }
    
    public char display() {
        
        return this.glyph;
        
    }
    
    public int getCoordinateX() {
        
        return coordinate_x;
        
    }
    
    public int getCoordinateY() {
        
        return coordinate_y;
        
    }

    public void setCoordinates(int index_x, int index_y) {

        coordinate_x = index_x;
        coordinate_y = index_y;
        
    }
    
}
