import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hunter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hunter extends Actor
{
    /**
     * Act - do whatever the hunter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int move = 1;
    public void act()
    {
        DodoWorld world = (DodoWorld) getWorld();
        // Add your action code here.
        if (move == 1) {
            walkRight();
            if (getX() >= 496) {
                move = 2;
            }
        } 
        else if (move == 2) {
            walkDown();
            if (getY() >= 362) {
                move = 3;
            }
        }
        else if (move == 3) {
            walkLeft();
            if (getX() <= 33) {
                move = 4;
            }
        }
        else if (move == 4) {
            walkUp();        
            if (getY() <= 288) {
                move = 1;
            }
        }
    
    }
    public void walkRight() {
            //way = "right";
            move(3);
    }
    public void walkLeft() {
        move(-3);
    }
    public void walkUp() {
        setLocation(getX(), getY() - 3);
    }
    public void walkDown() {
        setLocation(getX(), getY() + 3);
    }
    
}
