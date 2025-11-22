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
    
    public int gemCount = 0;
    
    //private int frames = 0;
    
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
        DodoWorld world = (DodoWorld) getWorld();
        if (!isTouching(rock.class)) {
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
        if (isTouching(rock.class)) {
            if (Greenfoot.isKeyDown("d")) {
                move (-2);
            }
            if (Greenfoot.isKeyDown("a")) {
                move (+2);
            }
            if (Greenfoot.isKeyDown("w")) {
                setLocation(getX(), getY() + 2);
            }
            if (Greenfoot.isKeyDown("s")) {
                setLocation(getX(), getY() - 2);
            }
        }
        if (isTouching(hunter.class)) {
            //getWorld().showText("I'm dead!", getX(), getY() - 20);
            world.lose();
            Greenfoot.stop();
        }
        if (isTouching(gem.class)) {
            gemCount++;
            getWorld().showText("Got gem " + gemCount + "!", getX(), getY() - 20);
        }
        
    }
    
}
