import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DodoWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public DodoWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Dodo dodo = new Dodo();
        addObject(dodo,146,148);
        dodo.setLocation(56,55);
        dodo.setLocation(149,157);
        dodo.setLocation(149,157);
        rock rock = new rock();
        addObject(rock,30,35);
        rock rock2 = new rock();
        addObject(rock2,89,33);
        rock rock3 = new rock();
        addObject(rock3,159,34);
        rock rock4 = new rock();
        addObject(rock4,232,35);
        rock rock5 = new rock();
        addObject(rock5,308,29);
        rock rock6 = new rock();
        addObject(rock6,376,28);
        rock rock7 = new rock();
        addObject(rock7,377,94);
        rock rock8 = new rock();
        addObject(rock8,379,168);
        rock rock9 = new rock();
        addObject(rock9,376,225);
        rock rock10 = new rock();
        addObject(rock10,441,26);
        rock rock11 = new rock();
        addObject(rock11,491,24);
        rock rock12 = new rock();
        addObject(rock12,566,23);
        rock rock13 = new rock();
        addObject(rock13,570,86);
        rock rock14 = new rock();
        addObject(rock14,569,188);
        rock rock15 = new rock();
        addObject(rock15,572,127);
        rock rock16 = new rock();
        addObject(rock16,571,244);
        rock rock17 = new rock();
        addObject(rock17,577,366);
        rock rock18 = new rock();
        addObject(rock18,566,428);
        rock rock19 = new rock();
        addObject(rock19,568,499);
        rock rock20 = new rock();
        addObject(rock20,567,571);
        rock rock21 = new rock();
        addObject(rock21,484,568);
        rock rock22 = new rock();
        addObject(rock22,432,572);
        rock rock23 = new rock();
        addObject(rock23,377,569);
        rock rock24 = new rock();
        addObject(rock24,370,514);
        rock rock25 = new rock();
        addObject(rock25,365,436);
        rock rock26 = new rock();
        addObject(rock26,449,430);
        rock rock27 = new rock();
        addObject(rock27,447,223);
        rock rock28 = new rock();
        addObject(rock28,364,369);
        rock rock29 = new rock();
        addObject(rock29,286,369);
        rock rock30 = new rock();
        addObject(rock30,197,369);
        rock rock31 = new rock();
        addObject(rock31,199,431);
        rock rock32 = new rock();
        addObject(rock32,190,497);
        rock rock33 = new rock();
        addObject(rock33,260,505);
        rock rock34 = new rock();
        addObject(rock34,136,363);
        rock rock35 = new rock();
        addObject(rock35,72,361);
        rock rock36 = new rock();
        addObject(rock36,95,95);
        rock rock37 = new rock();
        addObject(rock37,99,159);
        rock rock38 = new rock();
        addObject(rock38,90,234);
        gem gem = new gem();
        addObject(gem,441,90);
        gem gem2 = new gem();
        addObject(gem2,428,493);
        gem gem3 = new gem();
        addObject(gem3,258,436);
        gem gem4 = new gem();
        addObject(gem4,230,151);
        dodo.setLocation(32,104);
        dodo.setLocation(161,314);
        gem4.setLocation(32,89);
        dodo.setLocation(232,156);
        rock28.setLocation(376,370);
        rock28.setLocation(370,370);
        removeObject(rock28);
        rock33.setLocation(103,485);
        removeObject(rock33);
        gem3.setLocation(283,491);
        rock29.setLocation(281,428);
        rock34.setLocation(135,444);
        rock30.setLocation(133,390);
        rock30.setLocation(131,363);
        rock34.setLocation(132,428);
        rock32.setLocation(127,535);
        removeObject(rock32);
        rock35.setLocation(153,230);
        rock30.setLocation(133,502);
        rock35.setLocation(149,239);
        boat boat = new boat();
        addObject(boat,573,304);
        hunter hunter = new hunter();
        addObject(hunter,458,290);
    }
}
