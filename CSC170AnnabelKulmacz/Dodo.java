import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dodo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dodo extends Actor
{
    /**
     * Act - do whatever the Dodo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Dodo()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 200, image.getHeight() - 200);
        setImage(image);
    }
 
    //  rest of class

    public void act()
    {
        // Add your action code here.
        
        if (Greenfoot.isKeyDown("d")) {
            move (2);
        }
        if (Greenfoot.isKeyDown("a")) {
            move (-2);
        }
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 2);
        }
        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 2);
        }
    }
}
