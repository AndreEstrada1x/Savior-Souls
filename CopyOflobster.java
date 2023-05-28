import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CopyOflobster extends Actor
{
    public void act ()
    {
        moveAround();
        eat ();
    }
    public void moveAround ()
    {
        
        turn (180);
        turn(200);
        
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
    public CopyOflobster()
    {
        GreenfootImage myImage = getImage () ;
        int myNewHeight = (int)myImage.getHeight () /2;
        int myNewWidth = (int)myImage.getWidth () /2;
        myImage.scale (myNewWidth, myNewHeight); 
    }
}
