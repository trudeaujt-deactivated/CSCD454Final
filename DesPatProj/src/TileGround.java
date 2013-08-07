import java.util.Random;

public class TileGround implements Tile {
    
    private char glyph;
    private int coordinate_x, coordinate_y;
    
    public TileGround() {
        
        Random rand = new Random(); 
        int randomNumber;
        
        randomNumber = rand.nextInt(4);
        
        if(randomNumber == 0)
            glyph = '.';
        
        else if(randomNumber == 1)
            glyph = ',';
        
        else if(randomNumber == 2)
            glyph = '\'';
        
        else if(randomNumber == 3)
            glyph = '`';
        
    }
    
    public TileGround(char glyph) {

        this.glyph = glyph;
        
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
    
    @Override
    public void interact() {}

    //the ground cannot move
    @Override
    public void moveNorth() {
        
        throw new UnsupportedOperationException("Ground cannot move");
        
    }

    @Override
    public void moveSouth() {
        
        throw new UnsupportedOperationException("Ground cannot move");
        
    }

    @Override
    public void moveEast() {
        
        throw new UnsupportedOperationException("Ground cannot move");
        
    }

    @Override
    public void moveWest() {
        
        throw new UnsupportedOperationException("Ground cannot move");
        
    }

}
