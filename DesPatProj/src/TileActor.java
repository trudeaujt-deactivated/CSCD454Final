public class TileActor implements Tile {

    private char glyph;
    private int coordinate_x, coordinate_y;
    private Tileable actor;
    
    public TileActor() {
        
        this.glyph = '?';
        
    }
    
    public TileActor(char glyph) {

        this.glyph = glyph;
        
    }
    
    public TileActor(char glyph, Tileable newTile) {
        
        this.glyph = glyph;
        this.actor = newTile;
        
    }
    
    public Tileable getActor(){
    	return actor;
    }
    @Override
    public char display() {

        return glyph;
        
    }

    @Override
    public int getCoordinateX() {

        return coordinate_x;
        
    }

    @Override
    public int getCoordinateY() {

        return coordinate_y;
        
    }

    @Override
    public void setCoordinates(int index_x, int index_y) {

        coordinate_x = index_x;
        coordinate_y = index_y;
        
    }

}
