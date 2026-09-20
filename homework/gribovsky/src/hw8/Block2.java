package hw8;

public class Block2 {
    private int[] sides;

    public Block2(int[] sides) {
        this.sides = sides;
    }

    public int getWidth(){
        return sides[0];
    }

    public int getLength(){
        return sides[1];
    }

    public int getHeight(){
        return sides[2];
    }

    public int getVolume(){
      return getHeight()*getWidth()*getLength();
    }

    public int getSurfaceArea(){
        return 2*(getLength()*getHeight() + getLength()*getWidth() + getHeight()*getWidth());
    }
}
