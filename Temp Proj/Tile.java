public interface Tile {
        
    public char display();
    
    public int getCoordinateX();
    
    public int getCoordinateY();

    public void setCoordinates(int index_x, int index_y);
    
    public void interact();
    
    public void moveNorth();
    
    public void moveSouth();
    
    public void moveEast();
    
    public void moveWest();
    
}
