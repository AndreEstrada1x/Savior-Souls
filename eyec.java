import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class eyec here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class eyec extends Actor
{
    GifImage myGif = new GifImage("eye.gif");
    /**
     * Act - do whatever the eyec wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(myGif.getCurrentImage());
        eat();
    }
     public void eat()
    {
        Actor crab;
        crab = getOneObjectAtOffset (2, 2, Crab.class);
        if (crab != null)
        {
            World world;
            world = getWorld();
            world. removeObject(crab);
            Greenfoot.playSound ("eating.wav");
        }
    }
}
