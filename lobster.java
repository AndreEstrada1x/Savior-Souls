import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class lobster extends Actor
{
    public void act ()
    {
        moveAround();
        eat ();
    }
    public void moveAround ()
    {
        move (4);
        if (Greenfoot.getRandomNumber (100) < 10)
        {
            turn (Greenfoot.getRandomNumber (90) - 45) ;
        }
        if (getX() <= 5 || getX() >= getWorld() .getWidth() - 5)
        {
            turn (180);
        }
        if (getY () <= 5 || getY() >= getWorld() .getHeight() - 5)
        {
            turn (180);
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
    public lobster()
    {
        GreenfootImage myImage = getImage () ;
        int myNewHeight = (int)myImage.getHeight () /4;
        int myNewWidth = (int)myImage.getWidth () /4;
        myImage.scale (myNewWidth, myNewHeight);
    }
}
