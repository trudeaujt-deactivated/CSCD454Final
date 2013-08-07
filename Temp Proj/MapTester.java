public class MapTester {

    public static void main(final String[] arguments) {

        TwoDMap theMap = new TwoDMap();
        
        theMap.add(8, 3, new TileTestMonster());
        theMap.add(2, 4, new TileTestMonster());
        
        int i;
        
        for(i = 1; i < 29; i++)
            theMap.add(i, 0, new TileTestUTF('═'));
        for(i = 1; i < 14; i++)
            theMap.add(0, i, new TileTestUTF('║'));
        for(i = 1; i < 14; i++)
            theMap.add(29, i, new TileTestUTF('║'));
        for(i = 1; i < 13; i++)
            theMap.add(i, 14, new TileTestUTF('═'));
        for(i = 17; i < 29; i++)
            theMap.add(i, 14, new TileTestUTF('═'));
        
        theMap.add(0,  0,   new TileTestUTF('╔'));
        theMap.add(0,  14,  new TileTestUTF('╚'));
        theMap.add(29, 0,   new TileTestUTF('╗'));
        theMap.add(29, 14,  new TileTestUTF('╝'));
        
        theMap.display();
        
        theMap.remove(8, 3);
        theMap.remove(2, 4);
        theMap.display();

    }

}
