import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gem extends Actor
{
    /**
     * Act - do whatever the gem wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int gemCount = 0;
    
    public void act()
    {
        // Add your action code here. 
        if (isTouching(Dodo.class)) {
            collect();
        }
    }
    private void collect() {
        DodoWorld world = (DodoWorld) getWorld();
        world.increaseGemCount(); // update the world's gem count
        getWorld().removeObject(this); 
        
    }
}
