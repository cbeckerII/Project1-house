/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square grass;
    private Square sky;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        grass = new Square();
        grass.changeColor("green");
        grass.moveHorizontal(0);
        grass.moveVertical(240);
        grass.changeSize(800);
        grass.makeVisible();
        
        sky = new Square();
        sky.changeColor("blue");
        sky.moveHorizontal(0);
        sky.moveVertical(-560);
        sky.changeSize(800);
        sky.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (grass != null)   // only if it's painted already...
        {
            grass.changeColor("black");
            sky.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (grass != null)   // only if it's painted already...
        {
            grass.changeColor("green");
            sky.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
