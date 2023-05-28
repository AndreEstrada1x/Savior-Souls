import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Actor
{
    
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveAndTurn();
        eat();
    }
    
    public void moveAndTurn()
    {
        move (4);
        
        if (Greenfoot. isKeyDown ("left"))
        {
            turn (-3);
        }
        if (Greenfoot. isKeyDown ("right"))
        {
            turn (3);  
        }
    }
    
    public void eat()
    {
        Actor worm;
        worm = getOneObjectAtOffset (0, 0, worm.class);
        if (worm != null)
        {
        World world;
        world = getWorld();
        world. removeObject (worm);
        }
        Actor CopyOfworm;
        CopyOfworm = getOneObjectAtOffset (0, 0, CopyOfworm.class);
        if (CopyOfworm != null)
        {
        World world;
        world = getWorld();
        world. removeObject (CopyOfworm);
        }
    } 
    
    public Crab()
    {
        GreenfootImage myImage = getImage () ;
        int myNewHeight = (int)myImage.getHeight () /4;
        int myNewWidth = (int)myImage.getWidth () /4;
        myImage.scale (myNewWidth, myNewHeight);
    }
}
