import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aa extends Actor
{
    GifImage myGif = new GifImage("aa.gif");
    /**
     * Act - do whatever the ccv wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        eat();// Add your action code here.
        setImage(myGif.getCurrentImage());
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
