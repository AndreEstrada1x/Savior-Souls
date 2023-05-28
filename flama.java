import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flama extends Actor
{
    int X_MOVE = 4;
    int Y_MOVE = 25;
    GifImage myGif = new GifImage("flama.gif");
    public void act ()
    {
        setImage(myGif.getCurrentImage());
        moveAround();
        eat ();
    }
    public void moveAround ()
    {
        //Move the alien horizontally
        setLocation(getX() + X_MOVE, getY ());
        //If it hits the wall, make it bounce horizontally and move
        if ( (getX() >= 590) || (getX() <= 18) )
        {
            X_MOVE = X_MOVE * -1;
            setLocation(getX(), getY () + Y_MOVE);
        }
    }
    public void eat()
    {
        Actor crab;
        crab = getOneObjectAtOffset (0, 0, Crab.class);
        if (crab != null)
        {
            World world;
            world = getWorld();
            world. removeObject(crab);
            Greenfoot.playSound ("eating.wav");
        }
    }
}
