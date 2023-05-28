import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gold extends Actor
{
    public void act ()
    {
        moveAround();
        eat ();
    }
    public void moveAround ()
    {
        move (15);
        if (Greenfoot.getRandomNumber (100) < 10)
        {
            turn (Greenfoot.getRandomNumber (90) - 45) ;
        }
        
        {
            turn (175);
        }
        
        {
            turn (175);
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
    public gold()
    {
        GreenfootImage myImage = getImage () ;
        int myNewHeight = (int)myImage.getHeight () /2;
        int myNewWidth = (int)myImage.getWidth () /2;
        myImage.scale (myNewWidth, myNewHeight);
    }
}
