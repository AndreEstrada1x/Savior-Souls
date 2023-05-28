import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ala2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ala2 extends Actor
{
    GifImage myGif = new GifImage("ala2.gif");
    /**
     * Act - do whatever the ala wants to do. This method is called whenever
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
    public ala2()
    {
    }
}
